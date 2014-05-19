HashMap

A hashmap uses an Array to keep track of its elements. Because of this,
insertion, retrieval, and deletion are all constant-time operations. However,
HashMaps will require rehashing if expected capacity is exceeded. As a 
consequence of this, elements are not kept in order and their
positiion may change.

TreeMap

A TreeMap uses a tree data structure to store its elements, which are kept 
sorted according to their keys. As a result, each key must be a Comparable. 
Addition, retrieval, and deletion are on the order of log(n).

Sets

A Set, whether a TreeSet or HashSet, is a wrapper around its equivalant Map.
The map uses a hashing function to create a hash key which is then used to
store and retrieve data in the map.
