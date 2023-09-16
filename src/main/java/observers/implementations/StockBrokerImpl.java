package observers.implementations;

import models.Asset;
import observers.interfaces.StockBroker;

public class StockBrokerImpl implements StockBroker {
    StockBrokerBotImpl bot = new StockBrokerBotImpl(
            "Bot",
            0.1f,
            0.2f,
            -0.1f,
            -0.2f
    );
    @Override
    public void update(Asset asset) {
        System.out.println("Stock broker updated with asset: " + asset);
        bot.update(asset);
    }
}
