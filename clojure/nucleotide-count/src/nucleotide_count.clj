(ns nucleotide-count)

(defn count [nucleotide strand] ;; <- Arglist goes here
  ;; your code goes here
  (let [nt-map {}
        n-t (keyword nucleotide)]
    (for [n-t strand]
      (if (contains? nt-map n-t) (inc (n-t nt-map))
                                           (assoc nt-map n-t 1)))
   (n-t tnt-map)))

(defn nucleotide-counts [strand]
  (count strand))                                         
       ;; <- Arglist goes here
  ;; your code goes here
; What we know for sure, is there are four distinct values
; that we can find here.
; We have to record each distinct type, and it's occurence.
; This sounds like a job for maps.
; We can say, for each item in a string,
; if it does not exist as a keyword, make a keyword out of it
; then point that keyword at the value 1,
; if it does exist, increment the corresponding value by one
; once the string is done...?