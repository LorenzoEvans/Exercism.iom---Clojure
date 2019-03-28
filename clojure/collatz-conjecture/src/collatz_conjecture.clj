(ns collatz-conjecture)

; (defn collatz [num]
;   ((while (not= num 1)
;     (cond
;       (= num 2) 1
;       (odd? num) (+ (* 3 num) 1)
;       (even? num) (/ num 2))))
;   (recur num))

; (defn collatz [num]
;   (loop [num]
;     (while (not= num 1)
;       (cond
;         (= num 2) 1
;         (odd? num) (+ (* 3 num) 1)
;         (even? num) (/ num 2))))
;   (recur num))
;
; (defn collatz
;   [num]
;   (loop [x num]
;     (if
;       (= x 1) 1
;       (cond
;         (= x 2) 1
;           (:else
;             (odd? x) (+ (* 3) 1)
;             (even? x) (/ num 2)))))
;   (recur num))

(defn collatz [num]
  (loop [x num]
    (cond
      (= 1 x) 1
      (= 2 x) 1
      :else (recur
              (if (even? x) (/ x 2)
                (+ (* 3 x) 1))))))




                     ;; <- arglist goes here
  ;; your code goes here
