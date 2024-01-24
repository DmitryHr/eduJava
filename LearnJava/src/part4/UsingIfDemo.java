package part4;

import javax.swing.*;

public class UsingIfDemo {
    public static void main(String [] args){
        String input, text, title;
        Integer number;
        ImageIcon img;

        input = JOptionPane.showInputDialog(null, "Введите целое число", "Проверка числа", JOptionPane.QUESTION_MESSAGE);

        if (input == null){
            JOptionPane.showMessageDialog(null, "Вы не ввели число", "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        number = Integer.parseInt(input);
        if (number%2 ==0){
            img = new ImageIcon("D:/even.png");
            text = "Число " +number+ " - четное!";
            title = "Четное число";
        }
        else {
            img = new ImageIcon("D:/odd.png");
            text = "Число " +number+ " - нечетное!";
            title = "Нечетное число.";
        }

        JOptionPane.showMessageDialog(null, text, title, JOptionPane.PLAIN_MESSAGE, img);

    }
}
