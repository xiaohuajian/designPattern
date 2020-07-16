package com.company.observer;

/**
 * Created by 41082 on 2018/5/26.
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

}
