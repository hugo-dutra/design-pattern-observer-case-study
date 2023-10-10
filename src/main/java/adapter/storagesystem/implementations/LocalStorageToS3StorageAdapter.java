package adapter.storagesystem.implementations;

import adapter.storagesystem.exceptions.S3DownloadException;
import adapter.storagesystem.exceptions.S3UploadException;
import adapter.storagesystem.interfaces.IStorage;

public class LocalStorageToS3StorageAdapter implements IStorage {
    private final S3Storage s3Storage;

    public LocalStorageToS3StorageAdapter(S3Storage s3Storage) {
        this.s3Storage = s3Storage;
    }

    @Override
    public void saveImage(String fileName, byte[] image) {
        try{
            System.out.println("Saving image " + fileName + " to S3Storage" + "on bucket my-bucket" + s3Storage.getBucketName());
            s3Storage.uploadToS3(s3Storage.getBucketName(), fileName, image);
        }catch (Exception e) {
            throw new S3UploadException("Error: " + e.getMessage()+" on bucket my-bucket" + s3Storage.getBucketName());
        }

    }

    @Override
    public byte[] loadImage(String fileName) {
        try{
            System.out.println("Loading image " + fileName + " from S3Storage");
            return s3Storage.downloadFromS3(s3Storage.getBucketName(), fileName);
        }catch (Exception e) {
            throw new S3DownloadException("Error: " + e.getMessage()+" on bucket my-bucket" + s3Storage.getBucketName());
        }
    }
}
