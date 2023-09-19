package chainOfResponsability.notifying;

import chainOfResponsability.notifying.implementation.NotiftyHandlerSMS;
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
        NotifyHandler notifyHandlerSMS = new NotiftyHandlerSMS();

        notifyHandlerEmail.setNext(notifyHandlerWhatsapp);
        notifyHandlerWhatsapp.setNext(notifyHandlerSMS);

        List<User> users = new ArrayList<>();
        users.add(new User.Builder()
                .withName("Juan")
                .withEmail("juan@email.com")
                .withPhone("1111111111")
                .withWhatsApp("123456789")
                .build());
        users.add(new User.Builder()
                .withName("Pedro")
                .withEmail("Pedro@email.com")
                .withPhone("22222222222")
                .withWhatsApp("123456789")
                .build());

        notifyHandlerEmail.attach(users);
        notifyHandlerWhatsapp.attach(users);
        notifyHandlerSMS.attach(users);

        notifyHandlerEmail.notifyObservers("Hello houston, we have a problem: number 1");
        System.out.println("===========================================");
        users.add(new User.Builder()
                        .withName("Maria")
                        .withWhatsApp("123456789")
                        .build());
        System.out.println("Adding new user...");
        notifyHandlerEmail.notifyObservers("Hello houston, we have a  other problem: number 2");
        System.out.println("===========================================");
        notifyHandlerEmail.notifyObservers("Hello houston, we have a  other problem...minos one user: number 3");



    }
}
