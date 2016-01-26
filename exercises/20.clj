(in-ns 'user)

(= (#(nth (reverse %) 1) (list 1 2 3 4 5)) 4)

(= (#(nth (reverse %) 1) ["a" "b" "c"]) "b")

(= (#(nth (reverse %) 1) [[1 2] [3 4]]) [1 2])
