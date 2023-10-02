package org.example;

public class DataClass {
    int number;
    public DataClass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public double getOpposite(){return 1./number;}

}
