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
### Fields
An agenda Item, a Task, typically has the objects suggested above. But, it's not unreasonable to extend it with one or any of:

* Adhoc fields (slots)
* Specific fields defined, say, by some domain

Those added fields allow to construct heuristics which can be better refined than otherwise. Tasks can propose such new Tasks which have these fields.
### Agenda Design - 1

The present design assumes *all tasks* will be handled by a single agenda.

A complex option would be to have a single agenda per task type. 

**Pros**
* This has the benefit that you do not have to index heuristics by task. 
* This simplifies parallel computation since each agenda can be associated with its own *engine* which means that multiple tasks can be running in parallel

**Cons**
* It's a far more complex ecosystem than was in either AM or Eurisko
* Potential for difficulties associated with the invention of new task types. (Perhaps there is a kind of Agenda-Engine complex which is spawned by a factory against a particular task type. That would then be driven by a registry which allows matching of heuristics to agenda-engines)

### Agenda Design -2

It really is an interesting idea to have individual tasks associated with their own AM-loop and Agenda-Engine facility.

This means that agents designed for specific task types, concepts, etc, simply *take* a task from their assigned agenda - the *find something to do* part of the loop, and when they do not have anything to take, they simply wait until an appropriate task enters.

