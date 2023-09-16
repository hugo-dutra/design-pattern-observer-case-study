import models.Asset;

import observers.implementations.StockBrokerImpl;
import services.implementations.StockExchangeAdminImpl;
import subjects.implementations.StockExchangeImpl;


public class Main {
    public static void main(String[] args) {
        Asset bitcoin = new Asset(100, "Bitcoin");
        Asset gold = new Asset(100, "Gold");
        Asset silver = new Asset(100, "Silver");
        Asset ethereum = new Asset(100, "Ethereum");
        Asset rice = new Asset(100, "Rice");
        Asset crudOil = new Asset(100, "Crud Oil");

        StockBrokerImpl stockBrokerHugo = new StockBrokerImpl.StockBrokerBuilder()
                .withBrokerName("Hugo")
                .withBuyThresholdLow(0.5f)
                .withBuyThresholdHigh(0.1f)
                .withSellThresholdLow(-0.5f)
                .withSellThresholdHigh(-0.1f)
                .build();

        StockBrokerImpl stockBrokerJuliana = new StockBrokerImpl.StockBrokerBuilder()
                .withBrokerName("Juliana")
                .withBuyThresholdLow(0.3f)
                .withBuyThresholdHigh(0.8f)
                .withSellThresholdLow(-0.2f)
                .withSellThresholdHigh(-0.2f)
                .build();

        StockBrokerImpl stockBrokerGilberto = new StockBrokerImpl.StockBrokerBuilder()
                .withBrokerName("Gilberto")
                .withBuyThresholdLow(0.4f)
                .withBuyThresholdHigh(0.12f)
                .withSellThresholdLow(-0.3f)
                .withSellThresholdHigh(-0.8f)
                .build();

        StockBrokerImpl stockBrokerFrancisca = new StockBrokerImpl.StockBrokerBuilder()
                .withBrokerName("Francisca")
                .withBuyThresholdLow(0.2f)
                .withBuyThresholdHigh(0.7f)
                .withSellThresholdLow(-0.1f)
                .withSellThresholdHigh(-0.5f)
                .build();


        StockExchangeImpl stockExchange = new StockExchangeImpl();
        // Block to add stockbrokers to the stock exchange
        stockExchange.addStockBroker(stockBrokerHugo);
        stockExchange.addStockBroker(stockBrokerJuliana);
        stockExchange.addStockBroker(stockBrokerGilberto);
        stockExchange.addStockBroker(stockBrokerFrancisca);

        // Block to add assets to the stock exchange

        StockExchangeAdminImpl stockExchangeAdmin = new StockExchangeAdminImpl(stockExchange);
        Thread stockExchangeAdminThread = new Thread(stockExchangeAdmin);
        stockExchangeAdminThread.start();



    }
}