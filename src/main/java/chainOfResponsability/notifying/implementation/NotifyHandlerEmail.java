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
        this.users = handler.getUsers();
    }

    @Override
    public void attach(List<User> users) {
        this.users = users;
    }

    @Override
    public void detach(User user) {
        users.remove(user);
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public void notifyObservers(String message) {
        for (User user : users) {
            if (user.getEmail() != null && !user.getEmail().isEmpty()) {
                System.out.println("Sending email to: " + user.getEmail()  + " with message: " + message + " to user " + user.getName() + "...");
                user.update(message);
            }
        }
        if (next != null)
            next.notifyObservers(message);
    }
}
