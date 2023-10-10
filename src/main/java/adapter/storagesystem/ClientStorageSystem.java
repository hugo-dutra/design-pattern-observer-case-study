package adapter.storagesystem;

import adapter.storagesystem.implementations.LocalStorage;
import adapter.storagesystem.implementations.LocalStorageToS3StorageAdapter;
import adapter.storagesystem.implementations.S3Storage;
import adapter.storagesystem.interfaces.IStorage;

public class ClientStorageSystem {
    public static void main(String[] args) {
        try{
            IStorage localStorage = new LocalStorage();
            localStorage.saveImage("image1.png", new byte[0]);
            localStorage.loadImage("image1.png");
            System.out.println("====================================");

            S3Storage s3Storage =  new S3Storage("my-bucket");
            LocalStorageToS3StorageAdapter localStorageToS3StorageAdapter = new LocalStorageToS3StorageAdapter(s3Storage);
            localStorageToS3StorageAdapter.saveImage("image2.png", new byte[0]);
            localStorageToS3StorageAdapter.loadImage("image2.png");
            System.out.println("====================================");
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
