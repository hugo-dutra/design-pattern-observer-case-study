package chainOfResponsability.notifying.implementation;

import chainOfResponsability.notifying.interfaces.NotifyHandler;
import chainOfResponsability.notifying.interfaces.UserObserver;
import chainOfResponsability.notifying.models.User;

import java.util.ArrayList;
import java.util.List;

public class NotifyHandlerEmail implements NotifyHandler {
    private NotifyHandler next;
    List<User> observers = new ArrayList<>();
    @Override
    public void setNext(NotifyHandler handler) {
        this.next = handler;
    }

    @Override
    public void attach(User user) {
        observers.add(user);
    }

    @Override
    public void detach(User user) {
        observers.remove(user);
    }

    @Override
    public void notifyObservers(String message) {
        for (User user : observers) {
            if(user.getEmail() != null && !user.getEmail().isEmpty()) {
                System.out.println("Sending email to: " + user.getEmail());
                user.update(message);
            }
        }
        next.notifyObservers(message);
    }
}
