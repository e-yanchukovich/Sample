package lesson8.hw3;

public class Register {

    Contract[] arr;
    int count;

    public Register() {
        arr = new Contract[10];
        count = 0;
    }

    public void addContract(Contract c) {
        if (count < arr.length) {
            arr[count] = c;
            count++;
        } else {
            System.out.println("Регистр заполнен");
        }
    }

    public void print(String number) {
        for (int i = 0; i < count; i++) {
            if (arr[i].getNumber().equals(number)) {
                arr[i].print();
                return;
            }
        }
        System.out.println("Данный докумет отсутствует");
    }
}
