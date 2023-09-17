package observable.observers.implementations;

import observable.models.Asset;
import observable.observers.interfaces.StockBroker;

import java.util.List;

public class StockBrokerImpl implements StockBroker {
    private String brokerName = "";
    private StockBrokerBotImpl bot;

    private StockBrokerImpl(String brokerName, float buyThresholdLow, float buyThresholdHigh, float sellThresholdLow, float sellThresholdHigh, float budget) {
        this.brokerName = brokerName;
        bot = new StockBrokerBotImpl(
                "Bot's " + brokerName,
                buyThresholdLow,
                buyThresholdHigh,
                sellThresholdLow,
                sellThresholdHigh,
                budget
        );
    }

    public String getBrokerName() {
        return brokerName;
    }

    @Override
    public List<Asset> getAssets() {
        return bot.getAssets();
    }

    @Override
    public float getBudget() {
        return bot.getBudget();
    }

    public static class StockBrokerBuilder{
        String brokerName = "";
        float buyThresholdLow = 0;
        float buyThresholdHigh = 0;
        float sellThresholdLow = 0;
        float sellThresholdHigh = 0;
        float budget = 0;

        public StockBrokerBuilder withBrokerName(String brokerName){
            this.brokerName = brokerName;
            return this;
        }

        public StockBrokerBuilder withBuyThresholdLow(float buyThresholdLow){
            this.buyThresholdLow = buyThresholdLow;
            return this;
        }

        public StockBrokerBuilder withBuyThresholdHigh(float buyThresholdHigh){
            this.buyThresholdHigh = buyThresholdHigh;
            return this;
        }

        public StockBrokerBuilder withSellThresholdLow(float sellThresholdLow){
            this.sellThresholdLow = sellThresholdLow;
            return this;
        }

        public StockBrokerBuilder withSellThresholdHigh(float sellThresholdHigh){
            this.sellThresholdHigh = sellThresholdHigh;
            return this;
        }

        public StockBrokerBuilder withBudget(float budget){
            this.budget = budget;
            return this;
        }

        public StockBrokerImpl build(){
            return new StockBrokerImpl(brokerName, buyThresholdLow, buyThresholdHigh, sellThresholdLow, sellThresholdHigh, budget);
        }
    }

    @Override
    public void update(Asset asset) {
        bot.update(asset);
    }
}
