(ns coderzhang.handler
  (:require [compojure.core :refer [defroutes GET]]
            [compojure.handler :refer [site]]
            [compojure.route :refer [resources not-found]]

            [coderzhang.templates.home :refer [home]]))

(defroutes app-routes
  (GET "/" [] (home))
  (resources "/")
  (not-found "Not Found"))

(def app
  (site app-routes))
