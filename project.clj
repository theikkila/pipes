(defproject pipes "0.1.0-SNAPSHOT"
  :description "Pipes is opinionated CI-server for docker based projects."
  :url "https://github.com/theikkila/pipes"
  :license {:name "Apache License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [http-kit "2.1.18"]
                 [com.taoensso/timbre "4.4.0"]
                 [environ "1.0.3"]
                 [compliment "0.2.7"]
                 [compojure "1.5.1"]]
  :plugins [[lein-environ "1.0.3"]]
  :repl-options {:init (require 'clojure.tools.namespace.repl)}
  :main ^:skip-aot pipes.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev {:env {:port "8080"}}})
