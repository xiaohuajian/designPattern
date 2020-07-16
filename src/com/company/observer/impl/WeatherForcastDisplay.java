package com.company.observer.impl;

import com.company.observer.Observer;
import com.company.observer.Subject;

/**
 * Created by 41082 on 2018/5/26.
 */
public class WeatherForcastDisplay implements Observer {


    private WeatherDataSubject weatherDataSubject;

    public WeatherForcastDisplay(WeatherDataSubject weatherDataSubject){
        this.weatherDataSubject = weatherDataSubject;
        this.weatherDataSubject.registerObserver(this);
    }



    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherDataSubject){
            WeatherDataSubject weatherDataSubject = (WeatherDataSubject) subject;
            System.out.println("WeatherForcastDisplay" + WeatherForcastDisplay.class.getName() + "temp：" + weatherDataSubject.getTemp()
                    + "pressure" + weatherDataSubject.getPressure()  + "humidity" + weatherDataSubject.getHumidity());

        }
    }
}
