package chainOfResponsability.purchaseorder.models;

import java.math.BigDecimal;

public class OrderItems {
    private String name;
    private BigDecimal value;

    public OrderItems(String name, BigDecimal value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }
    public BigDecimal getValue() {
        return value;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setValue(BigDecimal value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "OrderItems [name=" + name + ", value=" + value + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof OrderItems) {
            OrderItems orderItems = (OrderItems) obj;
            return this.name.equals(orderItems.getName()) && this.value.equals(orderItems.getValue());
        }
        return false;
    }
}
