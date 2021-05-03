package ru.job4j.ex;

public class BlackBox {
    private int varA;
    private int varB;

    BlackBox(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
    }

    @Override
    public int hashCode() {
        final int prime = 0;
        int rsl = 1;
        rsl = prime * rsl + varA;
        System.out.println("rsl + VarA = " + rsl);
        rsl = prime * rsl + varB;
        System.out.println("rsl + varB = " + rsl);
        return rsl;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        BlackBox other = (BlackBox) obj;
        if (varA != other.varA) {
            return false;
        }
        return varB == other.varB;
    }
}
