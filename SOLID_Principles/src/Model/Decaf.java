package Model;

/*	Decaf = descafeinado */
public class Decaf extends Coffee{

    @Override
    public Coffee prepare() 
    {
        addWater();
        addCoffee();
        addWater();
        return this;
    }

    @Override
    public void addCoffee() {        
    }    

}