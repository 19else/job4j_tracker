package ru.job4j.excersises;

public class PrivateConstr {
    double line;

    PrivateConstr (double line2) {
        line = line2 * 2;

    }

    public static void main(String[] args) {
        PrivateConstr constr = new PrivateConstr(5);
       // constr.line = 15;
        System.out.println(constr.line);
        System.out.println(constr);
    }
}
