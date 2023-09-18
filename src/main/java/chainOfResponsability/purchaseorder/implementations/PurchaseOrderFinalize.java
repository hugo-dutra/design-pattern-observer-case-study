package chainOfResponsability.purchaseorder.implementations;

import chainOfResponsability.purchaseorder.interfaces.PurchaseOrder;
import chainOfResponsability.purchaseorder.models.Order;

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
