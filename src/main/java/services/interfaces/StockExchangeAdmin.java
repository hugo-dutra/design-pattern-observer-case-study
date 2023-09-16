package services.interfaces;

import models.Asset;
import subjects.interfaces.StockExchange;

import java.util.List;

public interface StockExchangeAdmin {
    void addAsset(Asset asset);
    void removeAsset(Asset asset);
    void updateAsset(Asset asset);
    public StockExchange getStockExchange();
    List<Asset> getAssets();
}
