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
            throw new UnsupportedOperationException("Asset negociated already exists");
        assetsNegociated.add(asset);
        notifyStockBrokers(asset);
    }

    @Override
    public void removeAsset(Asset asset) {
        if (!assetsNegociated.contains(asset))
            throw new UnsupportedOperationException("Asset negociated does not exist");
        assetsNegociated.remove(asset);
        notifyStockBrokers(asset);
    }

    @Override
    public void updateAsset(Asset asset) {
        int assetIndex = assetsNegociated.indexOf(asset);
        if (assetIndex == -1)
            throw new UnsupportedOperationException("Asset negociated does not exist");
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
            throw new UnsupportedOperationException("Stock broker already exists");
        stockBrokers.add(stockBroker);
    }

    @Override
    public void removeStockBroker(StockBroker stockBroker) {
        if (!stockBrokers.contains(stockBroker))
            throw new UnsupportedOperationException("Stock broker does not exist");
        stockBrokers.remove(stockBroker);
    }

    @Override
    public void removeStockBrokerByName(String stockBrokername) {
        for (StockBroker stockBroker : stockBrokers) {
            if (stockBroker.getBrokerName().equals(stockBrokername)) {
                stockBrokers.remove(stockBroker);
                return;
            }
        }
        throw new UnsupportedOperationException("Stock broker does not exist");
    }

    @Override
    public void updateStockBrokerByName(String stockBrokername) {
        for (StockBroker stockBroker : stockBrokers) {
            if (stockBroker.getBrokerName().equals(stockBrokername)) {
                stockBrokers.set(stockBrokers.indexOf(stockBroker), stockBroker);
                return;
            }
        }
        throw new UnsupportedOperationException("Stock broker does not exist");
    }

    private void notifyStockBrokers(Asset asset) {
        for (StockBroker stockBroker : stockBrokers) {
            stockBroker.update(asset);
        }
    }

}
