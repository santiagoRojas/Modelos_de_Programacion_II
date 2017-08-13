package View;

import Control.ControlCoffee;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Machine extends JFrame implements ActionListener {
    
    private JPanel mainPanel;
    private JLabel namePanel;
    private JButton buttonCappuccino, buttonDecaf, buttonEspresso, buttonWhipped, buttonEnd;
    public String nameCoffee;
    ControlCoffee controlCoffee;
    
    public Machine() {      
        mainPanel = new JPanel(new GridLayout(6, 1));
        namePanel = new JLabel("    What kind of coffee do you want?");
        showButtons();             
        this.add(mainPanel, BorderLayout.CENTER); 
        addButtons();
        this.setTitle(" Coffee Machine! ^3^ ");
        addActions();    
        this.setLocationRelativeTo(null);
        this.setSize(280, 245);
        this.setVisible(true);
    }    
    
    /*   Single responsability principle:
         A class should have one, and only one, reason to change. */
    
    public void addActions(){
        buttonCappuccino.addActionListener(this); 
        buttonDecaf.addActionListener(this); 
        buttonEspresso.addActionListener(this); 
        buttonWhipped.addActionListener(this);         
        buttonEnd.addActionListener(this);         
    }
    
    public void showButtons(){        
        buttonCappuccino = new JButton("Cappuccino");
        buttonDecaf = new JButton("Decaf");
        buttonEspresso = new JButton("Espresso");
        buttonWhipped = new JButton("Whipped");
        buttonEnd = new JButton("Finish");
    }

    public void addButtons(){
        mainPanel.add(namePanel);
        mainPanel.add(buttonCappuccino);
        mainPanel.add(buttonDecaf);
        mainPanel.add(buttonEspresso);
        mainPanel.add(buttonWhipped);
        mainPanel.add(buttonEnd);
    }
    
    public void attend(String nameCoffee){        
        controlCoffee = new ControlCoffee();
        controlCoffee.setNameCoffee(nameCoffee);        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == buttonCappuccino) 
        {  
            nameCoffee = buttonCappuccino.getText();
        }
        if (e.getSource() == buttonDecaf) 
        {  
            nameCoffee = buttonDecaf.getText();
        } 
        if (e.getSource() == buttonEspresso) 
        {  
            nameCoffee = buttonEspresso.getText();
        }
        if (e.getSource() == buttonWhipped) 
        {  
            nameCoffee = buttonWhipped.getText();
        }        
        if (e.getSource() == buttonEnd) 
        {              
            Answer message = new Answer();
            message.showMessage("Thanks for to run this program .^^. ");
            System.exit(0);
        }
        this.setVisible(false);
        attend(nameCoffee);        
    }
}
