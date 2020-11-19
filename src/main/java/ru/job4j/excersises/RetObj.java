package ru.job4j.excersises;

class TestThr {
    int a;

    TestThr (int i) {
        a = i;
    }

    TestThr incrByTen() {
        TestThr temp = new TestThr(a + 10);
        return temp;
    }
}

public class RetObj {
    public static void main(String[] args) {
        TestThr ob1 = new TestThr(2);
        TestThr ob2;
        TestThr ob3;


        ob2 = ob1.incrByTen();
        System.out.println("ob1.a = " + ob1.a);
        System.out.println("ob2.a = " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a после второго увеличения значения = " + ob2.a);
        ob3 = ob2.incrByTen();
        System.out.println("ob3.a после третьего увеличения значения = " + ob3.a);
    }
}
