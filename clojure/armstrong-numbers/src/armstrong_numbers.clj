(ns armstrong-numbers
  (:require [clojure.string :as str]))

; Use reduce for exponentiation, as Math/pow form Java has limited precision,
; which is why we were having the issue with the 17 digit number.
; This expt function will be applied later on in the solution function,
 ; than we originally assumed.


; (defn expt
;   [base exponent]
;   (reduce * (repeat base exponent)))


; ; Try using quot or rem to determine digits instead of casting to string and back.


; (defn armstrong? [num]
;   (if
;    (= num (expt num)) true
;    false))
; (defn destring [num]
;   (def int-seq
;     (map #(Integer/parseInt (str %))
;         (seq (str num))))
;   int-seq)
; (defn arm-val [num]
;   (let [seq (destring num)
;         len (count (destring num))]
;     (let [new-seq (map #(expt % len) seq)]
;       new-seq)))
; (defn int-check [num]
;   (cond
;     (= 1 (count (arm-val num))) true
;     (< 16 (count (arm-val num))) (- (reduce + (arm-val num)) 1)
;     :else (reduce +' (arm-val num))))

; (defn armstrong? [num]
;   (cond
;     (= (long num) (int-check num)) true
;     :else false))
(defn digits [x]
  (map #(- (int %) (int \0)) (str x)))
