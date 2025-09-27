(ns phoenix.svelte
  "Sacred Svelte component generation with Divine Grace"
  (:require [clojure.string :as str]
            [phoenix.markdown :as md]
            [phoenix.spec :as spec]))

(defn teaching-to-component-name
  "Convert teaching title to Svelte component name"
  [title]
  (-> title
      (str/replace #"[^a-zA-Z0-9\s]" "")
      (str/replace #"\s+" "_")
      (str/replace #"_+" "_")
      str/trim
      (#(str "Teaching_" %))))

(defn generate-teaching-component
  "Generate a beautiful Svelte component for a sacred teaching"
  [teaching]
  (let [component-name (teaching-to-component-name (:title teaching))
        title (:title teaching)
        content (:content teaching)
        number (:number teaching)
        has-guardian-dragon? (:guardian-dragon-consciousness teaching)
        is-sovereign? (:sovereign-priority teaching)]
    {:component-name component-name
     :file-path (str "../web-grace/src/lib/generated/" component-name ".svelte")
     :content (str "<!-- Generated Sacred Teaching Component with Divine Grace -->\n"
                   "<script>\n"
                   "  export let title = \"" title "\";\n"
                   "  export let number = " number ";\n"
                   "  export let guardianDragon = " (if has-guardian-dragon? "true" "false") ";\n"
                   "  export let sovereign = " (if is-sovereign? "true" "false") ";\n"
                   "</script>\n\n"
                   "<article class=\"sacred-teaching\" class:guardian-dragon={guardianDragon} class:sovereign={sovereign}>\n"
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
                   "    <!-- Sacred content rendered with Divine Grace -->\n"
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
                   "</article>\n\n"
                   "<style>\n"
                   "  .sacred-teaching {\n"
                   "    max-width: 800px;\n"
                   "    margin: 0 auto;\n"
                   "    padding: 2rem;\n"
                   "    font-family: 'Crimson Text', serif;\n"
                   "    line-height: 1.6;\n"
                   "    color: var(--text-color, #2d3748);\n"
                   "  }\n\n"
                   "  .teaching-header {\n"
                   "    text-align: center;\n"
                   "    margin-bottom: 3rem;\n"
                   "    padding-bottom: 2rem;\n"
                   "    border-bottom: 2px solid var(--sage-green, #87a96b);\n"
                   "  }\n\n"
                   "  .teaching-number {\n"
                   "    font-size: 1.2rem;\n"
                   "    color: var(--jade-aquamarine, #4a9b8e);\n"
                   "    font-weight: 600;\n"
                   "    margin-bottom: 0.5rem;\n"
                   "  }\n\n"
                   "  .teaching-title {\n"
                   "    font-size: 2.5rem;\n"
                   "    margin: 0.5rem 0;\n"
                   "    color: var(--deep-forest, #2d5016);\n"
                   "    text-transform: capitalize;\n"
                   "  }\n\n"
                   "  .teaching-badges {\n"
                   "    display: flex;\n"
                   "    justify-content: center;\n"
                   "    gap: 1rem;\n"
                   "    margin-top: 1rem;\n"
                   "  }\n\n"
                   "  .badge {\n"
                   "    padding: 0.5rem 1rem;\n"
                   "    border-radius: 20px;\n"
                   "    font-size: 0.9rem;\n"
                   "    font-weight: 600;\n"
                   "  }\n\n"
                   "  .badge.guardian-dragon {\n"
                   "    background: linear-gradient(135deg, #d4af37, #ffd700);\n"
                   "    color: #2d1810;\n"
                   "  }\n\n"
                   "  .badge.sovereign {\n"
                   "    background: linear-gradient(135deg, #6b46c1, #a855f7);\n"
                   "    color: white;\n"
                   "  }\n\n"
                   "  .teaching-content {\n"
                   "    margin-bottom: 3rem;\n"
                   "  }\n\n"
                   "  .markdown-content {\n"
                   "    font-size: 1.1rem;\n"
                   "    line-height: 1.8;\n"
                   "  }\n\n"
                   "  .teaching-footer {\n"
                   "    border-top: 2px solid var(--sage-green, #87a96b);\n"
                   "    padding-top: 2rem;\n"
                   "  }\n\n"
                   "  .teaching-navigation {\n"
                   "    display: flex;\n"
                   "    justify-content: space-between;\n"
                   "    align-items: center;\n"
                   "  }\n\n"
                   "  .back-link {\n"
                   "    color: var(--jade-aquamarine, #4a9b8e);\n"
                   "    text-decoration: none;\n"
                   "    font-weight: 600;\n"
                   "    transition: color 0.3s ease;\n"
                   "  }\n\n"
                   "  .back-link:hover {\n"
                   "    color: var(--sage-green, #87a96b);\n"
                   "  }\n\n"
                   "  .share-btn {\n"
                   "    background: var(--jade-aquamarine, #4a9b8e);\n"
                   "    color: white;\n"
                   "    border: none;\n"
                   "    padding: 0.5rem 1rem;\n"
                   "    border-radius: 20px;\n"
                   "    cursor: pointer;\n"
                   "    transition: background 0.3s ease;\n"
                   "  }\n\n"
                   "  .share-btn:hover {\n"
                   "    background: var(--sage-green, #87a96b);\n"
                   "  }\n\n"
                   "  /* Guardian Dragon styling */\n"
                   "  .sacred-teaching.guardian-dragon {\n"
                   "    border: 3px solid var(--gold, #d4af37);\n"
                   "    box-shadow: 0 0 20px rgba(212, 175, 55, 0.3);\n"
                   "  }\n\n"
                   "  /* Sovereign styling */\n"
                   "  .sacred-teaching.sovereign {\n"
                   "    border: 3px solid var(--royal-purple, #6b46c1);\n"
                   "    box-shadow: 0 0 20px rgba(107, 70, 193, 0.3);\n"
                   "  }\n\n"
                   "  /* Dark theme support */\n"
                   "  @media (prefers-color-scheme: dark) {\n"
                   "    .sacred-teaching {\n"
                   "      color: #e2e8f0;\n"
                   "      background: #1a202c;\n"
                   "    }\n"
                   "    \n"
                   "    .teaching-title {\n"
                   "      color: #a7f3d0;\n"
                   "    }\n"
                   "  }\n"
                   "</style>\n")}))

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

(defn write-component-to-file
  "Write Svelte component to file system"
  [component]
  (let [dir (-> (:file-path component) 
                (str/split #"/") 
                butlast 
                (->> (str/join "/")))]
    (println "📝 Creating directory:" dir)
    (js/require "fs").mkdirSync dir #js {:recursive true})
    (println "✨ Writing component:" (:component-name component))
    (spit (:file-path component) (:content component))
    component))

(defn generate-all-components
  "Generate all Svelte components from sacred teachings"
  [teachings]
  (println "🌙 Generating Divine Grace Svelte components...")
  (let [teaching-components (map generate-teaching-component teachings)
        index-component (generate-index-component teachings)
        all-components (conj teaching-components index-component)]
    (println "📊 Generated" (count all-components) "components")
    (doseq [component all-components]
      (write-component-to-file component))
    (println "🎊 All Divine Grace components generated!")
    all-components))

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