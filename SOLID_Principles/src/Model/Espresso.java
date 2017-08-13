package Model;

public class Espresso extends Coffee {

    @Override
    public Coffee prepare() {
        addCoffee();
        addWater();
        return this;
    }

    @Override
    public void addCoffee() {        
    }

}