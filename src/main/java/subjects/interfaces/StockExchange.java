package subjects.interfaces;

import models.Asset;
import observers.interfaces.StockBrokers;

public interface StockExchange {
    void addAsset(Asset asset);
    void removeAsset(Asset asset);
    void updateAsset(Asset asset);

    void addStockBroker(StockBrokers stockBroker);
    void removeStockBroker(StockBrokers stockBroker);
    void notifyStockBrokers();
}
