package singleton.gameresourcemanager.implementations;

import singleton.gameresourcemanager.enums.ResourceType;
import singleton.gameresourcemanager.interfaces.ResourceManager;
import singleton.gameresourcemanager.models.Player;
import singleton.gameresourcemanager.models.Resource;

public class ResourceManagerImpl implements ResourceManager {
    private static ResourceManagerImpl instance;

    public static ResourceManagerImpl getInstance() {
        if (instance == null) {
            instance = new ResourceManagerImpl();
        }
        return instance;
    }
    @Override
    public void addResource(Resource resource, Player player) {
        player.addResource(resource);
    }

    @Override
    public void removeResource(Resource resource, Player player) {
        player.removeResource(resource.getType());
    }

    @Override
    public void addResourceAmount(ResourceType type, int amount, Player player) {
        player.addResourceAmount(type, amount);
    }

    @Override
    public void removeResourceAmount(ResourceType type, int amount, Player player) {
        player.removeResourceAmount(type, amount);
    }

    @Override
    public void printResources(Player player) {
        StringBuilder sb = new StringBuilder().append("Resources:\n")
                .append("----------\n");
        player.getResources().forEach(resource -> sb.append(resource.toString()).append("\n"));
        System.out.println(sb.toString());
    }

    @Override
    public void exchangeResources(Player player, ResourceType type, int amount, Player player2,  ResourceType type2, int amount2) {
        if (!exchangeValid(player, type, amount, player2, type2, amount2)) {
            System.out.println("Exchange not valid");
            return;
        }
        player.removeResourceAmount(type, amount);
        player.addResourceAmount(type2, amount2);
        player2.removeResourceAmount(type2, amount2);
        player2.addResourceAmount(type, amount);
    }

    private boolean exchangeValid(Player player, ResourceType type, int amount, Player player2,  ResourceType type2, int amount2) {
        if (player == null || player2 == null) return false;
        if (type.getName().equals(type2.getName())) return false;
        int playerAmount = player.getResources().stream()
                .filter(resource -> resource.getType() == type)
                .findFirst()
                .get()
                .getAmount();
        int player2Amount = player2.getResources().stream()
                .filter(resource -> resource.getType() == type2)
                .findFirst()
                .get()
                .getAmount();

        return playerAmount >= amount && player2Amount >= amount2;
    }

}
