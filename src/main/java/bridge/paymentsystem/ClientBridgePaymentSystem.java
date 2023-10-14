package bridge.paymentsystem;

import bridge.paymentsystem.abstractions.AbstractBuyManager;
import bridge.paymentsystem.implementations.Bitcoin;
import bridge.paymentsystem.implementations.CreditCard;
import bridge.paymentsystem.implementations.PayPal;
import bridge.paymentsystem.implementations.RechargeBuy;
import bridge.paymentsystem.interfaces.IBuy;

public class ClientBridgePaymentSystem {
    public static void main(String[] args) {
        IBuy buy = new PayPal();
        AbstractBuyManager buyManager = new RechargeBuy(buy);
        buyManager.onlineBuy();
        buyManager.recharge();
        buyManager.localStoreBuy();

        System.out.println("=====================================");

        buy = new CreditCard();
        buyManager = new RechargeBuy(buy);
        buyManager.onlineBuy();
        buyManager.recharge();
        buyManager.localStoreBuy();

        System.out.println("=====================================");

        buy = new Bitcoin();
        buyManager = new RechargeBuy(buy);
        buyManager.onlineBuy();
        buyManager.recharge();
        buyManager.localStoreBuy();

    }
}
