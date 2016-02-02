(in-ns 'user)

(= (apply str (#(map first (partition-by identity %)) "Leeeeeerrroyyy")) "Leroy")

(= (#(map first (partition-by identity %))  [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))

(= (#(map first (partition-by identity %)) [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
