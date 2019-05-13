package DesignPatterns.Composition;

public class Leaf implements Component {

    String name ;
    public Leaf(String s){

        name = s;
    }

    @Override
    public void show() {

        System.out.println(name);
    }


}
