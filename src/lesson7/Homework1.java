package lesson7;

import lesson7.hw1.Phone;

public class Homework1 {

    public static void main(String[] args) {
        Phone phone1 = new Phone("0001", "Nokia", 100f);
        Phone phone2 = new Phone("0002", "Samsung", 150f);
        Phone phone3 = new Phone("0003", "Redmi", 200f);

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());

        phone1.recieveCall("Вася");
        System.out.println(phone1.getNumber());
        phone2.recieveCall("Маша");
        System.out.println(phone2.getNumber());
        phone3.recieveCall("Петя");
        System.out.println(phone3.getNumber());

        phone1.receiveCall("Даша", "0004");
        phone2.receiveCall("Дима", "0005");
        phone3.receiveCall("Катя", "0006");

        phone1.sendMessage("0007", "0008", "0009");
    }
}
