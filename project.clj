(defproject coderzhang "0.1.0-SNAPSHOT"
  :description "my profiles"
  :url "http://coderzhang.sinaapp.com"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2156"]
                 [compojure "1.1.6"]
                 [log4j "1.2.17"]
                 [org.clojure/tools.logging "0.2.6"]
                 [domina "1.0.3-SNAPSHOT"]
                 [hiccups "0.3.0"]
                 [enlive "1.1.5"]]
  :plugins [[lein-cljsbuild "1.0.2"]
            [lein-ring "0.8.10"]]
  :source-paths ["src/clj" "src/cljs" "src/brepl"]
  :ring {:handler coderzhang.handler/app}
  :global-vars {*warn-on-reflection* true}
  :aliases {"clean-run!" ["do" "clean," "ring" "server-headless"]
            "clean-cljsbuild!" ["do" "cljsbuild" "clean," "cljsbuild" "auto" "dev"]}
  :cljsbuild {:builds
              {:dev {:source-paths ["src/cljs" "src/brepl"]
                     :compiler {:output-to "resources/public/js/coderzhang_dbg.js"
                                :optimizations :whitespace
                                :pretty-print true}}
               :pre-prod {:source-paths ["src/cljs" "src/brepl"]
                          :compiler {:output-to "resources/public/js/coderzhang_pre.js"
                                     :optimizations :simple
                                     :pretty-print false}}
               :prod {:source-paths ["src/cljs"]
                      :compiler {:output-to "resources/public/js/coderzhang.js"
                                 :optimizations :advanced
                                 :pretty-print false}}}})
