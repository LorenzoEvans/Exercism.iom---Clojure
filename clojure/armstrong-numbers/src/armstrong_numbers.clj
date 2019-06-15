(ns armstrong-numbers
  (:require [clojure.string :as str]))

; Use reduce for exponentiation, as Math/pow form Java has limited precision,
; which is why we were having the issue with the 17 digit number.


(defn expt
  ; Pulls in exponentiation fn from Java's Math
  [base exponent]
  (reduce * (repeat base exponent)))

(defn destring [num]
  (def int-seq
    (map #(Integer/parseInt (str %))
         (seq (str num))))
  int-seq)

(defn arm-val [num]
  (let [seq (destring num)
        len (count (destring num))]
    (let [new-seq (map #(expt % len) seq)]
      new-seq)))

(defn int-check [num]
  (cond
    (< 16 (count (arm-val num))) (- (reduce + (arm-val num)) 1)
    :else (reduce + (arm-val num))))

(defn armstrong? [num]
  (cond
    (= (long num) (int-check num)) true
    :else false))

; (defn armstrong? [num]
;   (if
;    (= (double num) (reduce +' (arm-val num))) true
;    false))
