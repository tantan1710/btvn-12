package BTVN12;

public class Doctor extends Person{
    private String specialist;
    private int workHours;

    public Doctor(String name, int age, String gender, String specialist, int workHours) {
        super(name, age, gender);
        this.specialist = specialist;
        this.workHours = workHours;
    }

    public Doctor() {
        super();
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    @Override
    public String toString() {
        return "Doctor: " +
                "\n Name: " + name +
                "\n Age: " + age +
                "\n Gender: " + gender +
                "\n Specialist: " + specialist +
                "\n WorkHours: " + workHours  ;


    }
}
