# Inference Engine

We began this project assuming that the heuristics might need an inference engine.

That turns out not to be the case. We simply need to create a mechanism for *indexing* heuristics by their specifications:

* Task
* Concept
* Slot
* Possibly other fields

Which means that the code in this section will be removed as not needed, and the project declaration of a rule system will be removed.
