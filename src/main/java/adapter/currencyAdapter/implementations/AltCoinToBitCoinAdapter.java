package adapter.currencyAdapter.implementations;

import adapter.currencyAdapter.interfaces.BitcoinPayment;

public class AltCoinToBitCoinAdapter implements BitcoinPayment {
    private AltCoint altCoint;
    @Override
    public void payWithBitcoin(int amount) {
        AltCoint altCoint = new AltCoint();
        altCoint.payWithAltcoin(amount);
    }
}
