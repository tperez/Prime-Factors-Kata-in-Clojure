(ns kata.core)

(defn prime-factors-helper [n candidate]
  (cond
   (= n 1) '()
   (= (rem n candidate) 0) (cons candidate
                                 (prime-factors-helper (/ n candidate) candidate))
   :else (prime-factors-helper n (+ candidate 1))))

(defn prime-factors [n]
  (prime-factors-helper n 2))
