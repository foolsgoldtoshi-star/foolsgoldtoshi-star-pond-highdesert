(ns phoenix.svelte
  "Sacred Svelte component generation with Divine Grace"
  (:require [clojure.string :as str]
            [phoenix.markdown :as md]
            [phoenix.spec :as spec]))

;; Pure string transformation pipeline
(defn sanitize-title [title]
  (-> title
      (str/replace #"[^a-zA-Z0-9\s]" "")
      (str/replace #"\s+" "_")
      (str/replace #"_+" "_")
      str/trim))

(defn teaching-to-component-name [title]
  (str "Teaching_" (sanitize-title title)))

;; Decomposed template generation - simple, composable functions
(defn build-script-section [{:keys [title number guardian-dragon-consciousness sovereign-priority]}]
  (str "<script>\n"
       "  export let title = \"" title "\";\n"
       "  export let number = " number ";\n"
       "  export let guardianDragon = " guardian-dragon-consciousness ";\n"
       "  export let sovereign = " sovereign-priority ";\n"
       "</script>"))

(defn build-markup-section []
  (str "<article class=\"sacred-teaching\" class:guardian-dragon={guardianDragon} class:sovereign={sovereign}>\n"
       "  <header class=\"teaching-header\">\n"
       "    <div class=\"teaching-number\">{number:0>7}</div>\n"
       "    <h1 class=\"teaching-title\">{title}</h1>\n"
       "    <div class=\"teaching-badges\">\n"
       "      {#if guardianDragon}\n"
       "        <span class=\"badge guardian-dragon\">🐲 Guardian Dragon</span>\n"
       "      {/if}\n"
       "      {#if sovereign}\n"
       "        <span class=\"badge sovereign\">👑 Sovereign</span>\n"
       "      {/if}\n"
       "    </div>\n"
       "  </header>\n\n"
       "  <section class=\"teaching-content\">\n"
       "    <div class=\"markdown-content\">\n"
       "      {@html content}\n"
       "    </div>\n"
       "  </section>\n\n"
       "  <footer class=\"teaching-footer\">\n"
       "    <div class=\"teaching-navigation\">\n"
       "      <a href=\"/en/teachings\" class=\"back-link\">← All Teachings</a>\n"
       "      <div class=\"sharing\">\n"
       "        <button class=\"share-btn\" title=\"Share this sacred teaching\">\n"
       "          🔗 Share\n"
       "        </button>\n"
       "      </div>\n"
       "    </div>\n"
       "  </footer>\n"
       "</article>"))

;; Memoized style loading for ecological efficiency
(def style-cache (atom nil))

(defn build-style-section []
  (if-let [cached-styles @style-cache]
    cached-styles
    (let [styles (slurp "../phoenix-dsl/templates/teaching-styles.css")]
      (reset! style-cache styles)
      styles)))

(defn assemble-component [teaching]
  (str "<!-- Generated Sacred Teaching Component with Divine Grace -->\\n"
       (build-script-section teaching) "\\n\\n"
       (build-markup-section) "\\n\\n"
       "<style>\\n" (build-style-section) "</style>\\n"))

(defn generate-teaching-component
  \"Pure function: compose component from small parts\"
  [teaching]
  (let [component-name (teaching-to-component-name (:title teaching))]
    {:component-name component-name
     :file-path (str \"../web-grace/src/lib/generated/\" component-name \".svelte\")
     :content (assemble-component teaching)})))

(defn generate-index-component
  "Generate index component listing all sacred teachings"
  [teachings]
  {:component-name "TeachingsIndex"
   :file-path "../web-grace/src/lib/generated/TeachingsIndex.svelte"
   :content (str "<!-- Sacred Teachings Index with Divine Grace -->\n"
                 "<script>\n"
                 "  export let teachings = " (pr-str (mapv #(select-keys % [:number :title :guardian-dragon-consciousness :sovereign-priority]) teachings)) ";\n"
                 "</script>\n\n"
                 "<div class=\"teachings-index\">\n"
                 "  <header>\n"
                 "    <h1>Sacred Teachings Index</h1>\n"
                 "    <p>Divine Grace wisdom for Guardian Dragons</p>\n"
                 "  </header>\n\n"
                 "  <div class=\"teachings-grid\">\n"
                 "    {#each teachings as teaching}\n"
                 "      <article class=\"teaching-card\" class:guardian-dragon={teaching['guardian-dragon-consciousness']} class:sovereign={teaching['sovereign-priority']}>\n"
                 "        <div class=\"card-number\">{teaching.number:0>7}</div>\n"
                 "        <h3 class=\"card-title\">{teaching.title}</h3>\n"
                 "        <div class=\"card-badges\">\n"
                 "          {#if teaching['guardian-dragon-consciousness']}\n"
                 "            <span class=\"badge guardian-dragon\">🐲</span>\n"
                 "          {/if}\n"
                 "          {#if teaching['sovereign-priority']}\n"
                 "            <span class=\"badge sovereign\">👑</span>\n"
                 "          {/if}\n"
                 "        </div>\n"
                 "        <a href=\"/en/teaching/{teaching.number}\" class=\"read-link\">Read Teaching →</a>\n"
                 "      </article>\n"
                 "    {/each}\n"
                 "  </div>\n"
                 "</div>\n\n"
                 "<style>\n"
                 "  .teachings-index {\n"
                 "    max-width: 1200px;\n"
                 "    margin: 0 auto;\n"
                 "    padding: 2rem;\n"
                 "  }\n\n"
                 "  header {\n"
                 "    text-align: center;\n"
                 "    margin-bottom: 3rem;\n"
                 "  }\n\n"
                 "  header h1 {\n"
                 "    font-size: 3rem;\n"
                 "    color: var(--deep-forest, #2d5016);\n"
                 "    margin-bottom: 1rem;\n"
                 "  }\n\n"
                 "  .teachings-grid {\n"
                 "    display: grid;\n"
                 "    grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));\n"
                 "    gap: 2rem;\n"
                 "  }\n\n"
                 "  .teaching-card {\n"
                 "    background: white;\n"
                 "    border: 2px solid var(--sage-green, #87a96b);\n"
                 "    border-radius: 15px;\n"
                 "    padding: 1.5rem;\n"
                 "    transition: transform 0.3s ease, box-shadow 0.3s ease;\n"
                 "  }\n\n"
                 "  .teaching-card:hover {\n"
                 "    transform: translateY(-5px);\n"
                 "    box-shadow: 0 10px 25px rgba(135, 169, 107, 0.2);\n"
                 "  }\n\n"
                 "  .card-number {\n"
                 "    font-size: 1rem;\n"
                 "    color: var(--jade-aquamarine, #4a9b8e);\n"
                 "    font-weight: 600;\n"
                 "  }\n\n"
                 "  .card-title {\n"
                 "    font-size: 1.3rem;\n"
                 "    margin: 1rem 0;\n"
                 "    color: var(--deep-forest, #2d5016);\n"
                 "    text-transform: capitalize;\n"
                 "  }\n\n"
                 "  .read-link {\n"
                 "    color: var(--jade-aquamarine, #4a9b8e);\n"
                 "    text-decoration: none;\n"
                 "    font-weight: 600;\n"
                 "  }\n\n"
                 "  .teaching-card.guardian-dragon {\n"
                 "    border-color: var(--gold, #d4af37);\n"
                 "  }\n\n"
                 "  .teaching-card.sovereign {\n"
                 "    border-color: var(--royal-purple, #6b46c1);\n"
                 "  }\n"
                 "</style>\n")})

;; Separated side effects - pure I/O operations
(defn ensure-directory [file-path]
  (let [dir (-> file-path (str/split #"/") butlast (->> (str/join "/")))]
    (.mkdirSync (js/require "fs") dir #js {:recursive true})
    dir))

(defn write-file [file-path content]
  (spit file-path content))

(defn write-component-to-file
  "Side effect: write component to filesystem"
  [component]
  (println "📝 Creating directory for:" (:component-name component))
  (ensure-directory (:file-path component))
  (println "✨ Writing component:" (:component-name component))
  (write-file (:file-path component) (:content component))
  component)

;; Functional pipeline - data transformation separated from I/O
(defn transform-teachings [teachings]
  "Pure function: transform teachings into component data"
  (map generate-teaching-component teachings))

(defn add-index-component [teaching-components teachings]
  "Pure function: add index component to collection"
  (conj teaching-components (generate-index-component teachings)))

(defn write-all-components [components]
  "Side effect: write all components to filesystem"
  (doseq [component components]
    (write-component-to-file component))
  components)

(defn generate-all-components
  "Compose pipeline: transform data then perform I/O"
  [teachings]
  (println "🌙 Generating Divine Grace Svelte components...")
  (let [components (->> teachings
                        transform-teachings
                        (add-index-component teachings))]
    (println "📊 Generated" (count components) "components")
    (write-all-components components)
    (println "🎊 All Divine Grace components generated!")
    components))

(defn -main
  "Sacred Svelte generation entry point"
  [& args]
  (println "🔥 Phoenix Svelte Generator: Awakening...")
  (let [teachings (md/discover-teachings "docs/en")
        components (generate-all-components teachings)]
    (println "✨ Generated" (count components) "Svelte components")
    (doseq [component components]
      (println "📄" (:component-name component) "→" (:file-path component)))
    components))