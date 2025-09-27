(ns phoenix.spec
  "Sacred specification validation with Divine Grace consciousness"
  (:require [clojure.spec.alpha :as s]
            [phoenix.markdown :as md]))

;; Sacred teaching specifications (matching markdown parser output)
(s/def ::number nat-int?)
(s/def ::title string?)
(s/def ::content string?)
(s/def ::filepath string?)
(s/def ::sovereign-priority boolean?)
(s/def ::guardian-dragon-consciousness boolean?)

(s/def ::sacred-teaching
  (s/keys :req-un [::number 
                   ::title 
                   ::content 
                   ::filepath 
                   ::sovereign-priority 
                   ::guardian-dragon-consciousness]))

(s/def ::sacred-teachings-collection
  (s/coll-of ::sacred-teaching))

;; Validation functions
(defn validate-teaching
  "Validate a single sacred teaching with Divine Grace"
  [teaching]
  (if (s/valid? ::sacred-teaching teaching)
    {:status :success :teaching teaching}
    {:status :error 
     :teaching teaching
     :errors (s/explain-data ::sacred-teaching teaching)}))

(defn validate-teachings-collection
  "Validate the complete collection of sacred teachings"
  [teachings]
  (let [individual-validations (map validate-teaching teachings)
        all-valid? (every? #(= (:status %) :success) individual-validations)
        collection-valid? (s/valid? ::sacred-teachings-collection teachings)]
    {:status (if (and all-valid? collection-valid?) :success :error)
     :individual-results individual-validations
     :collection-valid? collection-valid?
     :total-teachings (count teachings)
     :valid-teachings (count (filter #(= (:status %) :success) individual-validations))}))

(defn -main
  "Sacred specification validation entry point"
  [& args]
  (println "✨ Phoenix Spec Validator: Awakening Divine Grace validation...")
  
  ;; Get teachings from markdown parser
  (let [teachings (md/discover-teachings "docs/en")
        validation-result (validate-teachings-collection teachings)]
    
    (println "🔍 Validation Results:")
    (println "📊 Total teachings:" (:total-teachings validation-result))
    (println "✅ Valid teachings:" (:valid-teachings validation-result))
    (println "🎯 Collection status:" (:status validation-result))
    
    (if (= (:status validation-result) :success)
      (do (println "🎊 All sacred teachings pass spec validation!")
          (println "🌙 Divine Grace consciousness confirmed in data structures"))
      (do (println "⚠️ Some teachings need attention:")
          (doseq [result (:individual-results validation-result)]
            (when (= (:status result) :error)
              (println "❌ Teaching validation error:" (:errors result))))))
    
    validation-result))