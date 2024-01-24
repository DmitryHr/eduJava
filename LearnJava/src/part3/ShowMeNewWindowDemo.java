package part3;

import javax.swing.JOptionPane;

public class ShowMeNewWindowDemo {
    public static void main(String[] args){
        String title = "Message";
        String text = "Continue learn java";
        JOptionPane.showMessageDialog(null,text, title, JOptionPane.QUESTION_MESSAGE);
    }
}
