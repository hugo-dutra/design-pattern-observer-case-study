import models.Asset;

import observers.implementations.StockBrokerImpl;
import subjects.implementations.StockExchangeImpl;


public class Main {
    public static void main(String[] args) {
        Asset bitcoin = new Asset(100, "Bitcoin");
        Asset gold = new Asset(100, "Gold");
        Asset silver = new Asset(100, "Silver");
        Asset ethereum = new Asset(100, "Ethereum");
        Asset rice = new Asset(100, "Rice");
        Asset crudOil = new Asset(100, "Crud Oil");

        StockBrokerImpl stockBrokerHugo = new StockBrokerImpl();
        StockBrokerImpl stockBrokerJuliana = new StockBrokerImpl();
        StockBrokerImpl stockBrokerGilberto = new StockBrokerImpl();
        StockBrokerImpl stockBrokerFrancisca = new StockBrokerImpl();

        StockExchangeImpl stockExchange = new StockExchangeImpl();

        // Block to add stockbrokers to the stock exchange
        stockExchange.addStockBroker(stockBrokerHugo);
        stockExchange.addStockBroker(stockBrokerJuliana);
        stockExchange.addStockBroker(stockBrokerGilberto);
        stockExchange.addStockBroker(stockBrokerFrancisca);

        // Block to add assets to the stock exchange
        stockExchange.addAsset(bitcoin);
        stockExchange.addAsset(gold);
        stockExchange.addAsset(silver);
        stockExchange.addAsset(ethereum);
        stockExchange.addAsset(rice);
        stockExchange.addAsset(crudOil);

        // Block to update assets values in the stock exchange
        stockExchange.updateAsset(bitcoin);
        bitcoin.setCurrentValue(200);
        stockExchange.updateAsset(bitcoin);


    }
}