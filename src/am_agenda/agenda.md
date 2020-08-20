# Agenda
Agenda is a complex tuplespace with:
* Sorting on worth field
* Indexing on other fields
** Task
** Concept
** Slot

It is adaptive in the sense that external agents can modify two fields:
* Worth
* Reason

It is further adaptive in the sense that it decays Worth when cycled

It should be further adaptive in the sense that if an external agent addes a new
agenda item, that item might *merge* with an existing agenda item

For sorting, consider
    Sorted-Map
    Map sortBy where you give it a key
    
When you have an agenda query which has params, e.g. take by task, take by task + concep6t,
you need to first create collections of those which suit the query then sort that collection

## Ideas
An agenda Item, a Task, typically has the objects suggested above. But, it's not unreasonable to extend it with one or any of:

* Adhoc fields (slots)
* Specific fields defined, say, by some domain

Those added fields allow to construct heuristics which can be better refined than otherwise. Tasks can propose such new Tasks which have these fields.
