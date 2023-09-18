package chainOfResponsability.purchaseorder.implementations;

import chainOfResponsability.purchaseorder.interfaces.PurchaseOrder;
import chainOfResponsability.purchaseorder.models.Order;

public class PurchaseOrderStock implements PurchaseOrder {
    private PurchaseOrder nextStep;
    @Override
    public void setNextStep(PurchaseOrder nextStep) {
        this.nextStep = nextStep;
    }

    @Override
    public void processOrder(Order order) {
        if (!order.getOrderItems().isEmpty()) {
            System.out.println("Checking stock...Stock OK");
            if (nextStep != null) {
                nextStep.processOrder(order);
            }
        } else {
            System.out.println("Stock not OK");
        }
    }
}
