package subjects.implementations;

import models.Asset;
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
    }

    @Override
    public void removeAsset(Asset asset) {
        if (!assetsNegociated.contains(asset))
            throw new UnsupportedOperationException("Asset negociated does not exist");
        assetsNegociated.remove(asset);
    }

    @Override
    public void updateAsset(Asset asset) {
        int assetIndex = assetsNegociated.indexOf(asset);
        if(assetIndex == -1)
            throw new UnsupportedOperationException("Asset negociated does not exist");
        assetsNegociated.set(assetIndex, asset);
    }

    @Override
    public List<Asset> getAssets() {
        return assetsNegociated;
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


    private void notifyStockBrokers(Asset asset) {
        for (StockBroker stockBroker : stockBrokers) {
            stockBroker.update(asset);
        }
    }

    public void updateAssetsInfo(Asset asset) {
        int indexAsset = assetsNegociated.indexOf(asset);
        if (indexAsset == -1)
            throw new UnsupportedOperationException("Asset negociated does not exist");
        assetsNegociated.set(indexAsset, asset);
        notifyStockBrokers(asset);
    }


}
