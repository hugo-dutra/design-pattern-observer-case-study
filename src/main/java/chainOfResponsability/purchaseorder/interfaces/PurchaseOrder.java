package chainOfResponsability.purchaseorder.interfaces;

import chainOfResponsability.purchaseorder.models.Order;

public interface PurchaseOrder {
    void setNextStep(PurchaseOrder nextStep);
    void processOrder(Order order);
}
