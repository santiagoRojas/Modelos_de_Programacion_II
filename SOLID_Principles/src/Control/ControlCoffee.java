package Control;

import Model.Cappuccino;
import Model.Coffee;
import Model.Decaf;
import Model.Espresso;
import Model.Whipped;
import View.Answer;

public class ControlCoffee extends Coffee{
    
    Answer anAnswer;

    @Override
    public void setNameCoffee(String nameCoffee) {
        /* Preparing a coffee  
            It applies Dependency Inversion Principle:
            It should depend on the most abstract, should not depend on the most concrete.
        */        
        Coffee objectCoffee = null;       
        super.setNameCoffee(nameCoffee);        
        prepare(objectCoffee);
    }

    public Coffee prepare(Coffee objectCoffee) {        
        /*  It applies Polymorphism: 
            (1) Dynamic ligation: It relates the call of method at runtime.
        */
        switch(getNameCoffee()){
            case "Cappuccino":                
                objectCoffee = new Cappuccino();                
                break;
            case "Decaf":
                objectCoffee = new Decaf();                    
                break;  
            case "Espresso":
                objectCoffee = new Espresso();  
                break;
            case "Whipped":                 
                objectCoffee = new Whipped();  
                break;                              
        }       
        /*  - It applied Liskov substitution principle (created by Barbara Liskov) 	
            This coffee class is extended, because is important creating the derivated classes so, They can be handled like the base class.
        */
        objectCoffee.setNameCoffee(getNameCoffee());                
        
        if(objectCoffee!=null)
        {            
            answer(objectCoffee.getNameCoffee());
        }        
        return objectCoffee;        
    }

    @Override
    public void addCoffee() {        
    }
       
    public void answer(String nameCoffee){
        anAnswer = new Answer();
        anAnswer.showMessage("Your "+nameCoffee+" coffee is ready!");
        answer();        
    }
    /*  
        Polymorphism
        (3) Overload or ad-hoc:
        Capacity to define several functions using the same name with different parameters (in the same class)
    */ 
    public void answer(){
        String answerCustomer;        
        answerCustomer = anAnswer.showQuestion(" Do you want another cup of coffee? ");        
        
        if( answerCustomer.equals("Yes!")){            
           Customer.order();
        }else{
            anAnswer.showMessage("Thanks for to run this program .^^. ");
            System.exit(0);
        }
    }

    @Override
    public Coffee prepare() {
        return null;        
    }
}
