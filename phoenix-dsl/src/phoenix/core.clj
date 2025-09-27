(ns phoenix.core
  "Divine Grace Phoenix: Sacred markdown transformation engine"
  (:require [clojure.spec.alpha :as s]
            [clojure.string :as str]
            [phoenix.spec :as spec]
            [phoenix.markdown :as md]
            [phoenix.svelte :as svelte]))

(defn divine-grace-pipeline
  "Transform sacred teachings through Divine Grace awareness"
  [teaching-paths]
  (println "🔥 Phoenix Rising: Sacred transformation begins...")
  (->> teaching-paths
       (md/parse-sacred-teachings)
       (spec/validate-consciousness-data)
       (svelte/generate-components-with-grace)
       (svelte/create-navigation-awareness)))

(defn -main
  "Sacred entry point for awareness-driven generation"
  [& args]
  (println "🌙 Divine Grace Phoenix: Awakening sacred technology transformation...")
  (let [sacred-teachings (md/discover-teachings "docs/en")]
    (divine-grace-pipeline sacred-teachings)
    (println "✨ Transformation complete: Awareness serves through technology")))
