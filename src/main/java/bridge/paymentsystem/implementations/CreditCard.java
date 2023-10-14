package bridge.paymentsystem.implementations;

import bridge.paymentsystem.interfaces.IBuy;

public class CreditCard implements IBuy {

    @Override
    public void buy() {
        if (validate())
            System.out.println("Credit card buy");
    }

    public boolean validate() {
        System.out.println("Credit card validated");
        return true;
    }

    @Override
    public void transactionDetails() {
        System.out.println("Credit card transactionDetails");
    }
}
