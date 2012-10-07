(defproject cblog "0.1.0-SNAPSHOT"
  :description "simple blog in clojure"
  :dev-dependencies [[lein-ring "0.6.3"]]
  :dependencies [[ring/ring-jetty-adapter "1.1.0-beta3"]
                 [org.clojure/clojure "1.4.0"]
                 [ring "1.1.6"]
                 [clj-time "0.4.4"]
 ;                [me.shenfeng/async-ring-adapter "1.0.1"]
                 [net.cgrand/moustache "1.1.0"]
                 [org.clojure/tools.logging "0.2.3"]
                 [org.slf4j/slf4j-api "1.6.4"]
                 [org.slf4j/jcl-over-slf4j "1.6.4"]
                 [cheshire "4.0.3"]
                 [ch.qos.logback/logback-classic "1.0.0"]
                 [stencil "0.3.1"]
                 [com.novemberain/monger "1.2.0"]
                 [kremers/sandbar "0.4.1-SNAPSHOT"]
                 [kremers/monger-session "1.0.0"]
                 [clj-aws-s3 "0.3.2"]
                 [amalloy/ring-gzip-middleware "0.1.2"]
                 [org.imgscalr/imgscalr-lib "4.2"]
                 [org.clojars.mikejs/ring-etag-middleware "0.1.0-SNAPSHOT"]
                 ]
   :main cblog.core
   :source-path "src"
   :jvm-opts ["-Djava.awt.headless=true"]
   :ring {:handler cblog.core/routes}
   :properties { :project.build.sourceEncoding "UTF-8" }
   :plugins  [[lein-swank "1.4.4"]] 

)
