class MyClass1251 {
    static int count = 0;
    MyClass1251(){
        count++;

    System.out.println("Создан объект номер "+count);
    }
   void show(){
        System.out.println("Количество объектов: "+count);
    }

}

class UsingStaticMembersDemo {
    public static void main (String [] args){
        MyClass1251 stMeth = new MyClass1251();
        stMeth.show();

        MyClass1251 objA = new MyClass1251();
        MyClass1251 objB = new MyClass1251();
        MyClass1251 objC = new MyClass1251();
        MyClass1251 objD = new MyClass1251();

        stMeth.show();

//        objB.show();
//        objC.show();
    }
}
