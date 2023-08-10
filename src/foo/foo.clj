(ns foo.foo
  (:require [foo.bar :as bar]))

#_
(set! *warn-on-reflection* true)

;; expected reflection warning
(defn interop [x] (.length x))

(defn -main
  "Invoke me with clojure -M -m foo.foo"
  [& args]
  (bar/basic-code "haha")
  (println "-main with" args))
