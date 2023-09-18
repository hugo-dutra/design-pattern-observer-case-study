package chainOfResponsability.healthcare;

import chainOfResponsability.healthcare.enums.HealthSeverity;
import chainOfResponsability.healthcare.implementations.*;
import chainOfResponsability.healthcare.interfaces.EmergencyTriage;
import chainOfResponsability.healthcare.models.Patient;

public class ClientChainHealthCare {
    public static void main(String[] args) {
        Patient patientJonh = new Patient("John", 25, HealthSeverity.LOW);
        Patient patientMary = new Patient("Mary", 30, HealthSeverity.MEDIUM);
        Patient patientPeter = new Patient("Peter", 35, HealthSeverity.HIGH);
        Patient patientPaul = new Patient("Paul", 40, HealthSeverity.CRITICAL);

        EmergencyTriage triage = new Triage();
        EmergencyTriage generalConsultation = new GeneralConsultation();
        EmergencyTriage tests = new Tests();
        EmergencyTriage specialTests = new Specialist();
        EmergencyTriage hospitalization = new Hospitalization();
        EmergencyTriage discharge = new Discharge();

        triage.setNext(generalConsultation);
        generalConsultation.setNext(tests);
        tests.setNext(specialTests);
        specialTests.setNext(hospitalization);
        hospitalization.setNext(discharge);

        System.out.println("Patient"+patientJonh.getName()+" is starting the process");
        triage.emergencyProcess(patientJonh);
        System.out.println("--------------------------------------------------");
        System.out.println("Patient"+patientMary.getName()+" is starting the process");
        triage.emergencyProcess(patientMary);
        System.out.println("--------------------------------------------------");
        System.out.println("Patient"+patientPeter.getName()+" is starting the process");
        triage.emergencyProcess(patientPeter);
        System.out.println("--------------------------------------------------");
        System.out.println("Patient"+patientPaul.getName()+" is starting the process");
        triage.emergencyProcess(patientPaul);
        System.out.println("--------------------------------------------------");

    }
}
