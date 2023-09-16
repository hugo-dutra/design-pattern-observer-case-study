import services.implementations.StockExchangeAdminImpl;
import subjects.implementations.StockExchangeImpl;

public class Main {
    public static void main(String[] args) {
        StockExchangeImpl stockExchange = new StockExchangeImpl();
        StockExchangeAdminImpl stockExchangeAdmin = new StockExchangeAdminImpl(stockExchange);
        Thread stockExchangeAdminThread = new Thread(stockExchangeAdmin);
        stockExchangeAdminThread.start();
    }
}