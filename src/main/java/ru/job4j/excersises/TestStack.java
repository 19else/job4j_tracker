package ru.job4j.excersises;

import java.util.Arrays;
import java.util.SortedMap;

//В этом классе определяется целочисленный стек, где
//можно хранить до 10 целочисленных значений
class Stack {
    int[] stck = new int[10];
    int tos;
    //инициализировать вершину стека -1
    Stack() {
        tos = -1;
    }
    //Разместить элемент в стеке
    void push(int item) {
    if(tos == 9) {
        System.out.println("Стек заполнен");
    } else
        stck [++tos] = item;
    }
    //Извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        }
        else return stck[tos--];
    }
}

class Stack2 {
    String[] stack = new String[5];
    int tos;

    Stack2() {
        tos = -1;
    }

    void push(String item) {
        if (Arrays.equals(stack, new String[4])) {
            System.out.println("Стек заполнен");
        } else stack[++tos] = item;
    }

    String pop() {
        if (tos < 0) {
            System.out.println("Stack isn't loaded");
            return "0";
        } else return stack[tos--];
    }
}

public class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();
        Stack myStack3 = new Stack();
        Stack2 meStringStack = new Stack2();
        String[] array = new String[]{"f", "a", "f", "r","q", "e"};
        for (int i = 0; i < meStringStack.stack.length ; i++) {
            meStringStack.push(array[i]);
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.print(meStringStack.pop() + " ");

        }

        //Разместить числа в стеке
        for (int i = 0; i < 10 ; i++) { myStack1.push(i);}
        for (int i = 10; i < 20 ; i++) { myStack2.push(i);}

        //размещаем слова в стеке
        for (int i = 0; i < 5 ; i++) {
            meStringStack.push("(i)");
        }


        //извлечь эти числа из стека
        System.out.println("Содержимое myStack1 = ");
        for (int i = 0; i < 10 ; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("Содержимое myStack2 = ");
        for (int i = 10; i < 20 ; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
