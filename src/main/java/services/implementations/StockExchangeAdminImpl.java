package services.implementations;

import models.Asset;
import services.interfaces.StockExchangeAdmin;
import subjects.implementations.StockExchangeImpl;
import subjects.interfaces.StockExchange;

import java.util.ArrayList;
import java.util.List;

public class StockExchangeAdminImpl implements StockExchangeAdmin, Runnable {
    List<Asset> assetsNegociated;
    private StockExchange stockExchange;

    public StockExchangeAdminImpl(StockExchangeImpl stockExchange) {
        this.assetsNegociated = stockExchange.getAssets();
        this.stockExchange = stockExchange;
    }

    public StockExchange getStockExchange() {
        return stockExchange;
    }

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
        stockExchange.updateAsset(asset);
    }

    @Override
    public List<Asset> getAssets() {
        return assetsNegociated;
    }

    @Override
    public void run() {
        StockExchangePresenterImpl stockExchangePresenter = new StockExchangePresenterImpl(this);
        while (true) {
            try {
                Thread.sleep(1000);
                stockExchangePresenter.displayStockExchange(assetsNegociated);
                stockExchangePresenter.displayNegociationOptions();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
