package subjects.interfaces;

import models.Asset;
import observers.interfaces.StockBroker;

import java.util.List;

public interface StockExchange {
    void addAsset(Asset asset);
    void removeAsset(Asset asset);
    void updateAsset(Asset asset);

    List<Asset> getAssets();
    List<StockBroker> getStockBrokers();

    void addStockBroker(StockBroker stockBroker);
    void removeStockBroker(StockBroker stockBroker);
    void removeStockBrokerByName(String stockBrokername);
    void updateStockBrokerByName(String stockBrokername);

}
