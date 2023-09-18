package chainOfResponsability.anotherProject.implementations;

import chainOfResponsability.anotherProject.interfaces.PurchaseOrder;
import chainOfResponsability.anotherProject.models.Order;

public class PurchaseOrderAddress implements PurchaseOrder {
    private PurchaseOrder nextStep;
    @Override
    public void setNextStep(PurchaseOrder nextStep) {
        this.nextStep = nextStep;
    }

    @Override
    public void processOrder(Order order) {
        if (order.getAddress() != null && !order.getAddress().isEmpty()) {
            System.out.println("Checking address...Address OK");
            if (nextStep != null) {
                nextStep.processOrder(order);
            }
        } else {
            System.out.println("Address not OK");
        }
    }
}
