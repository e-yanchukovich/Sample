package lesson7;

import lesson7.hw2.TreatmentPlan;
import lesson7.hw2.Patient;

public class Homework2 {
    public static void main(String[] args) {
        Patient patient;
        patient = new Patient("Вася", new TreatmentPlan(1));

        patient.cure();
    }
}
