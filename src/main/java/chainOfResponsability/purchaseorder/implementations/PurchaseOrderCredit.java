package chainOfResponsability.purchaseorder.implementations;

import chainOfResponsability.purchaseorder.interfaces.PurchaseOrder;
import chainOfResponsability.purchaseorder.models.Order;

public class PurchaseOrderCredit implements PurchaseOrder {
    private PurchaseOrder nextStep;
    @Override
    public void setNextStep(PurchaseOrder nextStep) {
        this.nextStep = nextStep;
    }

    @Override
    public void processOrder(Order order) {
        if (order.getTotalOrderValue().compareTo(new java.math.BigDecimal("1000")) < 0) {
            System.out.println("Checking credit...Credit OK");
            if (nextStep != null) {
                nextStep.processOrder(order);
            }
        } else {
            System.out.println("Credit not OK");
        }
    }
}
