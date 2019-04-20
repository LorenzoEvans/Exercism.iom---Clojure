(ns armstrong-numbers
  (:require [clojure.string :as str]))

(defn expt
  ; Pulls in exponentiation fn from Java's Math
  [base exponent]
  (Math/pow base exponent))

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
    (= (double num) (int-check num)) true
    :else false))

; (defn armstrong? [num]
;   (if
;    (= (double num) (reduce +' (arm-val num))) true
;    false))
