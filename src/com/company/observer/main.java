package com.company.observer;

import com.company.observer.impl.WeatherConditionDisplay;
import com.company.observer.impl.WeatherDataSubject;
import com.company.observer.impl.WeatherForcastDisplay;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 41082 on 2018/5/26.
 */
public class main {
    public static void main(String[] args) {
        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();
        WeatherConditionDisplay weatherConditionDisplay = new WeatherConditionDisplay();
        weatherConditionDisplay.setWeatherDataSubject(weatherDataSubject);
        weatherConditionDisplay.register();

        // 这个观察者在构造方法中订阅了数据源
        WeatherForcastDisplay weatherForcastDisplay = new WeatherForcastDisplay(weatherDataSubject);
        weatherDataSubject.setMeasureData(12f, 10f, 12f);

        // 每个观察者都要在数据源发射数据之前订阅，否则收不到数据
        new WeatherForcastDisplay(weatherDataSubject);




    }
}
