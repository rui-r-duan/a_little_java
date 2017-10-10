# a_little_java

## Code from the book "A Little Java, A Few Patterns"

This book introduces a few Java design patterns which combine
* Object-Oriented Programming,
* Functional Programming (no side-effect, immutable data structures).

This book features **Visitor Pattern**.

## My thoughts

1. We can use datatypes to describe the structure of data (e.g. PieD (sequential list), TreeD)  and use visitors (e.g. PieVisitorI, TreeVisitorI) to operate them.
2. We can also use datatypes to describe the structure of computation (e.g. ExprD (tree)), and use visitors to evaluate (interprete) them.
3. These list-like and tree-like structures are implemented using Composite Pattern to simulate Lisp `cons` cell.
4. The behaviors are all put in the visitors which are separated to the data structures that they manipulate.

## Advice from the book

1. When specifying a collection of data, use abstract classes for datatypes and extended classes for variants.
2. When writing a function over a datatype, place a method in each of the variants that make up the datatype. If a field of a variant belongs to the same datatype, the method may call the corresponding method of the field in computing the function.
3. When writing a function that returns values of a datatype, use new to create these values.
4. When writing several functions for the same self-referential datatype, use visitor protocols so that all methods for a function can be found in a single class.
5. None.
6. When the additional consumed values change for a self-referential use of a visitor, don't forget to create a new visitor.
7. When designing visitor protocols for many different types, create a unifying protocol using Object.
8. When extending a class, use overriding to enrich its functionality.
9. If a datatype may have to be extended, be forward looking and use a constructor-like (overridable) method so that visitors can be extended, too.
10. When modifications to objects are needed, use a class to insulate the operations that modify objects. Otherwise, beware the consequences of your actions.
