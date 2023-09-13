package observers.interfaces;

import models.Asset;

public interface StockBrokerBot {
    void buyAsset(Asset asset);
    void sellAsset(Asset asset);
    void update();
}
