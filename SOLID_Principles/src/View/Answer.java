package View;

import javax.swing.JOptionPane;

public class Answer {
    
    public static final String[] options = { "Yes!", "No" };
    
    public void showMessage(String message)
    {
        JOptionPane.showMessageDialog(null, message);
    }
    
    public void showError(String message)
    {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public String showQuestion(String question)
    {
        String answerQuestion = (String) JOptionPane.showInputDialog(null, question, "^3^ Question",JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        return answerQuestion;
        
    }

}

