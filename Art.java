package DesignPatterns.Decorator;

public class Art extends  GirlDecorator {

    private Girl girl;

    public Art(Girl g){

        girl = g ;
    }

    @Override
    public String getDescription(){

        return girl.getDescription() +" Like Art ";
    }

    public void draw(){

        System.out.println("draw pictures");
    }

    public void takePhoto(){

        System.out.println("take pictures");
    }
}
