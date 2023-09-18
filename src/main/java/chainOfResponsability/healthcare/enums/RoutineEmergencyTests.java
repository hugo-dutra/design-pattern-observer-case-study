package chainOfResponsability.healthcare.enums;

public enum RoutineEmergencyTests {
    CBC("Complete Blood Count"),
    BMP("Basic Metabolic Panel"),
    CMP("Comprehensive Metabolic Panel"),
    ECG("Electrocardiogram"),
    XRAY("X-ray"),
    CT_SCAN("CT Scan"),
    MRI("Magnetic Resonance Imaging"),
    URINALYSIS("Urinalysis"),
    TROPONIN("Troponin");

    private String testName;

    RoutineEmergencyTests(String testName) {
        this.testName = testName;
    }

    public String getTestName() {
        return testName;
    }
}
