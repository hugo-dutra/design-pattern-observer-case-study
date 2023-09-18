package chainOfResponsability.healthcare.models;

import chainOfResponsability.healthcare.enums.RoutineEmergencyTests;

public class MedicalExam {
    private final RoutineEmergencyTests routineEmergencyTests;
    private final String name;
    private boolean done = false;
    private String medicalReport = "";

    public MedicalExam(RoutineEmergencyTests routineEmergencyTests) {
        this.routineEmergencyTests = routineEmergencyTests;
        this.name = routineEmergencyTests.getTestName();
    }

    public RoutineEmergencyTests getRoutineEmergencyTests() {
        return routineEmergencyTests;
    }

    public String getName() {
        return name;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(String medicalReport) {
        this.done = true;
        this.medicalReport = medicalReport;
    }

    public String getMedicalReport() {
        return medicalReport;
    }


}
