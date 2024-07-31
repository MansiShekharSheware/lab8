package lab9;

import java.util.ArrayList;
import java.util.List;

class Doctor {
    private int id;
    private String name;
    private String speciality;

    public Doctor(int id, String name, String speciality) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Doctor{id=" + id + ", name='" + name + "', speciality='" + speciality + "'}";
    }
}

class DoctorManagementSystem {
    private List<Doctor> doctors = new ArrayList<>();

    public void addDoctor(int id, String name, String speciality) {
        doctors.add(new Doctor(id, name, speciality));
    }

    public void displayDoctors() {
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    public void updateDoctor(int id, String newName, String newSpeciality) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                doctor.setName(newName);
                doctor.setSpeciality(newSpeciality);
            }
        }
    }

    public static void main(String[] args) {
        DoctorManagementSystem dms = new DoctorManagementSystem();
        dms.addDoctor(1, "Dr. Smith", "Cardiology");
        dms.addDoctor(2, "Dr. Jones", "Neurology");
        dms.displayDoctors();

        dms.updateDoctor(1, "Dr. Smith", "Orthopedics");
        dms.displayDoctors();
    }
}

