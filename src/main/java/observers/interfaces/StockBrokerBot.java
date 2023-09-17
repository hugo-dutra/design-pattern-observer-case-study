package observers.interfaces;

import models.Asset;

import java.util.List;

public interface StockBrokerBot {
    void update(Asset asset, String brokerName);
    List<Asset> getAssets();
    float getBudget();
}
