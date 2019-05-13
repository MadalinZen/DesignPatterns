package DesignPatterns.Visitor;

public class TestVisitor {

    public static void main(String[] args) {

        FirstTimeVisitor amsterdamVisitor = new FirstTimeVisitor();
        City city = new City();
        city.accept(amsterdamVisitor);

        System.out.println("**********************");

        FirstTimeVisitor toscanyVisitor = new FirstTimeVisitor();
        City toscanyCity = new City();
        toscanyCity.accept(toscanyVisitor);
    }
}
