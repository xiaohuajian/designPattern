package com.company.observer.impl;

import com.company.observer.Observer;
import com.company.observer.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 41082 on 2018/5/26.
 * 1 .天气气象站获取数据
 *
 * <p>
 *     可以和jdk中的观察者模式结合起来使用，在增加一个父类（结合泛型知识）实现add、removeObservable、nofify的逻辑
 *     也可以增加一个boolean变量的方式 进行转换
 * </p>
 */
public class WeatherDataSubject implements Subject{

    private List<Observer> observerList = new ArrayList<>();
    private float temp, pressure, humidity;

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

    public void setMeasureData(float temp, float pressure, float humidity){
        this.temp =temp;
        this.pressure = pressure;
        this.humidity = humidity;
        measuredDataChanged();
    }

    public void measuredDataChanged(){
        notifyObserver();
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
