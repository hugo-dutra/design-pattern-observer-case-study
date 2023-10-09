package adapter.currencyAdapter.implementations;

import adapter.currencyAdapter.interfaces.AltcoinPayment;

public class AltCoint implements AltcoinPayment {

    @Override
    public void payWithAltcoin(int amount) {
        System.out.println("Paying with altcoin: " + amount);
    }
}
