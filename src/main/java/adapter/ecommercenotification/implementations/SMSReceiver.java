package adapter.ecommercenotification.implementations;

import adapter.ecommercenotification.interfaces.Receiver;

public class SMSReceiver extends Receiver {
    private final String phoneNumber;

    public SMSReceiver(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getValue() {
        return phoneNumber;
    }
}
