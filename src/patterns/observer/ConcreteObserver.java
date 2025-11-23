package patterns.observer;

public class ConcreteObserver implements IObserver {
    private String userName;
    private ISubject subject;

    public ConcreteObserver(String userName, ISubject subject) {
        this.userName = userName;
        this.subject = subject;
    }

    public String getUserName() {
        return userName;
    }

    public void register() {
        subject.registerObserver(this);
    }

    public void unregister() {
        subject.removeObserver(this);
    }

    @Override
    public void update(String availability) {
        System.out.println("Notification for " + userName + ": Product is now " + availability);
    }
}
