package BTVN12;

public class Patient extends Person {
    private int patientId;
    private String patientDate;

    public Patient(String name, int age, String gender, int patientId, String patientDate) {
        super(name, age, gender);
        this.patientId = patientId;
        this.patientDate = patientDate;
    }

    public Patient() {
        super();

    }


    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientDate() {
        return patientDate;
    }

    public void setPatientDate(String patientDate) {
        this.patientDate = patientDate;
    }

    @Override
    public String toString() {
        return "Patient: " +
                "\n Name: " + name +
                "\n Age: " + age +
                "\n Gender: " + gender +
                "\n PatientId: " + patientId +
                "\n PatientDate: " + patientDate  ;
    }
}
