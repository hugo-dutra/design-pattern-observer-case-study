package singleton.gameresourcemanager.models;

import singleton.gameresourcemanager.enums.ResourceType;

import java.util.List;

public class Player {
    private List<Resource> resources;
    private String name;

    public Player(String name, List<Resource> resources) {
        this.name = name;
        this.resources = resources;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public String getName() {
        return name;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addResource(Resource resource) {
        resources.add(resource);
    }

    public void removeResource(ResourceType type) {
        resources.removeIf(resource -> resource.getType() == type);
    }

    public void addResourceAmount(ResourceType type, int amount){
        resources.stream()
                .filter(resource -> resource.getType()==type)
                .forEach(resource -> {
                    int newResourceAmount = resource.getAmount() + amount;
                    resource.setAmount(newResourceAmount);
                });
    }

    public void removeResourceAmount(ResourceType type, int amount){
        resources.stream()
                .filter(resource -> resource.getType()==type)
                .forEach(resource -> {
                    if(resource.getAmount() >= amount){
                        int newResourceAmount= resource.getAmount() - amount;
                        resource.setAmount(newResourceAmount);
                    }
                });
    }

    public void printResources() {
        System.out.println("Player: " + name);
        resources.forEach(resource -> System.out.println(resource.getType().getName() + ": " + resource.getAmount()));
    }

    @Override
    public String toString() {
        return "Player: " + name + "\n" + resources.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Player)) return false;
        Player player = (Player) obj;
        return player.getName().equals(name) && player.getResources().equals(resources);
    }
}
