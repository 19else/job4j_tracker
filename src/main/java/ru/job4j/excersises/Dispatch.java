package ru.job4j.excersises;
//Динамическая диспетчерезация методов
class Ai {
    void callMe() {
        System.out.println("В методе callMe() из класса А");
    }
}

class Bi extends Ai {
    void callMe() {
        System.out.println("В методе callMe() из класса B");
    }
}

class Ci extends Ai{
    void callMe() {
        System.out.println("В методе callMe() из класса С");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        Ai a = new Ai(); // Объект класса Аi
        Bi b = new Bi(); // Объект класса Bi
        Ci c = new Ci(); // Объект класса Ci

        Ai r; // Получить ссылку на объект типа А

        r = a ; // Переменная r ссылается на объект типа Аi
        r.callMe(); // Вызвать вариант метода callMe(), определенный в классе Аi

        r = b; // Переменная r ссылается на объект типа Bi
        r.callMe(); // Вызвать вариант метод callMe(), определенный в класе Bi

        r = c; // Переменная r ссылается на объект типа Ci
        r.callMe(); // Вызвать вариант метода callMe(), определенный в классе Ci
    }

}
