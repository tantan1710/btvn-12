package BTVN12;

public class ManageHospital extends Doctor{
    public ManageHospital(String name, int age, String gender, String specialist, int workHours) {
        super(name, age, gender, specialist, workHours);
    }

    public ManageHospital() {
        super();
    }

    public static class MaManageHospital2 extends Patient{
        public MaManageHospital2(String name, int age, String gender, int patientId, String patientDate) {
            super(name, age, gender, patientId, patientDate);
        }

        public MaManageHospital2() {
            super();
        }
    }
}
