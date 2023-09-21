package singleton.gameresourcemanager.models;

import singleton.gameresourcemanager.enums.ResourceType;

public class Resource {
    private final ResourceType type;
    private int amount;

    public Resource(ResourceType type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public ResourceType getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return type.getName() + ": " + amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Resource)) return false;
        Resource resource = (Resource) obj;
        return resource.getType() == type && resource.getAmount() == amount;
    }



}
