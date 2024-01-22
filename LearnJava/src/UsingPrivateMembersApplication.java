class MyClass03{
    private static int count = 0;

    private int number;
    private String name;

    MyClass03 (String n){
        count++;
        name = n;
        number = count;

        System.out. println("Создано объект с именем: "+name);
    }

    public void show(){
        System.out. println("Название объекта "+name);
        System.out. println("Номер объекта "+number);
        System.out. println("Количество объектов "+count);
    }

    public void set(String n){
        name = n;
    }
        }

public class UsingPrivateMembersApplication {
    public static void main(String [] args){
        MyClass03 objA = new MyClass03("Alpha");
        MyClass03 objB = new MyClass03("Betta");
        MyClass03 objC = new MyClass03("Charlie");

        objA.show();
        objB.show();
        objC.show();

        objB.set("Gamma");
        objB.show();

    }
}
