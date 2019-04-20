(ns collatz-conjecture)

(defn collatz
  [num]
  (loop [x num val 0]
    (let [_ (println val)]
      (cond
        (= num 0) (throw (Throwable. "Zero is an error."))
        (= num 1) 0
        (= x 1) val
        (neg? num) (throw (Throwable. "Negative is an error."))
        :else (do
                (recur
                 (if (even? x) (/ x 2)
                     (inc (* 3 x))) (inc val))))))); Previous attempts:
 ; (defn collatz [num]
 ;   (loop [x num val 0]
 ;     (let [_ (println x)]
 ;       (cond
 ;         (= num 1) 1
 ;         (<= x 1) val
 ;         :else (recur
 ;                (do (inc val))
 ;                (if (even? x)
 ;                  (/ x 2)
 ;                  (+ (* 3 x) 1)))))))
 ;
 ; (defn collatz [num]
 ;   (loop [x num val 0]
 ;     (let [_ (println val)]
 ;       (cond
 ;         (= num 1) 1
 ;         (<= x 1) val
 ;         :else (do
 ;                 (recur
 ;                  (if (even? x)
 ;                    (/ x 2)
 ;                    (+ (* 3 x) 1)) (inc val)))))))
