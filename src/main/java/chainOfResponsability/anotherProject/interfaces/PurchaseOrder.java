package chainOfResponsability.anotherProject.interfaces;

import chainOfResponsability.anotherProject.models.Order;

public interface PurchaseOrder {
    void setNextStep(PurchaseOrder nextStep);
    void processOrder(Order order);
}
