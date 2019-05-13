package DesignPatterns.Decorator;

public class MainDecorator {

    public static void main(String[] args) {

        Girl girl1 = new AsianGirl();
        System.out.println(girl1.getDescription());

        Science girl2 = new Science(girl1);
        System.out.println(girl2.getDescription());

        Art girl3 = new Art(girl2);
        System.out.println(girl3.getDescription());

        Girl girl = new Science(new Art(new EuropeanGirl()));
        System.out.println(girl.getDescription());
    }
}
