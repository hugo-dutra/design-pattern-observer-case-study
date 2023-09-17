package observable;

import observable.services.implementations.StockExchangeAdminImpl;
import observable.subjects.implementations.StockExchangeImpl;

public class ClientObservable {
    public static void main(String[] args) {
        StockExchangeImpl stockExchange = new StockExchangeImpl();
        StockExchangeAdminImpl stockExchangeAdmin = new StockExchangeAdminImpl(stockExchange);
        Thread stockExchangeAdminThread = new Thread(stockExchangeAdmin);
        stockExchangeAdminThread.start();
    }
}
