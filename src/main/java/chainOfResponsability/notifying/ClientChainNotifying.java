package chainOfResponsability.notifying;

import chainOfResponsability.notifying.implementation.NofityHandlerSMS;
import chainOfResponsability.notifying.implementation.NotifyHandlerEmail;
import chainOfResponsability.notifying.implementation.NotifyHandlerWhatsapp;
import chainOfResponsability.notifying.interfaces.NotifyHandler;
import chainOfResponsability.notifying.models.User;

import java.util.ArrayList;
import java.util.List;

public class ClientChainNotifying {
    public static void main(String[] args) {
        NotifyHandler notifyHandlerEmail = new NotifyHandlerEmail();
        NotifyHandler notifyHandlerWhatsapp = new NotifyHandlerWhatsapp();
        NotifyHandler notifyHandlerSMS = new NofityHandlerSMS();

        notifyHandlerEmail.setNext(notifyHandlerWhatsapp);
        notifyHandlerWhatsapp.setNext(notifyHandlerSMS);


        List<User> users = new ArrayList<>();
        users.add(new User.Builder()
                .withName("Juan")
                .withEmail("juan@email.com")
                .withPhone("123456789")
                .withWhatsApp("123456789")
                .build());
        users.add(new User.Builder()
                .withName("Pedro")
                .withPhone("123456789")
                .withWhatsApp("123456789")
                .build());

        notifyHandlerEmail.attach(users);
        notifyHandlerWhatsapp.attach(users);
        notifyHandlerSMS.attach(users);

        notifyHandlerEmail.notifyObservers("Hello houston, we have a problem...");

        users.add(new User.Builder()
                        .withName("Maria")
                        .withWhatsApp("123456789")
                        .build());

        System.out.println("Adding new user...");


        notifyHandlerEmail.attach(users);
        notifyHandlerWhatsapp.attach(users);
        notifyHandlerSMS.attach(users);

        notifyHandlerEmail.notifyObservers("Hello houston, we have a  other problem...");



    }
}
