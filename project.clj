(defproject pipes "0.1.0-SNAPSHOT"
  :description "Pipes is opinionated CI-server for docker based projects."
  :url "https://github.com/theikkila/pipes"
  :license {:name "Apache License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot pipes.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
