(ns user)

(println "hello from user")
(alter-var-root #'*warn-on-reflection* (constantly true))
