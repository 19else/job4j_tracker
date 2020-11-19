package ru.job4j.excersises;

    //Методы с отличающимися сигнатурами считаются
    //перегружаемыми, а не переопределенными
    class A {
        int i, j;
        A(int a, int b) {
            i = a;
            j = b;
        }
        //Выводим содержимое переменных i и j
        void show() {
            System.out.println("i и j : " + i + " " + j);
        }
    }

    //Создать подкласс путем расширения класс А

    class B extends A {
        int k;
        B(int a, int b, int c) {
            super(a, b);
            k = c;
        }
        //перегрузить метод super()
        void show(String msg) {
            System.out.println(msg + k);
    }
}

public class Override {
    public static void main(String[] args) {
        B subOb = new B(1,2,3);

        subOb.show("This is k : "); // Вызывает метод show() из касса B
        subOb.show(); // вызывает метод show() из класса А
    }
}
