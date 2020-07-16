package com.company.observer.impl;

import com.company.observer.Observer;
import com.company.observer.Subject;

/**
 * Created by 41082 on 2018/5/26.
 * 天气预报展示板
 */
public class WeatherConditionDisplay implements Observer {



    private WeatherDataSubject weatherDataSubject;

    public WeatherConditionDisplay(){

    }

    public WeatherConditionDisplay(WeatherDataSubject weatherDataSubject) {
        this.weatherDataSubject = weatherDataSubject;
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherDataSubject){
            WeatherDataSubject weatherDataSubject = (WeatherDataSubject) subject;
            System.out.println("WeatherForcastDisplay" + WeatherForcastDisplay.class.getName() + "temp：" + weatherDataSubject.getTemp()
                    + "pressure" + weatherDataSubject.getPressure()  + "humidity" + weatherDataSubject.getHumidity());

        }
    }

    private void display(float temp, float pressure, float humidity){
        System.out.println("WeatherConditionDisplay" + WeatherConditionDisplay.class.getName() + "temp：" + temp + "pressure" + pressure + "humidity" + humidity);
    }

    public WeatherDataSubject getWeatherDataSubject() {
        return weatherDataSubject;
    }

    public void setWeatherDataSubject(WeatherDataSubject weatherDataSubject) {
        this.weatherDataSubject = weatherDataSubject;
    }

    public void register(){
        weatherDataSubject.registerObserver(this);
    }
}
