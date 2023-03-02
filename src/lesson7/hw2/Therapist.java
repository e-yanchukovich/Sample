package lesson7.hw2;

public class Therapist extends Doctor{
    @Override
    protected void cure() {
        System.out.print("Терапевт ставит диагноз");
    }
}
