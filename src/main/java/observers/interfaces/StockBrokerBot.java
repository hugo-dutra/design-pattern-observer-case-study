package observers.interfaces;

import models.Asset;

import java.util.List;

public interface StockBrokerBot {
    void update(Asset asset);
    List<Asset> getAssets();
}
