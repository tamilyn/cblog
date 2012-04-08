(ns cblog.util
  (:refer-clojure :exclude [extend replace reverse])
  (:import [java.io BufferedReader] [java.io InputStreamReader])
  (:use [sandbar.auth] [stencil.core] [hiccup core page-helpers]
        [clj-time.core] [clj-time.format] [clojure.string]
        [cheshire.core]))

; Macro to recieve a BufferedReader from a request body
(defmacro with-req-body [[binding] req & body] `(with-open [r# (~req :body)] (let [~binding (BufferedReader. (InputStreamReader. r#))] ~@body)))

(defn json-in [req] (parse-string (slurp (:body req)) true))

; To ensure utf8 reply
(defn utf8response "Ring skeleton with headers." [body] {:status  200 :headers { "Content-Type" "text/html;charset=UTF-8" "Character-Encoding" "UTF-8"} :body body})

; "default" layout
(defn layout [content] (render-file "templates/default" { :capsule (html content) :username (current-username) }))

; 404 Message
(defn make-404 [] (str "404\n---\nCeci n'est pas une 404"))

; Generate timestamp
(defn gen-timestamp [] (unparse (formatters :date-hour-minute-second) (now)))

