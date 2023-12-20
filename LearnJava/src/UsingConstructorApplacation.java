public class UsingConstructorApplacation {
    public static void main (String [] args)
    {
//        создание перевого оббъекта
        MyClass02 objA = new MyClass02();

//        Создание второго объекта с параметрами
        MyClass02 objB = new MyClass02(22, 'D');

        System.out.println("Object objA:");
        objA.show();

        System.out.println("Object objB:");
        objB.show();
    }
}


class MyClass02{
    int number;
    char symbol;

    //Конструктор без аргументов
    MyClass02(){
        number = 100;
        symbol = 'A';
    }

    //Конструктор с двумя аргументами
    MyClass02(int n, char s){
        number = n;
        symbol = s;
    }

    // Метод отображения значения полей объекта
    void show(){
        System.out.println("Значение полей " + number + " и " + symbol);
    }
}
