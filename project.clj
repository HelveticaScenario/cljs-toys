(defproject cljs-toys "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2138"]]

  :plugins [[lein-cljsbuild "1.0.2"]]

  :source-paths ["src"]

  :cljsbuild { 
    :builds [{:id "cljs-toys"
              :source-paths ["src"]
              :compiler {
                :output-to "cljs_toys.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
