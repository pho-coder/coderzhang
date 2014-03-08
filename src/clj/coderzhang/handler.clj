(ns coderzhang.handler
  (:require [compojure.core :refer [defroutes GET]]
            [compojure.handler :refer [site]]
            [compojure.route :refer [resources not-found]]

            [coderzhang.templates.home :refer [home not-found-page]]))

(defroutes app-routes
  (GET "/" [] (home))
  (resources "/")
  (not-found (not-found-page)))

(def app
  (site app-routes))
