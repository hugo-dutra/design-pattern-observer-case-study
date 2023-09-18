package chainOfResponsability.healthcare.implementations;

import chainOfResponsability.healthcare.enums.HealthSeverity;
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
        patient.setHealthSeverity(updateHelthSeverityRrandomly(patient).getHealthSeverity());
        if (this.next != null)
            this.next.emergencyProcess(patient);
    }

    private Patient updateHelthSeverityRrandomly(Patient patient) {
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
        if(!patient.getHealthSeverity().equals(HealthSeverity.LOW)){
            System.out.println("Patient " + patient.getName() + " is being treated by the Hospitalization with severity " + patient.getHealthSeverity().getHealthSeverity());
            updateHelthSeverityRrandomly(patient);
        }
        return patient;
    }


}
