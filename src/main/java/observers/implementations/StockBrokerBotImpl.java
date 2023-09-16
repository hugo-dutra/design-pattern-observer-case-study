package observers.implementations;

import models.Asset;
import observers.interfaces.StockBrokerBot;

import java.util.ArrayList;
import java.util.List;

public class StockBrokerBotImpl implements StockBrokerBot {
    public List<Asset> assets = new ArrayList<>();
    private String botName;
    private float budget = 0;
    private final float buyThresholdLow;
    private final float buyThresholdHigh;
    private final float sellThresholdLow;
    private final float sellThresholdHigh;

    public StockBrokerBotImpl(
            String botName,
            float buyThresholdLow,
            float buyThresholdHigh,
            float sellThresholdLow,
            float sellThresholdHigh,
            float budget){
        this.botName = botName;
        this.buyThresholdLow = buyThresholdLow;
        this.buyThresholdHigh = buyThresholdHigh;
        this.sellThresholdLow = sellThresholdLow;
        this.sellThresholdHigh = sellThresholdHigh;
        this.budget = budget;
    }

    private void buyAsset(Asset asset) {
        if (!assets.contains(asset) && hasEnoughBudget(asset)){
            assets.add(asset);
            updateBudget(-asset.getCurrentValue());
        }
    }

    private boolean hasEnoughBudget(Asset asset) {
        if (budget < asset.getCurrentValue())
            return false;
        return true;
    }

    private void sellAsset(Asset asset) {
        if (assets.contains(asset))
            assets.remove(asset);
        updateBudget(asset.getCurrentValue());
    }

    private void updateBudget(float assetValue) {
        budget += assetValue;
    }

    @Override
    public void update(Asset asset) {
        if (asset.getCurrentValueVariation() == 0)
            return;
        if (asset.getCurrentValueVariation() > buyThresholdHigh) {
            buyAsset(asset);
            System.out.printf("Bot %s bought asset %s\n", botName, asset.getAssetName());
        } else if (asset.getCurrentValueVariation() < buyThresholdLow) {
            sellAsset(asset);
            System.out.printf("Bot %s sold asset %s\n", botName, asset.getAssetName());
        }
    }

    @Override
    public List<Asset> getAssets() {
        return assets;
    }

    @Override
    public float getBudget() {
        return budget;
    }
}
