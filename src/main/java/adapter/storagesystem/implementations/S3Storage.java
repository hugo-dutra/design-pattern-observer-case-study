package adapter.storagesystem.implementations;

public class S3Storage {
    private final String bucketName;

    public S3Storage(String bucketName) {
        this.bucketName = bucketName;
    }
    public void uploadToS3(String bucketName, String key, byte[] image) {
        System.out.println("Uploading image with key: " + key + " to S3 bucket " + bucketName);
    }

    public byte[] downloadFromS3(String bucketName, String key) {
        System.out.println("Downloading image with key: " + key + " from S3 bucket " + bucketName);
        return new byte[0];
    }

    public String getBucketName() {
        return bucketName;
    }


}
