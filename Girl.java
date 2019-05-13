package DesignPatterns.Decorator;

/*
Decorator pattern adds additional features to an existing object dynamically.
In this post, I will use a simple example - decorate your girlfriend - to illustrate how decorator pattern works.

Let's assume you are looking for a girlfriend.
 There are girls from different countries such as America, China, Japan, France, etc.
  They may have different personalities and hobbies.
  In a dating web like eharmony.com, if each type of girl is an individual Java class, there would be thousands of classes.
   That is a serious problem called class explosion. Moreover, this design is not extensible.
    Whenever there is a new girl type, a new class needs to be created.

Let's change the design, and let each hobby/personality becomes a decorator which can be dynamically applied to a girl.

Girl is the abstract class at the top level, we have girls from different countries.
With a GirlDecorator class, we can decorate each girl with any feature by adding a new decorator.
 */

public abstract class Girl {

    String description = "no particular";

    public String getDescription(){

        return description;
    }


}
