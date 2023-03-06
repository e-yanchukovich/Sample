package lesson8.hw3;

import java.util.Date;

public class FinancialContract extends Contract {
    private String code;
    private int sum;

    public FinancialContract() {
        super("", new Date());
        code = "";
        sum = 0;
    }

    public FinancialContract(String number, Date date, String code, int sum) {
        super(number, date);
        this.code = code;
        this.sum = sum;
    }

    @Override
    public void print() {
        System.out.println(number + " " + date + " " + code + " " + number);
    }
}
