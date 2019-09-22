(ns leiningen.new.cli
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "cli"))

(defn cli
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' cli project.")
    (->files data
             ["src/{{sanitized}}/foo.clj" (render "foo.clj" data)])))
