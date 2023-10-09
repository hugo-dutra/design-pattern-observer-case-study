package adapter.currencyAdapter;

import adapter.currencyAdapter.implementations.AltCoinToBitCoinAdapter;
import adapter.currencyAdapter.implementations.AltCoint;
import adapter.currencyAdapter.implementations.BitcoinMachine;
import adapter.currencyAdapter.interfaces.BitcoinPayment;

public class ClientAdapterCurrency {
    public static void main(String[] args) {
        BitcoinPayment bitcointPayment = new BitcoinMachine();
        bitcointPayment.payWithBitcoin(100);

        AltCoint altCoint = new AltCoint();
        altCoint.payWithAltcoin(100);

        AltCoinToBitCoinAdapter altCoinToBitCoinAdapter = new AltCoinToBitCoinAdapter();
        altCoinToBitCoinAdapter.payWithBitcoin(100);

    }
}
