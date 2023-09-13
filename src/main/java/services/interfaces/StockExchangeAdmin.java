package services.interfaces;

import models.Asset;

public interface StockExchangeAdmin {
    void addAsset(Asset asset);
    void removeAsset(Asset asset);
    void updateAsset(Asset asset);
}
