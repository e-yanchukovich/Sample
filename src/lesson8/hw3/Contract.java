package lesson8.hw3;

import java.util.Date;

public abstract class Contract {
    protected String number;
    protected Date date;

    public Contract(String number, Date date) {
        this.number = number;
        this.date = date;
    }

    public abstract void print();
}
