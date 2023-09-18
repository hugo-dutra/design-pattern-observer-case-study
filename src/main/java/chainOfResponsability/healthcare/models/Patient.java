package chainOfResponsability.healthcare.models;

import chainOfResponsability.healthcare.enums.HealthSeverity;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private final String name;
    private final int age;
    public List<MedicalExam> medicalExams = new ArrayList<>();

    private HealthSeverity healthSeverity;

    public Patient(String name, int age, HealthSeverity healthSeverity) {
        this.name = name;
        this.age = age;
        this.healthSeverity = healthSeverity;
    }

    public void addMedicalExam(MedicalExam medicalExam) {
        if (!medicalExams.contains(medicalExam))
            medicalExams.add(medicalExam);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public HealthSeverity getHealthSeverity() {
        return healthSeverity;
    }

    public void setHealthSeverity(HealthSeverity healthSeverity) {
        this.healthSeverity = healthSeverity;
    }

    public List<MedicalExam> getMedicalExams() {
        return medicalExams;
    }

    public void setMedicalExams(List<MedicalExam> medicalExams) {
        this.medicalExams = medicalExams;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", medicalExams=" + medicalExams +
                ", healthSeverity=" + healthSeverity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;

        Patient patient = (Patient) o;

        if (getAge() != patient.getAge()) return false;
        if (!getName().equals(patient.getName())) return false;
        if (!getMedicalExams().equals(patient.getMedicalExams())) return false;
        return getHealthSeverity() == patient.getHealthSeverity();
    }
}
