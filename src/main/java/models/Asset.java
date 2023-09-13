package models;

import java.util.ArrayList;
import java.util.List;

public class Asset {
    private Float currentValue;
    private String assetName;
    private List<Float> valueHistory = new ArrayList<>();

    public Asset(float currentValue, String assetName) {
        this.currentValue = currentValue;
        setCurrentValue(currentValue);
    }

    public float getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(float currentValue) {
        this.currentValue = currentValue;
        this.valueHistory.add(currentValue);
    }

    public List<Float> getValueHistory() {
        return valueHistory;
    }

    public float getCurrentValueVariation() {
        if (valueHistory.size() < 2) {
            return 0;
        }
        return (currentValue - valueHistory.get(valueHistory.size() - 2)) / valueHistory.get(valueHistory.size() - 2) * 100;
    }

    public String getAssetName() {
        return assetName;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "currentValue=" + currentValue +
                ", assetName='" + assetName + '\'' +
                ", valueHistory=" + valueHistory +
                '}';
    }
}
