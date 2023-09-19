package chainOfResponsability.notifying.implementation;

import chainOfResponsability.notifying.interfaces.NotifyHandler;
import chainOfResponsability.notifying.models.User;

import java.util.ArrayList;
import java.util.List;

public class NotifyHandlerEmail implements NotifyHandler {
    private NotifyHandler next;
    List<User> users = new ArrayList<>();
    @Override
    public void setNext(NotifyHandler handler) {
        this.next = handler;
    }

    @Override
    public void attach(List<User> users) {
        users = users;
    }

    @Override
    public void detach(User user) {
        users.remove(user);
    }

    @Override
    public void notifyObservers(String message) {
        for (User user : users) {
            if(user.getEmail() != null && !user.getEmail().isEmpty()) {
                System.out.println("Sending email to: " + user.getEmail());
                user.update(message);
            }
        }
        next.notifyObservers(message);
    }
}
