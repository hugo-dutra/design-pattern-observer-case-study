package adapter.ecommercenotification.implementations;

import adapter.ecommercenotification.interfaces.Receiver;

public class SMSProvider {
    public void sendSms(Receiver number, String message) {
        if(!(number instanceof SMSReceiver))
            throw new IllegalArgumentException("Invalid Receiver");
        System.out.println("SMS sent to " + number.getValue() + " with Message=" + message);
    }
}
