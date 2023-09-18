package chainOfResponsability.anotherProject.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private BigDecimal totalOrderValue;
    private String address;
    private List<OrderItems> orderItems = new ArrayList<>();

    public Order(String address, List<OrderItems> orderItems) {
        this.totalOrderValue = processTotalOrderValue(orderItems);
        this.address = address;
        this.orderItems = orderItems;
    }

    private BigDecimal processTotalOrderValue(List<OrderItems> orderItems) {
        BigDecimal totalOrderValue = new BigDecimal(0);
        for (OrderItems orderItem : orderItems) {
            totalOrderValue = totalOrderValue.add(orderItem.getValue());
        }
        return totalOrderValue;
    }

    public BigDecimal getTotalOrderValue() {
        return totalOrderValue;
    }
    public String getAddress() {
        return address;
    }
    public List<OrderItems> getOrderItems() {
        return orderItems;
    }
    public void setTotalOrderValue(BigDecimal totalOrderValue) {
        this.totalOrderValue = totalOrderValue;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setOrderItems(List<OrderItems> orderItems) {
        this.orderItems = orderItems;
    }
    @Override
    public String toString() {
        return "Order [totalOrderValue=" + totalOrderValue + ", address=" + address + ", orderItems=" + orderItems
                + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Order) {
            Order order = (Order) obj;
            return this.totalOrderValue.equals(order.getTotalOrderValue()) && this.address.equals(order.getAddress())
                    && this.orderItems.equals(order.getOrderItems());
        }
        return false;
    }
}
