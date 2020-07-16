package com.company.observer.javaOwnerImpl;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by 41082 on 2018/5/28.
 */
public class WeatherData_javaOwner extends Observable {

    private float temp, pressure, humidity;

    public WeatherData_javaOwner() {
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

    public void measureChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasureData(float temp, float pressure, float humidity){
        this.temp =temp;
        this.pressure = pressure;
        this.humidity = humidity;
        measureChanged();
    }
}
