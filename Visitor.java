package DesignPatterns.Visitor;

/*
Visitor pattern is a design pattern commonly used in the parser of a compiler, such as Eclipse JDT AST Parser.

Basically, there are two interfaces - Visitor and Element - in Visitor pattern.


Visitor pattern story

Suppose a first time visitor comes to New York City. He want to visit the city and the city accepts his visit.
Once the visitor starts visit, it automatically visit everything, and he doesn't need to call a method when he wants to go to a museum.
 The travel is a package!

 The working process is like the following:

1. A visitor FirstTimeVisitor and an element City are created.
2. Program starts with "City accept a visitor".
3. The accept method in City defines that let this visitor to visit.
4. Accepted visitor call it's overloaded method "visit" to visit this City.

 */

    interface Visitor {

        public void visit(City city);
        public void visit(Museum museum);
        public void visit(Park park);

}
