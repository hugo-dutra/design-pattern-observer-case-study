package adapter.currencyAdapter.implementations;

import adapter.currencyAdapter.interfaces.BitcoinPayment;

public class BitcoinMachine implements BitcoinPayment {
    @Override
    public void payWithBitcoin(int amount) {
        System.out.println("Paying with bitcoin: " + amount);
    }
}
