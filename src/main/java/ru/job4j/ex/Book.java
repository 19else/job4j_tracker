package ru.job4j.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Book {
    private String name;
    private int releaseYear;
    private String isbn;

    public Book(String name, int releaseYear, String isbn) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The fellowship of the ring", 1954, "159753"));
        bookList.add(new Book("The Two Tower", 1954, "02459785"));
        bookList.add(new Book("The return of the king", 1955, "951753"));
        System.out.println(listToMap(bookList));
    }

    public static Map<Integer, String> listToMap(List<Book> books) {
        return books.stream()
                .collect(Collectors.toMap(Book::getReleaseYear, Book::getName,
                        (i, s) -> i));
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
