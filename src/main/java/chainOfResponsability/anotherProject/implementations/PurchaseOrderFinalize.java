package chainOfResponsability.anotherProject.implementations;

import chainOfResponsability.anotherProject.interfaces.PurchaseOrder;
import chainOfResponsability.anotherProject.models.Order;

public class PurchaseOrderFinalize implements PurchaseOrder {
    private PurchaseOrder nextStep;
    @Override
    public void setNextStep(PurchaseOrder nextStep) {
        this.nextStep = nextStep;
    }

    @Override
    public void processOrder(Order order) {
        System.out.println("Finalizing order...");
        if (nextStep != null) {
            nextStep.processOrder(order);
        }
    }
}
