(in-ns 'user)

(= (#(reduce (fn [n _] (inc n)) 0 %) '(1 2 3 3 1)) 5)

(= (#(reduce (fn [n _] (inc n)) 0 %) "Hello World") 11)

(= (#(reduce (fn [n _] (inc n)) 0 %) [[1 2] [3 4] [5 6]]) 3)

(= (#(reduce (fn [n _] (inc n)) 0 %) '(13)) 1)

(= (#(reduce (fn [n _] (inc n)) 0 %) '(:a :b :c)) 3)
