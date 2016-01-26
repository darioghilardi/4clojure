(in-ns 'user)

(=
  (#(take % (map first (iterate (fn [[a b]] [b (+ a b)]) [1 1]))) 3)
  '(1 1 2))

(= (#(take % (map first (iterate (fn [[a b]] [b (+ a b)]) [1 1]))) 6)
   '(1 1 2 3 5 8))

(= (#(take % (map first (iterate (fn [[a b]] [b (+ a b)]) [1 1]))) 8)
   '(1 1 2 3 5 8 13 21))
