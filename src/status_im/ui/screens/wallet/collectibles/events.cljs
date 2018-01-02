(ns status-im.ui.screens.wallet.collectibles.events
  (:require [re-frame.core :as re-frame]
            [status-im.utils.handlers :as handlers]))

(handlers/register-handler-fx
 :load-collectibles-success
 [re-frame/trim-v]
 (fn [{db :db} [{:keys [collectibles]}]]
   ;; TODO Implement smarter loading
   {:db (assoc db :collectibles collectibles)}))

(handlers/register-handler-fx
 :load-collectibles-failure
 [re-frame/trim-v]
 (fn [{db :db} [{:keys [message]}]]
   {:db (assoc db :collectibles-failure message)}))
