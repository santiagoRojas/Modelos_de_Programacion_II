package Model;

public class Cappuccino extends Coffee{

    /*  It applies Polymorphism:     
        (2) Parametric (Overwriting):
        Capacity to define several functions using the same name with different parameters (in different classes)
        Example: Constructor by default and other constructor.   
    */
    
    @Override
    public Coffee prepare() {
        addMilk();
        addMilkCream(); 
        addCoffee();
        addSugar();
        return this;
    }

    @Override
    public void addCoffee() {        
    }    
   
}