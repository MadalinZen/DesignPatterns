package DesignPatterns.Singleton;

public class BrasilPresident {

    /*
    Singleton pattern is one of the most commonly used patterns in Java.
    It is used to control the number of objects created by preventing external instantiation and modification.
    This concept can be generalized to systems that operate more efficiently when only one object exists,
    or that restrict the instantiation to a certain number of objects, such as:

private constructor - no other class can instantiate a new object.
private reference - no external modification.
public static method is the only place that can get an object.
The Story for Singleton

Here is a simple use case. A country can have only one president.
 So whenever a president is needed, the only president should be returned instead of creating a new one.
  The getPresident() method will make sure there is always only one president created.
     */

    // Eager Mode

    private static final BrasilPresident thePresident = new BrasilPresident();

    private BrasilPresident(){};

    public static BrasilPresident getPresident() {

        return thePresident ;
    }

    // thePresident is declared as final, so it will always contain the same object reference.


}
