(defproject am-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.cerner/clara-rules "0.20.0"]]
  :main ^:skip-aot am-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
