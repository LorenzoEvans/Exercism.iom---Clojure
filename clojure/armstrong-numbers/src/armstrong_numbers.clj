(ns armstrong-numbers
  (:require [clojure.edn :as edn]))

(def edn edn/read-string)

; (defn armstrong? [num]
;   (def str_num (str num))
;   ; Turns number into string
;   (def num_len (count str_num))
;   (while (not= num_len 0)
;     (println 2)))


(defn armstrong? [num]
  (def str_num (str num))
  ; Turns number into string
  (def num_len (count str_num))
  (list num) num)


  ; Grabs length of number in string form, 1-indexed.
  ; ? Mutate num using num_len from here

    ; take the first number, multiply it by num_len
    ;  dec num_len (to satisfy conditional at some point
    ; ?: will decrementing num_len throw off multiplying by num_len
    ; A: Immutability implies no, but watch out for it anyway.
