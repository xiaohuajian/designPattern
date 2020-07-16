package com.company.decorator;

import com.company.decorator.example_starbuzz.Beverage;
import com.company.decorator.example_starbuzz.concrete_component.HouseBlend;
import com.company.decorator.example_starbuzz.decorate.Mocha;
import com.company.decorator.example_starbuzz.decorate.Soy;
import com.hsview.client.api.civil.storage.SetStorageStrategy;
import com.hsview.client.api.things.alarm.TransferGetAlarmPlan;
import com.hsview.client.api.transfer.media.VideoDirectionSet;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 41082 on 2018/5/31.
 * <p>
 *     装饰者模式核心：装饰者和被装饰者是同一类型，才能进行包裹装饰；
 * </p>
 * <p>
 *     android context的装饰者模式 ，headVIew也是的 可以好好研究一下 这个装饰者范例写的不好，可以参考网上的范例
 * </p>
 */
public class Main {


    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        System.out.println(beverage.getCondimentDescrption() + "$:" + beverage.cost());



    }
}
