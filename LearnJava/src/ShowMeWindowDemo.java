import javax.swing.JOptionPane;

class ShowMeWindowDemo {
    public static void main (String[] args){
        String title;
        String text;
        title = JOptionPane.showInputDialog(null, "Name for window", "Name", JOptionPane.WARNING_MESSAGE);
        text = JOptionPane.showInputDialog(null, "Text message", "Содержание", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Моя не первая программа!");
    }
}
