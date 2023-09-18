package chainOfResponsability.healthcare.implementations;

import chainOfResponsability.healthcare.enums.HealthSeverity;
import chainOfResponsability.healthcare.enums.RoutineEmergencyTests;
import chainOfResponsability.healthcare.interfaces.EmergencyTriage;
import chainOfResponsability.healthcare.models.MedicalExam;
import chainOfResponsability.healthcare.models.Patient;

import java.util.Objects;
import java.util.stream.Collectors;

public class Tests implements EmergencyTriage {
    private EmergencyTriage next;

    @Override
    public void setNext(EmergencyTriage emergencyTriage) {
        this.next = emergencyTriage;
    }

    @Override
    public void emergencyProcess(Patient patient) {
        if (Objects.equals(patient.getHealthSeverity().getHealthSeverity(), HealthSeverity.HIGH.getHealthSeverity())) {
            System.out.println("Patient " + patient.getName() + " is being treated by the Tests");
            patient.setMedicalExams(choseRandomExam(patient).getMedicalExams());
            patient.setMedicalExams(choseRandomExam(patient).getMedicalExams());
        }
        if (Objects.equals(patient.getHealthSeverity().getHealthSeverity(), HealthSeverity.CRITICAL)) {
            System.out.println("Patient " + patient.getName() + " is being treated by the Tests");
            patient.setMedicalExams(choseRandomExam(patient).getMedicalExams());
            patient.setMedicalExams(choseRandomExam(patient).getMedicalExams());
            patient.setMedicalExams(choseRandomExam(patient).getMedicalExams());
            patient.setMedicalExams(choseRandomExam(patient).getMedicalExams());
            patient.setMedicalExams(choseRandomExam(patient).getMedicalExams());
        }
        if (this.next != null)
            next.emergencyProcess(updateExamResults(patient));
    }

    private Patient choseRandomExam(Patient patient) {
        int randomExam = (int) (Math.random() * 5);
        StringBuilder sb = new StringBuilder();
        switch (randomExam) {
            case 0:
                patient.addMedicalExam(new MedicalExam(RoutineEmergencyTests.CBC));
                sb.setLength(0);
                sb
                        .append("Patient ")
                        .append(patient.getName())
                        .append(" is being treated by the Tests ")
                        .append(RoutineEmergencyTests.CBC.getTestName());
                System.out.println(sb.toString());
                break;
            case 1:
                patient.addMedicalExam(new MedicalExam(RoutineEmergencyTests.CMP));
                sb.setLength(0);
                sb
                        .append("Patient ")
                        .append(patient.getName())
                        .append(" is being treated by the Tests ")
                        .append(RoutineEmergencyTests.CMP.getTestName());
                System.out.println(sb.toString());
                break;
            case 2:
                patient.addMedicalExam(new MedicalExam(RoutineEmergencyTests.ECG));
                sb.setLength(0);
                sb = new StringBuilder()
                        .append("Patient ")
                        .append(patient.getName())
                        .append(" is being treated by the Tests ")
                        .append(RoutineEmergencyTests.ECG.getTestName());
                System.out.println(sb.toString());
                break;
            case 3:
                patient.addMedicalExam(new MedicalExam(RoutineEmergencyTests.XRAY));
                sb.setLength(0);
                sb = new StringBuilder()
                        .append("Patient ")
                        .append(patient.getName())
                        .append(" is being treated by the Tests ")
                        .append(RoutineEmergencyTests.XRAY.getTestName());
                System.out.println(sb.toString());
                break;
            case 4:
                patient.addMedicalExam(new MedicalExam(RoutineEmergencyTests.MRI));
                sb.setLength(0);
                sb = new StringBuilder()
                        .append("Patient ")
                        .append(patient.getName())
                        .append(" is being treated by the Tests ")
                        .append(RoutineEmergencyTests.MRI.getTestName());
                System.out.println(sb.toString());
                break;
        }
        return patient;
    }

    private Patient updateExamResults(Patient patient) {
        patient.setMedicalExams(
                patient
                        .getMedicalExams()
                        .stream()
                        .map(medicalExam -> {
                            medicalExam.setDone("Done:" + medicalExam.getName()+"\n");
                            return medicalExam;
                        }).collect(Collectors.toList())
        );
        System.out.println("Patient " + patient.getName() + " has finished the Tests");
        return patient;
    }
}
