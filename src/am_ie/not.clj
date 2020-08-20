(ns am-ie.not
    (require am-ie.inferrable :as I) )

/**
 * Simply return the boolean negation of the evaluation of {@code inferrable}
 * Note, we are ignoring id.
*/
(deftype not [inferrable]
    I
    (eval [] !inferrable.eval())
)