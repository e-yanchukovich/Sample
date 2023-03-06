package lesson8;

import lesson8.hw3.*;

import java.util.Date;

public class Homework3 {
    public static void main(String[] args) {
        Register reg = new Register();

        Contract c1 = new EmployeeContract("100EC", new Date(2023, 01, 01), new Date(2023, 02, 02), "Вася");
        reg.addContract(c1);

        Contract c2 = new FinancialContract("100FC", new Date(2023, 01, 01), "code", 100);
        reg.addContract(c2);

        Contract c3 = new SupplyContract("100SC", new Date(2023, 01, 01), "type", 50);
        reg.addContract(c3);

        reg.print(c1);
        reg.print(c2);
        reg.print(c3);
    }
}
