package chainOfResponsability.healthcare.interfaces;

import chainOfResponsability.healthcare.models.Patient;

public interface EmergencyTriage {
    void setNext(EmergencyTriage emergencyTriage);
    void emergencyProcess(Patient patient);
}
