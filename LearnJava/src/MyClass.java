import javax.swing.JOptionPane;

public class MyClass {
    int number;
    char symbol;
}

class UsingObjectDemo{
    public static void main(String[] args){
        MyClass obj = new MyClass();

        obj.number = 100;
        obj.symbol = 'A';

        String text = "Число: "+ obj.number+"\n";
        text += "Символ: "+obj.symbol;

        JOptionPane.showMessageDialog(null, text);
    }
}