(ns am-ie.inferrable)


(defprotocol Inferrable
    "API for an Inference Engine"
    (setId [id] "set Id")
    (getId [] "returns Id")
    (setInferrable [inferrable] "set the Inferrable object")
    (eval [] "Returns a boolean"))