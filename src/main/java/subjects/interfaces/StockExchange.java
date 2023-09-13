package subjects.interfaces;

import models.Asset;
import observers.interfaces.StockBroker;

public interface StockExchange {
    void addAsset(Asset asset);
    void removeAsset(Asset asset);
    void updateAsset(Asset asset);

    void addStockBroker(StockBroker stockBroker);
    void removeStockBroker(StockBroker stockBroker);
    void notifyStockBrokers();
}
