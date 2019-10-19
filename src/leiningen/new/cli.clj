(ns leiningen.new.cli
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "cli"))

(defn cli
  "Generate a clojure application template that compiles to native binary"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' cli project.")
    (->files data
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
             ["project.clj" (render "project.clj" data)]
             [".gitignore" (render "gitignore" data)]
             ;; ["Dockerfile" (render "Dockerfile" data)]
             ["build.sh" (render "build.sh" data)]
             ["README.md" (render "README.md" data)]
             ["HIBT.md" (render "HIBT.md" data)]
             )))
