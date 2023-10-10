package adapter.ecommercenotification.implementations;

import adapter.ecommercenotification.interfaces.Receiver;

public class EmailReceiver extends Receiver {

    private final String emailAddress;

    public EmailReceiver(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    @Override
    public String getValue() {
        return emailAddress;
    }
}
