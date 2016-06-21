(ns pipes.core
  (:require [taoensso.timbre :refer [log  trace  debug  info  warn  error  fatal  report]]
            [environ.core :refer [env]])
  (:use org.httpkit.server)
  (:gen-class))


(def PORT (Integer/parseInt (env :port)))

(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "hello HTTP!"})

(defn -main
  "Pipes-server main function"
  [& args]
  (log "Starting server at " PORT)
  (run-server app {:port PORT}))
