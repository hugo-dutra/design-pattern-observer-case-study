package observable.subjects.interfaces;

import observable.models.Asset;
import observable.observers.interfaces.StockBroker;

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
