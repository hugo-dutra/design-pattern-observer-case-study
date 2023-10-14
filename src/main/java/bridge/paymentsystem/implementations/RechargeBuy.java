package bridge.paymentsystem.implementations;

import bridge.paymentsystem.abstractions.AbstractBuyManager;

import bridge.paymentsystem.interfaces.IBuy;

public class RechargeBuy extends AbstractBuyManager {
    public RechargeBuy(IBuy buy) {
        super(buy);
    }

    @Override
    public void onlineBuy() {
        System.out.println("RechargeBuy onlineBuy");
        buy.buy();
        buy.transactionDetails();
    }

    @Override
    public void recharge() {
        System.out.println("RechargeBuy recharge");
        buy.buy();
        buy.transactionDetails();
    }

    @Override
    public void localStoreBuy() {
        System.out.println("RechargeBuy localStoreBuy");
        buy.buy();
        buy.transactionDetails();
    }

}
