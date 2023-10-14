package bridge.paymentsystem.abstractions;

import bridge.paymentsystem.interfaces.IBuy;

public abstract class AbstractBuyManager {
    protected IBuy buy;

    public AbstractBuyManager(IBuy buyWay) {
        this.buy = buyWay;
    }

    public abstract void onlineBuy();
    public abstract void recharge();
    public abstract  void localStoreBuy();

}
