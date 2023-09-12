import java.util.Scanner;

public class ConsoleInputDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String day, mounth;
        System.out.println("Какаой сегодня день?");
        day = input.nextLine();
        System.out.println("Какой сейчас месяц?");
        mounth = input.nextLine();
        String text;
        text = "Сегодня "+day+ ", месяц - "+ mounth;
        System.out.println(text);
    }
}
