(in-ns 'user)

;; Ok this solution is the same Hickey & co. used to implement
;; flatten, but at least I understood how it works, and the power
;; of tree-seq.
;; Honestly I started implementing something recursive, but the
;; tree-seq idea is really great.

(= (#(filter (complement sequential?)
             (rest (tree-seq sequential? seq %)))
    '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))

(= (#(filter (complement sequential?)
             (rest (tree-seq sequential? seq %)))
    ["a"  ["b"] "c"]) '("a" "b" "c"))

;; The next example is false because tree-seq does not
;; accept multiple sequances. The website says instead
;; it's passing the unit tests. It's weird.
;; Passing two lists, which is the expected result then?
(= #(filter (complement sequential?)
            (rest (tree-seq sequential? seq %)))
   '((((:a)))) '(:a))
