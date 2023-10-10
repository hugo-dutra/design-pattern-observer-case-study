package adapter.ecommercenotification.implementations;


import adapter.ecommercenotification.interfaces.Receiver;

public class PushReceiver extends Receiver {
    private final String appId;

    public PushReceiver(String appId) {
        this.appId = appId;
    }

    @Override
    public String getValue() {
        return appId;
    }

}
