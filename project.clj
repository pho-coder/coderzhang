(defproject coderzhang "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]
                 [log4j "1.2.17"]
                 [org.clojure/tools.logging "0.2.6"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler coderzhang.handler/app}
  :global-vars {*warn-on-reflection* true}
  :aliases {"clean-run!" ["do" "clean," "ring" "server-headless"]}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
