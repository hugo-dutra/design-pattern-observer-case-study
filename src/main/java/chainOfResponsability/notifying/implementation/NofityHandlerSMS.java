package chainOfResponsability.notifying.implementation;

import chainOfResponsability.notifying.interfaces.NotifyHandler;
import chainOfResponsability.notifying.models.User;

import java.util.ArrayList;
import java.util.List;

public class NofityHandlerSMS  implements NotifyHandler {
    private NotifyHandler next;
    private List<User> users = new ArrayList<>();
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
    public void detach(User observer) {
        users.remove(observer);
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public void notifyObservers(String message) {
        for (User user : users) {
            if (user.getPhone() != null && !user.getPhone().isEmpty()) {
                System.out.println("Sending SMS to: " + user.getPhone() + " with message: " + message + " to user " + user.getName() + "...");
                user.update(message);
            }
        }
        if (next != null)
            next.notifyObservers(message);
    }
}
