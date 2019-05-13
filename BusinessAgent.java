package DesignPatterns.Proxy;

public class BusinessAgent implements CheatingWife {

    private CheatingWife cheatingWife;

    public BusinessAgent(){

        cheatingWife = new HouseWifeOne();
    }

    public BusinessAgent(CheatingWife cheatingWife){

        this.cheatingWife = cheatingWife;
    }

    @Override
    public void seduceMan() {
        this.cheatingWife.seduceMan();
    }

    @Override
    public void happyWithMan(){
        this.cheatingWife.happyWithMan();
    }
}
