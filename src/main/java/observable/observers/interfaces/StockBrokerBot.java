package observable.observers.interfaces;

import observable.models.Asset;

import java.util.List;

public interface StockBrokerBot {
    void update(Asset asset);
    List<Asset> getAssets();
    float getBudget();
}
