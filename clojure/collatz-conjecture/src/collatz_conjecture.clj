(ns collatz-conjecture)

(defn collatz [num]
  (loop [x num val 0]
    (let [_ (println x)]
      (cond
        (= num 1) 1
        (<= x 1) val
        :else (recur
               (do (inc val))
               (if (even? x)
                 (/ x 2)
                 (+ (* 3 x) 1)))))))

(defn collatz [num]
  (loop [x num val 0]
    (let [_ (println x)]
      (cond
        (= num 1) 1
        (<= x 1) val
        :else (do
                (recur
                 (inc val)
                 (if (even? x)
                   (/ x 2)
                   (+ (* 3 x) 1))))))))
