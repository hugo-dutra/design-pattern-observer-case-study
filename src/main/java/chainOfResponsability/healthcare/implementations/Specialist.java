package chainOfResponsability.healthcare.implementations;

import chainOfResponsability.healthcare.interfaces.EmergencyTriage;
import chainOfResponsability.healthcare.models.Patient;

import java.util.Objects;

public class Specialist implements EmergencyTriage {
    private EmergencyTriage next;
    @Override
    public void setNext(EmergencyTriage emergencyTriage) {
        this.next = emergencyTriage;
    }

    @Override
    public void emergencyProcess(Patient patient) {
        if (Objects.equals(patient.getHealthSeverity().getHealthSeverity(), "HIGH")
                || Objects.equals(patient.getHealthSeverity().getHealthSeverity(), "CRITICAL")
        ) {
            System.out.println("Patient " + patient.getName() + " is being treated by the Specialist");
        }
        if (this.next != null)
            this.next.emergencyProcess(patient);
    }
}
