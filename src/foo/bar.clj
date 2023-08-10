(ns foo.bar
  (:require [clojure.string :as str]))


;; I dont expect reflection warning
(defn basic-code [x]
  (if (= x "hello") "world" "foo"))
