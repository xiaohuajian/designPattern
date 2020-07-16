package com.company.proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OwnerInvocationHandler implements InvocationHandler {

    PersonBean personBean;

    public OwnerInvocationHandler(PersonBean bean){
        this.personBean = bean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")){
            return method.invoke(personBean, args);
        }else if (method.getName().equals("setRating")){
            throw new IllegalAccessException();
        }else if (method.getName().startsWith("set")){
            return method.invoke(personBean, args);
        }
        return null;
    }



}
