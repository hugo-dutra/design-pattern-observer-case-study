package chainOfResponsability.healthcare.implementations;

import chainOfResponsability.healthcare.enums.HealthSeverity;
import chainOfResponsability.healthcare.interfaces.EmergencyTriage;
import chainOfResponsability.healthcare.models.Patient;

public class Discharge implements EmergencyTriage {
    private EmergencyTriage next;
    @Override
    public void setNext(EmergencyTriage emergencyTriage) {
        this.next = emergencyTriage;
    }

    @Override
    public void emergencyProcess(Patient patient) {
        if (patient.getHealthSeverity().getHealthSeverity().equals(HealthSeverity.LOW.getHealthSeverity())) {
            System.out.println("Patient " + patient.getName() + " is being treated by the Discharge");
        }
        if (this.next != null)
            this.next.emergencyProcess(patient);
    }
}
