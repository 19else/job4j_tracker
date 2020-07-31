package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Clean Code", 100);
        Book second = new Book("Государство", 200);
        Book third = new Book("От простого к сложному", 300);
        Book fourth = new Book("Преступление и Наказание", 400);
        Book [] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        for (int index = 0; index < books.length; index++) {
            Book boo = books[index];
            System.out.println("Книга " + boo.getName() + " содержит " + boo.getPages() + " страниц");
        }
        System.out.println("Переставляем местами книги c индексами 0 и 3 ");
        Book zero = books[0];
        books[0] = books[3];
        books[3] = zero;
        Book three = books[3];
        books[3] = books [1];
        books[1] = three;
        for (int index = 0; index < books.length; index++) {
            Book boo = books[index];
            System.out.println("Книга " + boo.getName() + " содержит " + boo.getPages() + " страниц");
        }
        System.out.println("Выводим напечать только книгу с именем Clean Code");
        for (int index = 0; index < books.length; index++) {
            Book boo = books[index];
            if(boo.getName().equals("Clean Code")) {
                System.out.println("Книга " + boo.getName() + " содержит " + boo.getPages() + " страниц");
            }
        }
    }
}
