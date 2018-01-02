(ns status-im.ui.screens.wallet.collectibles.subs
  (:require [re-frame.core :as re-frame]))

(re-frame/reg-sub :collectibles
                  (fn [db]
                    (:collectibles db)))
