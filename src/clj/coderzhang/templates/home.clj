(ns coderzhang.templates.home
  (:require [net.cgrand.enlive-html :refer [deftemplate]]))

(deftemplate home "public/index.html"
  [])

(deftemplate not-found-page "public/404.html" [])
