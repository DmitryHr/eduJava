package part3;

import javax.swing.JOptionPane;

class InputDialogDemo {
    public static void main(String[] args){
        String text;
        text = JOptionPane.showInputDialog("Input text");
        JOptionPane.showMessageDialog(null, "You input this text:\n" +text);

    }
}
