package observer;

import java.util.ArrayList;
import java.util.List;
public class AssortmentDB implements Observed{
    List<String> assortment = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addAssortment(String addAssortment){
        this.assortment.add(addAssortment);
        notifyObservers();
    }

    public void removeAssortment(String rmAssortment){
        this.assortment.remove(rmAssortment);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: subscribers){
            observer.handleEvent(this.assortment);
        }
    }
}
