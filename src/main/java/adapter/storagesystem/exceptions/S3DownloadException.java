package adapter.storagesystem.exceptions;

public class S3DownloadException extends RuntimeException{
    public S3DownloadException(String message) {
        super(message);
    }
}
