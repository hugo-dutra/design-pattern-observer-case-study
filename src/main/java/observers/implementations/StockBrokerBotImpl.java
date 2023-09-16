package observers.implementations;

import models.Asset;
import observers.interfaces.StockBrokerBot;

import java.util.ArrayList;
import java.util.List;

public class StockBrokerBotImpl implements StockBrokerBot {
    public List<Asset> assets = new ArrayList<>();
    public String botName;
    private final float buyThresholdLow;
    private final float buyThresholdHigh;
    private final float sellThresholdLow;
    private final float sellThresholdHigh;

    public StockBrokerBotImpl(
            String botName,
            float buyThresholdLow,
            float buyThresholdHigh,
            float sellThresholdLow,
            float sellThresholdHigh) {
        this.botName = botName;
        this.buyThresholdLow = buyThresholdLow;
        this.buyThresholdHigh = buyThresholdHigh;
        this.sellThresholdLow = sellThresholdLow;
        this.sellThresholdHigh = sellThresholdHigh;
    }

    private void buyAsset(Asset asset) {
        if (!assets.contains(asset))
            assets.add(asset);
    }

    private void sellAsset(Asset asset) {
        if (assets.contains(asset))
            assets.remove(asset);
    }

    @Override
    public void update(Asset asset) {
        System.out.println("Stock broker bot updated with asset: " + asset);
        if (asset.getCurrentValueVariation() > buyThresholdHigh) {
            buyAsset(asset);
        } else if (asset.getCurrentValueVariation() < buyThresholdLow) {
            sellAsset(asset);
        }
    }

    @Override
    public List<Asset> getAssets() {
        return assets;
    }
}
