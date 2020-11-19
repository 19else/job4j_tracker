package ru.job4j.excersises;

class TestOne {
    int a, b;
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

}

class TestTwo { // Объекты передаются по ссылке на них
    int a, b;
    TestTwo (int i, int j) {
        a = i; // ссылка на i
        b = j; // ссылка на j
    }
    void methReObj (TestTwo ob) { // Передать объект
        ob.a *= 2;
        ob.b /= 2;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        TestOne ob = new TestOne();
        int a = 15;
        int b = 20;
        ob.meth(a, b);
        System.out.println("а и b до вызова: " + a + " " + b);

        System.out.println("a и b после вызова: " + ob.a + " " + ob.b);
        TestTwo ob1 = new TestTwo(a, b);
        System.out.println("ob.a и ob.b до вызова " + ob1.a + " " + ob1.b);
        ob1.methReObj(ob1); //передаем ссылку на объект
        System.out.println("ob.a и ob.b после вызова " + ob1.a + " " + ob1.b);
    }
}
