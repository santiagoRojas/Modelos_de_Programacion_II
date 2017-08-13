package Model;

/* Whipped = batido */
public class Whipped extends Coffee{

    @Override
    public Coffee prepare() {
        addMilk();
        addCoffee();
        addSugar();
        addWater();
        return this;
    }

    @Override
    public void addCoffee() {        
    }

}