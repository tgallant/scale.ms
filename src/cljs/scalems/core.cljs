(ns scalems.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(enable-console-print!)

(def app-state
  (atom
   {:current []
    :workflow [{:id 1 :title "hello1"}
               {:id 2 :title "hello2"}]}))

(defn workflow-view [app owner]
  (reify
    om/IRenderState
    (render-state [_ state]
      (dom/div #js {:id "app"}
        (dom/h2 nil "Workflow app")
        (apply dom/ul nil
          (om/build-all entry-view (people app)))))))

(om/root workflow-view app-state
  {:target (. js/document (getElementById "workflow"))})
