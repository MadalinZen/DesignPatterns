package DesignPatterns.Visitor;

public class FirstTimeVisitor implements  Visitor {

    @Override
    public void visit(City city){

        System.out.println("I am visiting the city ! ");
    }

    @Override
    public void visit(Museum museum){

        System.out.println("I am visiting the museum ! ");
    }

    @Override
    public void visit(Park park){

        System.out.println("I am visiting the park ! ");
    }



}
