package subjects.implementations;

import models.Asset;
import observers.implementations.StockBrokerImpl;
import observers.interfaces.StockBroker;
import subjects.interfaces.StockExchange;

import java.util.ArrayList;
import java.util.List;

public class StockExchangeImpl implements StockExchange {
    List<Asset> assetsNegociated = new ArrayList<>();
    List<StockBroker> stockBrokers = new ArrayList<>();

    @Override
    public void addAsset(Asset asset) {
        if (assetsNegociated.contains(asset))
            System.out.println("**********Asset negociated already exists**********\n");
        assetsNegociated.add(asset);
        notifyStockBrokers(asset);
    }

    @Override
    public void removeAsset(Asset asset) {
        if (!assetsNegociated.contains(asset))
            System.out.println("**********Asset negociated does not exist**********\n");
        assetsNegociated.remove(asset);
        notifyStockBrokers(asset);
    }

    @Override
    public void updateAsset(Asset asset) {
        int assetIndex = assetsNegociated.indexOf(asset);
        if (assetIndex == -1)
            System.out.println("**********Asset negociated does not exist**********\n");
        assetsNegociated.set(assetIndex, asset);
        notifyStockBrokers(asset);
    }

    @Override
    public List<Asset> getAssets() {
        return assetsNegociated;
    }

    @Override
    public List<StockBroker> getStockBrokers() {
        return stockBrokers;
    }

    @Override
    public void addStockBroker(StockBroker stockBroker) {
        if (stockBrokers.contains(stockBroker))
            System.out.println("\n**********Stock broker already exists**********\n");
        stockBrokers.add(stockBroker);
    }

    @Override
    public void removeStockBroker(StockBroker stockBroker) {
        if (!stockBrokers.contains(stockBroker))
            System.out.println("\n**********Stock broker does not exist**********\n");
        stockBrokers.remove(stockBroker);
    }

    @Override
    public void removeStockBrokerByName(String stockBrokername) {
        for (StockBroker stockBroker : stockBrokers) {
            if (stockBroker.getBrokerName().equalsIgnoreCase(stockBrokername)) {
                stockBrokers.remove(stockBroker);
                return;
            }
        }
        System.out.println("\n**********Stock broker does not exist**********\n");
    }

    @Override
    public void updateStockBrokerByName(String stockBrokername) {
        for (StockBroker stockBroker : stockBrokers) {
            if (stockBroker.getBrokerName().equalsIgnoreCase(stockBrokername)) {
                stockBrokers.set(stockBrokers.indexOf(stockBroker), stockBroker);
                return;
            }
        }
        System.out.println("\n**********Stock broker does not exist**********\n");
    }

    private void notifyStockBrokers(Asset asset) {
        for (StockBroker stockBroker : stockBrokers) {
            stockBroker.update(asset);
        }
    }

}
