package chainOfResponsability.purchaseorder.enums;

public enum PurchaseStepEnum {
    INVENTORY("INVENTORY"),
    ADDRESS_VALIDATION("ADDRESS_VALIDATION"),
    FINAL_APPROVAL("FINAL_APPROVAL"),
    CREDIT("CREDIT");

    private final String displayName;

    PurchaseStepEnum(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
