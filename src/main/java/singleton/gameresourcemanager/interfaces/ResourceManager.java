package singleton.gameresourcemanager.interfaces;

import singleton.gameresourcemanager.enums.ResourceType;
import singleton.gameresourcemanager.models.Player;
import singleton.gameresourcemanager.models.Resource;

public interface ResourceManager {
    void addResource(Resource resource, Player player);
    void removeResource(Resource resource, Player player);
    void addResourceAmount(ResourceType type, int amount, Player player);
    void removeResourceAmount(ResourceType type, int amount, Player player);
    void printResources(Player  player);
    void exchangeResources(Player player, ResourceType type, int amount, Player player2,  ResourceType type2, int amount2);
}
