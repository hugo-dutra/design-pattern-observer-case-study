package bridge.paymentsystem.implementations;

import bridge.paymentsystem.interfaces.IBuy;

public class PayPal implements IBuy {

    @Override
    public void buy() {
        if (validate())
            System.out.println("PayPal buy");
    }


    public boolean validate() {
        System.out.println("PayPal validated");
        return true;
    }

    @Override
    public void transactionDetails() {
        System.out.println("PayPal transactionDetails");
    }
}
