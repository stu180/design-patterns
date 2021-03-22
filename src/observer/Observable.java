package observer;

public interface Observable {
    void subscribe(Observer exerciseSubscriber);
    void unsubscribe(Observer exerciseSubscriber);
    void notifyObservers();
    String getUpdate();
}
