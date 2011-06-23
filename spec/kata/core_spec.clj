(ns kata.core-spec
  (:use
   [speclj.core]
   [kata.core]))

(describe "Prime Factors"
          (it "tests one"
              (should= '()
                       (prime-factors 1)))
          (it "tests two"
              (should= '(2)
                       (prime-factors 2)))
          (it "tests three"
              (should= '(3)
                       (prime-factors 3)))
          (it "tests four"
              (should= '(2 2)
                       (prime-factors 4)))
          (it "tests five"
              (should= '(5)
                       (prime-factors 5)))
          (it "tests six"
              (should= '(2 3)
                       (prime-factors 6)))
          (it "tests eight"
              (should= '(2 2 2)
                       (prime-factors 8)))
          (it "tests nine"
              (should= '(3 3)
                       (prime-factors 9)))
          (it "tests complicated"
              (should= '(2 5 11 13 19 23 29)
                       (prime-factors (* 2 5 11 13 19 23 29)))))

(run-specs)
