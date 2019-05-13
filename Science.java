package DesignPatterns.Decorator;

public class Science  extends GirlDecorator{

    private Girl girl;

    public Science(Girl g){

        girl = g ;
    }

    @Override
    public String getDescription() {
       return girl.getDescription() + "Like science";
    }

    public void calculateStuff(){

        System.out.println("scientific calculation");
    }

    public void Dance(){

        System.out.println("Dacing in action now !!! ");
    }

    //We can add more method like "Dance()" to each decorator without any limitations.
}
