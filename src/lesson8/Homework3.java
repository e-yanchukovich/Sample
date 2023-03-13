package lesson8;

import lesson8.hw3.*;

import java.util.Calendar;
import java.util.Date;

public class Homework3 {
    public static void main(String[] args) {
        Register reg = new Register();

        Contract c1 = new EmployeeContract("100EC", new Date(2023, Calendar.JANUARY, 01), new Date(2023, 02, 02), "Вася");
        reg.addContract(c1);

        Contract c2 = new FinancialContract("101FC", new Date(2023, Calendar.FEBRUARY, 02), "code", 100);
        reg.addContract(c2);

        Contract c3 = new SupplyContract("102SC", new Date(2023, Calendar.MAY, 03), "type", 50);
        reg.addContract(c3);

        reg.print("100EC");
        reg.print("101FC");
        reg.print("102SC");
        reg.print("103SC");
    }
}
