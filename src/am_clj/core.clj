(ns am-clj.core
  (:gen-class)
  (:require [am-clj.am :as am]
            [am-agenda.agenda :as agenda]
            [am-engine.engine :as engine])
  )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (am/init))
