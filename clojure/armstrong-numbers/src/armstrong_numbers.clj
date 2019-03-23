(ns armstrong-numbers)

(defn armstrong? [num]
  (def str_num (str num))
  ; Turns number into string
  (def num_len (count str_num))
  ; Grabs length of number in string form, 1-indexed.
  ; ? Mutate num using num_len from here
  (recur (println (dec num_len))))

    ;; your code goes here
