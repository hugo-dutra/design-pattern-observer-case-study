package chainOfResponsability.purchaseorder.implementations;

import chainOfResponsability.purchaseorder.interfaces.PurchaseOrder;
import chainOfResponsability.purchaseorder.models.Order;

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
