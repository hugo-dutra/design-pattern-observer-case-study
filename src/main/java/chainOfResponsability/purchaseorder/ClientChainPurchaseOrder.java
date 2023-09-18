package chainOfResponsability.purchaseorder;

import chainOfResponsability.purchaseorder.implementations.PurchaseOrderAddress;
import chainOfResponsability.purchaseorder.implementations.PurchaseOrderCredit;
import chainOfResponsability.purchaseorder.implementations.PurchaseOrderFinalize;
import chainOfResponsability.purchaseorder.implementations.PurchaseOrderStock;
import chainOfResponsability.purchaseorder.interfaces.PurchaseOrder;
import chainOfResponsability.purchaseorder.models.Order;
import chainOfResponsability.purchaseorder.models.OrderItems;

import java.math.BigDecimal;
import java.util.List;

public class ClientChainPurchaseOrder {
    public static void main(String[] args) {
        PurchaseOrder purchaseOrder = new PurchaseOrderAddress();
        PurchaseOrder purchaseOrderAddress = new PurchaseOrderAddress();
        PurchaseOrder purchaseOrderStock = new PurchaseOrderStock();
        PurchaseOrder purchaseOrderCredit = new PurchaseOrderCredit();
        PurchaseOrder purchaseOrderFinalize = new PurchaseOrderFinalize();

        purchaseOrder.setNextStep(purchaseOrderAddress);
        purchaseOrderAddress.setNextStep(purchaseOrderStock);
        purchaseOrderStock.setNextStep(purchaseOrderCredit);
        purchaseOrderCredit.setNextStep(purchaseOrderFinalize);

        OrderItems orderItem1 = new OrderItems("Item 1", new BigDecimal(100));
        OrderItems orderItem2 = new OrderItems("Item 2", new BigDecimal(200));
        OrderItems orderItem3 = new OrderItems("Item 3", new BigDecimal(300));
        OrderItems orderItem4 = new OrderItems("Item 3", new BigDecimal(500));

        List<OrderItems> orderItems = List.of(orderItem1, orderItem2, orderItem3, orderItem4);

        Order order = new Order("Address 1", orderItems);
        purchaseOrder.processOrder(order);

    }
}
