package ru.job4j.ex;

public class ElementNotFoundAbuseException extends ElementNotFoundException {
    public ElementNotFoundAbuseException (String message) {
        super(message);
    }
}
