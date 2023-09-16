package observers.interfaces;

import models.Asset;

public interface StockBroker {
    void update(Asset asset);
    String getBrokerName();
}
