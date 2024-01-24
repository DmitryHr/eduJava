package part3;

public class MethodOverloadingApplication {
public static void main(String[]arg){

    MyClass01 objA, objB;
    objA = new MyClass01();
    objB = new MyClass01();

    objA.set(100);
    objB.set('A');

    System.out.println("Объект objA:");
    objA.show();
    objB.set();
    objB.show();
    objB.set(200, 'B');
    System.out.println("Объект после изменения");
    objB.show("Число", "Сисмвол");

}
}

class MyClass01{
    int number;
    char symbol;
    
    
    void set(int n){
        number = n;
    }

    void set(char s){
        symbol = s;
    }

    void set(int n, char s){
        set(n);
        set(s);
    }

    //Метод без аргументов
    void set(){
        set(0, 'Z');
    }

    void show(){
        System.out.println("Значение полей "+number+ " и " + symbol);
    }

    void show(String txt){
        System.out.println(txt+"Значение полей "+number+ " и " + symbol);
    }

    void show(String txt, String txt2){
        System.out.println(txt+": "+number);
        System.out.println(txt+": "+symbol);
    }
}


