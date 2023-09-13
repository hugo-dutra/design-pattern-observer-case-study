package services.interfaces;

import models.Asset;

import java.util.List;

public interface StockExchangeAdmin {
    void addAsset(Asset asset);
    void removeAsset(Asset asset);
    void updateAsset(Asset asset);
    List<Asset> getAssets();
}
