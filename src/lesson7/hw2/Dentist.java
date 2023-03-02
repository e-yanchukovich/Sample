package lesson7.hw2;

public class Dentist extends Doctor {
    @Override
    protected void cure() {
        System.out.print("Дантист лечит зубы");
    }
}
