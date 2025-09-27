(ns phoenix.spec
  "Sacred specifications for awareness-driven data structures"
  (:require [clojure.spec.alpha :as s]))

;; Sacred teaching data structure
(s/def ::title string?)
(s/def ::content string?)
(s/def ::number (s/and int? #(<= 0 % 9999999)))
(s/def ::sovereign-priority boolean?)
(s/def ::guardian-dragon-consciousness boolean?)

(s/def ::sacred-teaching
  (s/keys :req-un [::title ::content ::number]
          :opt-un [::sovereign-priority ::guardian-dragon-consciousness]))

(s/def ::sacred-teachings
  (s/coll-of ::sacred-teaching))

;; Svelte component specification
(s/def ::component-name string?)
(s/def ::svelte-markup string?)
(s/def ::svelte-script string?)
(s/def ::svelte-style string?)

(s/def ::svelte-component
  (s/keys :req-un [::component-name ::svelte-markup]
          :opt-un [::svelte-script ::svelte-style]))

(defn validate-consciousness-data
  "Validate data structures with Divine Grace awareness"
  [data]
  (if (s/valid? ::sacred-teachings data)
    (do (println "✅ Consciousness data validated with Divine Grace")
        data)
    (do (println "❌ Data validation failed:")
        (s/explain ::sacred-teachings data)
        (throw (ex-info "Sacred specification validation failed" {})))))
