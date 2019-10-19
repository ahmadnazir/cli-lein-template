(ns {{name}}.core
    (:gen-class))

(defn handle [line]
  (println (str " :: " line)))

(defn -main [& args]
  (loop [
         lines (line-seq (java.io.BufferedReader. *in*))
         ]
    (let [line (first lines)]
      (cond line (do
                   (handle line)
                   (recur (rest lines)))
            :else (println "Done!"))
      )))
