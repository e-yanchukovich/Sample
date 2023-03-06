package lesson8.hw3;

import java.util.Date;

public class EmployeeContract extends Contract {
    private Date lastDay;
    private String name;

    public EmployeeContract() {
        super("", new Date());
        lastDay = new Date();
        name = "";
    }

    public EmployeeContract(String number, Date date, Date lastDay, String name) {
        super(number, date);
        this.lastDay = lastDay;
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(number + " " + date + " " + lastDay + " " + name);
    }
}
