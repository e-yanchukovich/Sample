package lesson6;

import lesson6.hw2.CashMachine;

public class Homework2 {
    public static void main(String[] args) {
        CashMachine cashMashine = new CashMachine(2, 3, 6);
        cashMashine.payment(460);
        cashMashine.addCash(0, 0, 5);
        cashMashine.payment(460);
    }
}