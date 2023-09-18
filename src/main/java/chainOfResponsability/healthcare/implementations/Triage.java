package chainOfResponsability.healthcare.implementations;

import chainOfResponsability.healthcare.enums.HealthSeverity;
import chainOfResponsability.healthcare.interfaces.EmergencyTriage;
import chainOfResponsability.healthcare.models.Patient;

import java.util.Objects;

public class Triage implements EmergencyTriage {
    private EmergencyTriage next;
    @Override
    public void setNext(EmergencyTriage emergencyTriage) {
        this.next = emergencyTriage;
    }

    @Override
    public void emergencyProcess(Patient patient) {
        patient.setHealthSeverity(setRandoPatientSeverity(patient).getHealthSeverity());
        if (Objects.equals(patient.getHealthSeverity().getHealthSeverity(), HealthSeverity.LOW.getHealthSeverity())) {
            System.out.println("Patient " + patient.getName() + " is being treated by the Triage");
        }
        next.emergencyProcess(patient);
    }

    private Patient setRandoPatientSeverity(Patient patient) {
        int randomSeverity = (int) (Math.random() * 4);
        switch (randomSeverity) {
            case 0:
                patient.setHealthSeverity(HealthSeverity.LOW);
                break;
            case 1:
                patient.setHealthSeverity(HealthSeverity.MEDIUM);
                break;
            case 2:
                patient.setHealthSeverity(HealthSeverity.HIGH);
                break;
            case 3:
                patient.setHealthSeverity(HealthSeverity.CRITICAL);
                break;
        }
        return patient;
    }
}
