package com.company.observer.javaOwnerImpl;

/**
 * Created by 41082 on 2018/5/28.
 */
public class main {

    public static void main(String[] args) {

        WeatherData_javaOwner weatherData_javaOwner = new WeatherData_javaOwner();
        WeatherForcastDisplay_javaOwner weatherForcastDisplay_javaOwner = new WeatherForcastDisplay_javaOwner();
        weatherData_javaOwner.addObserver(weatherForcastDisplay_javaOwner);
        weatherData_javaOwner.setMeasureData(1f, 2f, 3f);

    }
}
