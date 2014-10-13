(defproject scalems "0.1.0-SNAPSHOT"
  :description "workflow generator for your startup"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :jvm-opts ^:replace ["-Xmx1g" "-server"]

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [org.clojure/clojurescript "0.0-2371"]
                 [ring "1.3.1"]
                 [http-kit "2.1.16"]
                 [om "0.7.3"]
                 [om-sync "0.1.1"]
                 [compojure "1.2.0"]
                 [fogus/ring-edn "0.2.0"]
                 [com.datomic/datomic-free "0.9.4699"]]

  :plugins [[lein-cljsbuild "1.0.3"]]

  :source-paths ["src/clj" "src/cljs"]
  :resource-paths ["resources"]

  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src/clj" "src/cljs"]
              :compiler {
                :output-to "resources/public/js/main.js"
                :output-dir "resources/public/js/out"
                :optimizations :none
                :source-map true}}]})
