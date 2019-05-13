package DesignPatterns.Singleton;

// Lazy mode

public class ItalyPresident{

    private  static ItalyPresident thePresident;

    private ItalyPresident(){}


    public static ItalyPresident getPresident(){

        if (thePresident == null ){

            thePresident = new ItalyPresident();
        }

        return thePresident;
    }
}