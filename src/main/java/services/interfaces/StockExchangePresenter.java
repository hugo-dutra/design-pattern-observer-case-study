package services.interfaces;

import models.Asset;

import java.util.List;

public interface StockExchangePresenter {
    void displayStockExchange(List<Asset> listOfAssets);
    void displayNegociationOptions();
    void displayStockBrokers();
}
