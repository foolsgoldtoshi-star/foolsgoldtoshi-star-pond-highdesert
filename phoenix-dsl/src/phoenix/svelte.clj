(ns phoenix.svelte
  "Sacred Svelte component generation with Divine Grace"
  (:require [clojure.string :as str]
            [hiccup.core :as h]))

(defn generate-svelte-component
  "Generate Svelte component with Divine Grace awareness"
  [{:keys [number title content sovereign-priority guardian-dragon-consciousness]}]
  (let [component-name (str "Teaching" (format "%07d" number))
        safe-title (str/replace title #"[^a-zA-Z0-9\s]" "")
        sovereign-class (if sovereign-priority "sovereign-priority" "humble-service")
        dragon-class (if guardian-dragon-consciousness "guardian-dragon" "")]
    {:component-name component-name
     :svelte-markup (str 
       "<script>\n"
       "  export let title = '" safe-title "';\n"
       "  export let number = " number ";\n"
       "  export let sovereignPriority = " sovereign-priority ";\n"
       "  export let guardianDragon = " guardian-dragon-consciousness ";\n"
       "</script>\n\n"
       "<article class=\"sacred-teaching " sovereign-class " " dragon-class "\">\n"
       "  <header class=\"teaching-header\">\n"
       "    <span class=\"teaching-number\">{number.toString().padStart(7, '0')}</span>\n"
       "    <h1 class=\"teaching-title\">{title}</h1>\n"
       "    {#if sovereignPriority}\n"
       "      <span class=\"sovereign-badge\">👑 Sovereign Priority</span>\n"
       "    {/if}\n"
       "    {#if guardianDragon}\n"
       "      <span class=\"dragon-badge\">🐲 Guardian Dragon</span>\n"
       "    {/if}\n"
       "  </header>\n"
       "  <main class=\"teaching-content\">\n"
       "    {@html content}\n"
       "  </main>\n"
       "  <footer class=\"teaching-navigation\">\n"
       "    <nav class=\"divine-grace-nav\">\n"
       "      <a href=\"/\" class=\"home-link\">🌙 Sacred Home</a>\n"
       "      <a href=\"/teachings\" class=\"teachings-link\">📚 All Teachings</a>\n"
       "    </nav>\n"
       "  </footer>\n"
       "</article>\n\n"
       "<style>\n"
       "  .sacred-teaching { padding: 2rem; max-width: 50ch; margin: 0 auto; }\n"
       "  .sovereign-priority { border-left: 4px solid gold; }\n"
       "  .guardian-dragon { background: linear-gradient(135deg, #4a5568, #2d3748); }\n"
       "  .teaching-header { margin-bottom: 2rem; }\n"
       "  .teaching-number { font-family: 'Fira Code', monospace; opacity: 0.7; }\n"
       "  .teaching-title { font-size: 1.5rem; margin: 0.5rem 0; }\n"
       "  .sovereign-badge, .dragon-badge { \n"
       "    font-size: 0.8rem; padding: 0.25rem 0.5rem; \n"
       "    border-radius: 0.25rem; margin: 0.25rem;\n"
       "  }\n"
       "  .divine-grace-nav { display: flex; gap: 1rem; margin-top: 2rem; }\n"
       "  .divine-grace-nav a { text-decoration: none; padding: 0.5rem 1rem; }\n"
       "</style>")}))

(defn generate-components-with-grace
  "Generate all Svelte components with Divine Grace"
  [validated-teachings]
  (println "🌸 Generating Svelte components with Divine Grace awareness...")
  (map generate-svelte-component validated-teachings))

(defn create-navigation-awareness
  "Create sacred navigation with awareness"
  [components]
  (println "🧭 Creating navigation with contemplative awareness...")
  {:components components
   :navigation {:home "🌙 Sacred Technology Home"
                :teachings "📚 All Sacred Teachings"
                :about "🐲 Guardian Dragon PBC"}})

(defn -main
  "Sacred Svelte generation entry point"
  [& args]
  (println "🔥 Phoenix Svelte Generator: Divine Grace awakening...")
  (println "✨ Ready to transform consciousness data into reactive components"))
