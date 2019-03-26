(ns collatz-conjecture)

(defn collatz [num]
  (while (not= num 1)
    (cond
      (= num 2) 1
      (odd? num) (+ (* 3 num) 1)
      (even? num) (/ num 2)))
  (println num)
  (recur num))
                     ;; <- arglist goes here
  ;; your code goes here
