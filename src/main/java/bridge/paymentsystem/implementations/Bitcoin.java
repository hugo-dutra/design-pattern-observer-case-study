package bridge.paymentsystem.implementations;

import bridge.paymentsystem.interfaces.IBuy;

public class Bitcoin implements IBuy{
    @Override
    public void buy() {
        if (validate())
            System.out.println("Bitcoin buy");

    }

    public boolean validate() {
        System.out.println("Bitcoin validated");
        return true;
    }

    @Override
    public void transactionDetails() {
        System.out.println("Bitcoin transactionDetails");
    }
}
