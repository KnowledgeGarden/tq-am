(ns am-agenda.agenda)
;  Its parameters are operation, concept, facet, worth, and reason:
;                      Op          C       F       W       R

; the Agenda collection itself, populated with agenda_item objects
; It's a sorted list composed of agenda_item entries sorted on worth
(def agenda ())

; a History collection, populated with removed agenda_item objects from the agenda
; history is just a collection
(def history ())

; an agenda_item object
(defrecord agenda_item [operation concept facet worth reason])

; when it's time to take the highest value on the agenda,
; this is a simple algorithm - need others for when there are criteria
(defn sort_agenda
    "sort the agenda - all items -> returns a sorted list"
    []
    (sort-by :worth [agenda]))

(defn sort_agenda_task
    "sort the agenda on task type-> returns a sorted list"
    [task]
    (let [temp (filter #(= (:task %) task) agenda)]
        (sort-by :worth [temp])))

(defn sort_agenda_task_concept
    "sort the agenda on task and concept types-> returns a sorted list"
    [task concept ]
    (let [temp (filter #(and [(filter (= (:task %) task) agenda)
                              (filter (= (:concept %) concept) agenda)]))]
        (sort-by :worth [temp])))

(defn sort_agenda_task_concept_slot
    "sort the agenda on task and concept and slot types-> returns a sorted list"
    [task concept slot]
    (let [temp (filter #(and [(filter (= (:task %) task) agenda) 
                              (filter (= (:concept %) concept) agenda)
                              (filter (= (:slot %) slot) agenda)]))]
        (sort-by :worth [temp])))
    
; TODO not sure how to do a DSL here which returns a new agenda_item
(defn new_agenda_item
    "Create a new agenda_item"
    [operation concept facet worth reason]
    (agenda_item. operation concept facet worth reason))

(defn add_agenda_item
    "Add a new agenda_item"
    [item]
    (conj agenda item))

(defn add_new_agenda_item
    "create and add new agenda_item"
    [operation concept facet worth reason]
    (add_agenda_item (new_agenda_item operation concept facet worth reason)))

(defn take_any
    "take the highest worth agenda item regardless of other features"
    []
    )

(defn take_concept
    "take highest worth agenda_item for given concept"
    [concept]
    ()
    )

(defn take_operation
    "take highest worth agenda_item for given operation"
    [operation]
    ()
    )

(defn take_operation_concept
    "take highest worth agenda_item for given operation and concept"
    [operation concept]
    ()
    )

(defn take_operation_concept_facet
    "take highest worth agenda_item for given operation, concept, and facet"
    [operation concept facet]
    ()
    )

