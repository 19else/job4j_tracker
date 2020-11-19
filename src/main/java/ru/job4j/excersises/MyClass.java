package ru.job4j.excersises;

class My {
    static void myStaticMethod() {
        System.out.println("I am static 1 - class My");
    }
}

class MySubClass extends My  {
    static void myStaticMethod() {
        System.out.println("I am static 2 - class MySubClass");
    }


}

public class MyClass{
    public static void main(String[] args) {

        My me = new MySubClass();


        My.myStaticMethod();
        MySubClass.myStaticMethod();

    }

}
