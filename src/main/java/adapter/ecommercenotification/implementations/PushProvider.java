package adapter.ecommercenotification.implementations;

import adapter.ecommercenotification.interfaces.Receiver;

public class PushProvider {
    public void sendPush(Receiver appId, String message) {
        if(!(appId instanceof PushReceiver))
            throw new IllegalArgumentException("Invalid Receiver");
        System.out.println("Push sent to " + appId.getValue() + " with Message=" + message);
    }
}
