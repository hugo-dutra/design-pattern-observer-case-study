package services.implementations;

import models.Asset;
import observers.interfaces.StockBroker;
import services.interfaces.StockExchangeAdmin;
import subjects.implementations.StockExchangeImpl;
import subjects.interfaces.StockExchange;

import java.util.ArrayList;
import java.util.List;

public class StockExchangeAdminImpl implements StockExchangeAdmin, Runnable {
    List<Asset> assetsNegociated;
    private static final int UPDATE_INTERVAL = 250;
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
            System.out.println("**********Asset negociated already exists**********\n");
        assetsNegociated.add(asset);
    }

    @Override
    public void removeAsset(Asset asset) {
        if (!assetsNegociated.contains(asset))
            System.out.println("**********Asset negociated does not exist**********\n");
        assetsNegociated.remove(asset);
    }

    @Override
    public void updateAsset(Asset asset) {
        int assetIndex = assetsNegociated.indexOf(asset);
        if(assetIndex == -1)
            System.out.println("**********Asset negociated does not exist**********\n");
        assetsNegociated.set(assetIndex, asset);
        stockExchange.updateAsset(asset);
    }

    @Override
    public List<Asset> getAssets() {
        return assetsNegociated;
    }

    @Override
    public List<StockBroker> getStockBrokers() {
        return stockExchange.getStockBrokers();
    }

    @Override
    public void addAssetToStockBroker(Asset asset, StockBroker stockBroker) {
        if (!assetsNegociated.contains(asset))
            System.out.println("**********Asset negociated does not exist**********\n");
        if (!stockExchange.getStockBrokers().contains(stockBroker))
            System.out.println("**********Stock broker does not exist**********\n");
        stockBroker.update(asset);
    }

    @Override
    public void run() {
        StockExchangePresenterImpl stockExchangePresenter = new StockExchangePresenterImpl(this);
        while (true) {
            try {
                Thread.sleep(UPDATE_INTERVAL);
                stockExchangePresenter.displayStockExchange(assetsNegociated);
                stockExchangePresenter.displayNegociationOptions();
                stockExchangePresenter.displayStockBrokers();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
