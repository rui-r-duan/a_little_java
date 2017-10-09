# a_little_java
Code from the book "A Little Java"

This book introduces a few Java design patterns which combine
* Object-Oriented Programming,
* Functional Programming (no side-effect, immutable data structures).

We can use datatypes to describe the structure of data (e.g. PieD (sequential list), TreeD)  and use visitors (e.g. PieVisitorI, TreeVisitorI) to operate them.

We can also use datatypes to describe the structure of computation (e.g. ExprD (tree)), and use visitors to evaluate (interprete) them.

These list-like and tree-like structures are implemented using Composition Pattern to simulate Lisp **cons** cell.
