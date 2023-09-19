package chainOfResponsability.notifying.interfaces;

public interface UserSubject {
    void attach(UserObserver observer);
    void detach(UserObserver observer);
    void notifyObservers(String message);
}
