package observable.observers.interfaces;

import observable.models.Asset;

import java.util.List;

public interface StockBroker {
    void update(Asset asset);
    String getBrokerName();
    List<Asset> getAssets();
    float getBudget();
}
