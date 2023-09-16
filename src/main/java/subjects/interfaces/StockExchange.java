package subjects.interfaces;

import models.Asset;
import observers.interfaces.StockBroker;

import java.util.List;

public interface StockExchange {
    void addAsset(Asset asset);
    void removeAsset(Asset asset);
    void updateAsset(Asset asset);

    List<Asset> getAssets();

    void addStockBroker(StockBroker stockBroker);
    void removeStockBroker(StockBroker stockBroker);
    void notifyStockBrokers(Asset asset);
}
