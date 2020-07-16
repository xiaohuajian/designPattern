package com.company.observer.javaOwnerImpl;

import com.company.observer.IDisplay;
import com.company.observer.impl.WeatherForcastDisplay;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by 41082 on 2018/5/28.
 */
public class WeatherForcastDisplay_javaOwner implements Observer ,IDisplay{

    private WeatherData_javaOwner weatherData_javaOwner;
    private float temp, pressure, humidity;

    /**
     *
     * @param o
     * @param arg 这个参数压根没有用到 在源码中 很诧异还要写这个参数
     */
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData_javaOwner){
            weatherData_javaOwner = (WeatherData_javaOwner) o;
            temp = weatherData_javaOwner.getTemp();
            pressure = weatherData_javaOwner.getPressure();
            humidity = weatherData_javaOwner.getHumidity();
            disPlay();
        }
    }

    @Override
    public void disPlay() {
        System.out.println("ForcastDisplay" + WeatherForcastDisplay_javaOwner.class.getName() + "temp：" + temp + "pressure" + pressure + "humidity" + humidity);
    }
}
