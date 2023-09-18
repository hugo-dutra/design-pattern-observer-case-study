package chainOfResponsability.healthcare.implementations;

import chainOfResponsability.healthcare.interfaces.EmergencyTriage;
import chainOfResponsability.healthcare.models.Patient;

public class Hospitalization implements EmergencyTriage {
    private EmergencyTriage next;
    @Override
    public void setNext(EmergencyTriage emergencyTriage) {
        this.next = emergencyTriage;
    }

    @Override
    public void emergencyProcess(Patient patient) {
        if (patient.getHealthSeverity().getHealthSeverity().equals("CRITICAL")) {
            System.out.println("Patient " + patient.getName() + " is being treated by the Hospitalization");
        }
        if (this.next != null)
            this.next.emergencyProcess(patient);
    }
}
