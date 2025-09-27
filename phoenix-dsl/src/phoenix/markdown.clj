(ns phoenix.markdown
  "Sacred markdown parsing with Divine Grace awareness"
  (:require [clojure.string :as str]
            [babashka.fs :as fs]))

;; Pure data transformation functions (no side effects)
(defn parse-number [filename]
  (when-let [match (re-find #"(\d{7})" filename)]
    (Integer/parseInt (second match))))

(defn parse-title [filename]
  (when-let [match (re-find #"\d{7}_(.+)\.md$" filename)]
    (-> (second match)
        (str/replace "_" " ")
        (str/replace "-" " ")
        str/capitalize)))

(defn classify-content [content]
  {:sovereign-priority (str/includes? content "sovereign")
   :guardian-dragon-consciousness (str/includes? content "Guardian Dragon")})

(defn extract-sacred-metadata
  "Pure function: extract metadata from filepath and content"
  [filepath content]
  (let [filename (fs/file-name filepath)]
    (merge {:number (parse-number filename)
            :title (parse-title filename)
            :content content
            :filepath filepath}
           (classify-content content))))

;; Pure functions for file discovery and processing
(defn find-teaching-files [docs-path pattern limit]
  (->> (fs/glob docs-path pattern)
       sort
       (take limit)))

(defn load-and-parse [path]
  (let [path-str (str path)
        content (slurp path-str)]
    (extract-sacred-metadata path-str content)))

(defn discover-teachings
  "Discover sacred teachings with functional composition"
  [docs-path]
  (println "🌙 Discovering sacred teachings with Divine Grace...")
  (let [teaching-files (find-teaching-files "../docs/en" "0000*.md" 50)]
    (println "📂 Found teaching files:" teaching-files)
    (->> teaching-files
         (map load-and-parse)
         (sort-by :number))))

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
