package singleton.gameresourcemanager;

import singleton.gameresourcemanager.enums.ResourceType;
import singleton.gameresourcemanager.implementations.ResourceManagerImpl;
import singleton.gameresourcemanager.interfaces.ResourceManager;
import singleton.gameresourcemanager.models.Player;
import singleton.gameresourcemanager.models.Resource;

import java.util.ArrayList;
import java.util.List;

public class MainGameResourceManagerSingleton {
    public static void main(String[] args) {
        ResourceManager resourceManager = ResourceManagerImpl.getInstance();

        List<Resource> initialResources1 = new ArrayList<>();
        initialResources1.add(new Resource(ResourceType.GOLD, 10));
        initialResources1.add(new Resource(ResourceType.WOOD, 100));
        initialResources1.add(new Resource(ResourceType.ROCK, 1000));

        List<Resource> initialResources2 = new ArrayList<>();
        initialResources2.add(new Resource(ResourceType.GOLD, 10));
        initialResources2.add(new Resource(ResourceType.WOOD, 100));
        initialResources2.add(new Resource(ResourceType.ROCK, 1000));


        Player player1 = new Player("Player 1", initialResources1);
        Player player2 = new Player("Player 2", initialResources2);

        System.out.println("-----------------");
        System.out.println("Initial resources:" +player1.getName());
        player1.printResources();
        System.out.println("-----------------");
        System.out.println("Initial resources:" +player2.getName());
        player2.printResources();

        resourceManager.addResourceAmount(ResourceType.GOLD, 100, player1);
        resourceManager.addResourceAmount(ResourceType.WOOD, 100, player1);
        resourceManager.addResourceAmount(ResourceType.ROCK, 100, player1);

        resourceManager.removeResourceAmount(ResourceType.GOLD, 1, player2);
        resourceManager.removeResourceAmount(ResourceType.WOOD, 10, player2);
        resourceManager.removeResourceAmount(ResourceType.ROCK, 100, player2);

        System.out.println("=================");

        System.out.println("-----------------");
        System.out.println("Initial resources:" +player1.getName());
        player1.printResources();
        System.out.println("-----------------");
        System.out.println("Initial resources:" +player2.getName());
        player2.printResources();

        resourceManager.exchangeResources(player1, ResourceType.GOLD, 2, player2, ResourceType.WOOD, 20);

        System.out.println("=================");
        System.out.println("-----------------");
        System.out.println("Initial resources:" +player1.getName());
        player1.printResources();
        System.out.println("-----------------");
        System.out.println("Initial resources:" +player2.getName());
        player2.printResources();


    }
}
