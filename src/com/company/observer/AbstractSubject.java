package com.company.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 41082 on 2018/5/28.
 */
public abstract class AbstractSubject implements Subject {

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        if (!observerList.contains(observer)){
            observerList.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observerList.contains(observer)){
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observerList.size(); i++) {
            Observer observer = observerList.get(i);
            observer.update(this);
        }
    }

    public abstract void setSubjectData();

    public abstract void setSubjectData(Object... args);

    public void measuredDataChanged(){
        notifyObserver();
    }

    public synchronized int countObservers() {
        return observerList.size();
    }
}
