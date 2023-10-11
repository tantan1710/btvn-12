package BTVN12;

public class Main {

    public static void main(String[] args) {
        ManageHospital doctor = new ManageHospital();
        doctor.setName("Tan");
        doctor.setAge(22);
        doctor.setGender("MALE");
        doctor.setSpecialist("Tim mach");
        doctor.setWorkHours(12);

        System.out.println(doctor);

        ManageHospital.MaManageHospital2 patient = new ManageHospital.MaManageHospital2();
        patient.setName("Tho");
        patient.setAge(99);
        patient.setGender("FEMALE");
        patient.setPatientId(1);
        patient.setPatientDate("11/10/2023");

        System.out.println(patient);




    }

}
