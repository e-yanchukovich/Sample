package lesson8.hw3;

import java.util.Date;

public class SupplyContract extends  Contract {
    private String type;
    private int amount;

    public SupplyContract() {
        super("", new Date());
        type = "";
        amount = 0;
    }

    public SupplyContract(String number, Date date, String type, int amount) {
        super(number, date);
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void print() {
        System.out.println(number + " " + date + " " + type + " " + amount);
    }
}
