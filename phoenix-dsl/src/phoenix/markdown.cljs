(ns phoenix.markdown
  "Sacred markdown parsing with Divine Grace awareness"
  (:require [clojure.string :as str]
            [babashka.fs :as fs]))

(defn extract-sacred-metadata
  "Extract sacred teaching metadata from filename and content"
  [filepath content]
  (let [filename (fs/file-name filepath)
        number-match (re-find #"(\d{7})" filename)
        number (when number-match (js/parseInt (second number-match)))
        title-match (re-find #"\d{7}_(.+)\.md$" filename)
        title (when title-match 
                (-> (second title-match)
                    (str/replace "_" " ")
                    (str/replace "-" " ")
                    str/capitalize))
        sovereign? (str/includes? content "sovereign")
        guardian-dragon? (str/includes? content "Guardian Dragon")]
    {:number number
     :title title
     :content content
     :filepath filepath
     :sovereign-priority sovereign?
     :guardian-dragon-consciousness guardian-dragon?}))

(defn discover-teachings
  "Discover sacred teachings with Divine Grace awareness"
  [docs-path]
  (println "🌙 Discovering sacred teachings with Divine Grace...")
  (->> (fs/glob docs-path "0000*.md")
       (take 9) ; Focus on NINE first essays
       (map (fn [path]
              ;; Note: ClojureScript doesn't have slurp, need Node.js fs
              (let [fs (js/require "fs")
                    content (.readFileSync fs path "utf8")]
                (extract-sacred-metadata path content))))
       (sort-by :number)))

(defn parse-sacred-teachings
  "Parse teachings into consciousness-serving data structures"
  [teaching-paths]
  (println "📜 Parsing sacred teachings with contemplative attention...")
  (map discover-teachings teaching-paths))

(defn -main
  "Sacred parsing entry point"
  [& args]
  (println "🔥 Phoenix Markdown Parser: Awakening...")
  (let [teachings (discover-teachings "docs/en")]
    (println "✨ Discovered" (count teachings) "sacred teachings")
    (doseq [teaching teachings]
      (println "📖" (:number teaching) "-" (:title teaching)))
    teachings))
