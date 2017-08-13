package Model;

public abstract class Coffee{
    
    /*  - Open/Close principle:
        You should be able to extend a classes behavior, without modyfing it.

        If the client implements a new type of coffee, then you can create it as a new class, which inherits of Coffee class.           
    */
    
    private String nameCoffee;
    
    public String getNameCoffee() {
        return nameCoffee;
    }

    public void setNameCoffee(String nameCoffee) {
        this.nameCoffee = nameCoffee;
    }
    
    public void addSugar(){        
    }
    
    public void addMilk(){        
    }
    
    public void addMilkCream(){        
    } 
    
    public void addWater(){       
    }
    
    public abstract Coffee prepare();        
    public abstract void addCoffee();   
}
