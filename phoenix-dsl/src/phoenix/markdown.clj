(ns phoenix.markdown
  "Sacred markdown parsing with Divine Grace awareness"
  (:require [clojure.string :as str]
            [babashka.fs :as fs]))

;; Ecological efficiency through intelligent caching
(def teaching-cache (atom {}))

(defn cache-key 
  "Generate cache key from filepath and modification time"
  [filepath]
  (str filepath "-" (.lastModified (java.io.File. filepath))))

;; Pure data transformation functions (no side effects)
(defn parse-number 
  "Extract teaching number from filename"
  [filename]
  (when-let [match (re-find #"(\d{7})" filename)]
    (Integer/parseInt (second match))))

(defn parse-title 
  "Extract and format title from filename"
  [filename]
  (when-let [match (re-find #"\d{7}_(.+)\.md$" filename)]
    (-> (second match)
        (str/replace "_" " ")
        (str/replace "-" " ")
        str/capitalize)))

(defn classify-content 
  "Classify content by presence of key terms"
  [content]
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
(defn find-teaching-files 
  "Find teaching files matching pattern with limit"
  [docs-path pattern limit]
  (->> (fs/glob docs-path pattern)
       sort
       (take limit)))

(defn load-and-parse 
  "Load file content and parse metadata with caching"
  [path]
  (let [path-str (str path)
        key (cache-key path-str)]
    (if-let [cached-result (get @teaching-cache key)]
      (do (println "♻️ Using cached result for:" (fs/file-name path-str))
          cached-result)
      (let [content (slurp path-str)
            result (extract-sacred-metadata path-str content)]
        (swap! teaching-cache assoc key result)
        (println "🌱 Parsed and cached:" (fs/file-name path-str))
        result))))

(defn discover-teachings
  "Discover sacred teachings with functional composition"
  [_docs-path]
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
  [& _args]
  (println "🔥 Phoenix Markdown Parser: Awakening...")
  (let [teachings (discover-teachings "docs/en")]
    (println "✨ Discovered" (count teachings) "sacred teachings")
    (doseq [teaching teachings]
      (println "📖" (:number teaching) "-" (:title teaching)))
    teachings))
