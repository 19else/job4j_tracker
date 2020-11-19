package ru.job4j.excersises;
// В этой версии класса БОКС один объект допускается
// инициализировать один объект другим
public class Box {
    double width;
    double height;
    double depth;

    // Обратите внимание на этот конструктор. В качестве
    // параметра в нем используется объект типа БОКС
    Box(Box ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //Констуктор, используемый, когда
    //указываются все параметры
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор, если ни один из
    // размеров не указан
    Box() {
        width = -1; // используем значение -1
        height = -1; // для обозначения неинициализованного
        depth = -1; // параллепипеда
    }

    // Конструктор, при создании кубу
    Box(double len) {
        width = height = depth = len;
    }

    // Рассчитать и возвратить объем
    double volume () {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight; // Вес параллепипеда
    //Конструктор BoxWeight
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class ColorBox extends Box {
    int color;
    ColorBox(double w, double h, double d, int c) {
        super(w);
      //  width = w;
        height = h;
        depth = d;
        color = c;

      //  System.out.println("Цвет параллепипеда = " + c);
    }
    void numberOfColor() {

        System.out.println("Number if Color = " + color);
    }
}
class OverloadCons2 {
    public static void main(String[] args) {
        //Создать параллепипеды, используя
        // разные конструкции
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);
        ColorBox colorBox = new ColorBox(5,3,2, 1);
        double vol;
        double col;
        vol = colorBox.volume();
        System.out.println("Объем параллепипеда ColorBox равен " + vol);
        System.out.println("Номер цвета параллепипеда = " + colorBox.color);
        colorBox.numberOfColor();


        Box myClone = new Box (myBox1);
        // Создать копию объекта myBox1


        // Получить объем первого параллепипеда
        vol = myBox1.volume();
        System.out.println("Объем myBox1 = " + vol);

        // Получить объем второго параллепипеда
        vol = myBox2.volume();
        System.out.println("Объем myBox2 = " + vol);

        // получить объем куба
        vol = myCube.volume();
        System.out.println("Объем myCube = " + vol);

        // получить объем клона
        vol = myClone.volume();
        System.out.println("Объем myClone = " + vol);
    }
}
