package chainOfResponsability.healthcare.enums;

public enum HealthSeverity {
    LOW("LOW"),
    MEDIUM("MEDIUM"),
    HIGH("HIGH"),
    CRITICAL("CRITICAL");

    private String healthSeverity;
    HealthSeverity(String healthSeverity) {
        this.healthSeverity = healthSeverity;
    }

    public String getHealthSeverity() {
        return healthSeverity;
    }
}
