package Exercise;

import javax.swing.*;

public class JavaGUI {

    public int collectInput(){
        String input = "";
        input = JOptionPane.showInputDialog("Enter a number");
        try {
            return Integer.parseInt(input);
        }catch(NumberFormatException e){return 0;}
    }
    public void sum(int first, int second){
        int sum = first + second;
        JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of two numbers", JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String[] args) {
        JavaGUI gui = new JavaGUI();
       int firstNumber = gui.collectInput();
       int secondNumber = gui.collectInput();
       gui.sum(firstNumber, secondNumber);
    }
}
