package adapter.storagesystem.interfaces;

public interface IStorage {
    void saveImage(String fileName, byte[] image);
    byte[] loadImage(String fileName);
}
