package chainOfResponsability.healthcare.implementations;

import chainOfResponsability.healthcare.enums.HealthSeverity;
import chainOfResponsability.healthcare.interfaces.EmergencyTriage;
import chainOfResponsability.healthcare.models.Patient;

import java.util.Objects;

public class GeneralConsultation implements EmergencyTriage {
    private EmergencyTriage next;
    @Override
    public void setNext(EmergencyTriage emergencyTriage) {
        this.next = emergencyTriage;
    }

    @Override
    public void emergencyProcess(Patient patient) {
        if (Objects.equals(patient.getHealthSeverity(), HealthSeverity.MEDIUM) ||
                Objects.equals(patient.getHealthSeverity(), HealthSeverity.LOW)) {
            System.out.println("Patient " + patient.getName() + " is being treated by the General Consultation");
            patient.setHealthSeverity(updateRandomHealthSeverity(patient).getHealthSeverity());
        }
        if (this.next != null)
            next.emergencyProcess(patient);
    }

    private Patient updateRandomHealthSeverity(Patient patient) {
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
