(ns collatz-conjecture)

(defn collatz [num]
  (loop [x num]
    (let [_ (println x) val 0]
      (cond
        (= num 1) 1
        (<= x 1) val
        :else (do (inc val)
                  (recur
                   (if
                    (even? x) (/ x 2)
                    (+ (* 3 x) 1))))))))
