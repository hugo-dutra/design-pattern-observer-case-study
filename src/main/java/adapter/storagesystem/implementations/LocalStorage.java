package adapter.storagesystem.implementations;

import adapter.storagesystem.interfaces.IStorage;

public class LocalStorage implements IStorage {
    @Override
    public void saveImage(String fileName, byte[] image) {
        System.out.println("Saving image " + fileName + " to local storage");
    }

    @Override
    public byte[] loadImage(String fileName) {
        System.out.println("Loading image " + fileName + " from local storage");
        return new byte[0];
    }
}
