package lesson7.hw2;

public class Patient {

    private String name;
    private TreatmentPlan plan;
    private Doctor doctor;

    public Patient(String name, TreatmentPlan plan) {
        this.name = name;

        setPlan(plan);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreatmentPlan getPlan() {
        return plan;
    }

    public void setPlan(TreatmentPlan plan) {
        this.plan = plan;

        switch (plan.getPlanType()) {
            case 1: {
                doctor = new Surgeon();
                break;
            }
            case 2: {
                doctor = new Dentist();
                break;
            }
            default: {
                doctor = new Therapist();
            }
        }
    }

    public void cure() {
        if (doctor != null) {
            doctor.cure();
        }

        System.out.println(" для " + name);
    }
}
