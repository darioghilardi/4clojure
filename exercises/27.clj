(in-ns 'user)

(false? (#(if (= (into () %) (reverse (into () %)))
            true
            false)
          '(1 2 3 4 5)))

(true? (#(if (= (into () %) (reverse (into () %)))
            true
            false)
          "racecar"))

(true? (#(if (= (into () %) (reverse (into () %)))
            true
            false)
          [:foo :bar :foo]))

(true? (#(if (= (into () %) (reverse (into () %)))
           true
           false)
          '(1 1 3 3 1 1)))

(false? (#(if (= (into () %) (reverse (into () %)))
            true
            false)
          '(:a :b :c)))
