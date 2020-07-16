package com.company.proxy.demo2;

import java.lang.reflect.Proxy;

/**
 * 这里也是代理模式
 * OwnerInvocationHandler利用接口PersonBean为参数动态生成实现类，然后再这个类中去拦截（invoke方法里有一些其他逻辑）
 * 一些东西就是相当于代理的思想。并且会持有真正实现类 OwnerInvocationHandler 的构造方法
 */

public class Test {

    public static void main(String[] args) {

       Test test = new Test();
       test.drive();

    }

    /**
     * 这里利用反射的方式来用生成代理类 在通过代理委托给realSubject类
     * @param bean
     * @return
     */
    PersonBean getOwnerProxy(PersonBean bean){

        return (PersonBean) Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces()
                ,new OwnerInvocationHandler(bean));
    }

    void drive(){
        PersonBeanImpl beanImpl = new PersonBeanImpl("sjh", "football" , 4);
        PersonBean beanProxy = getOwnerProxy(beanImpl);
        try {
            beanProxy.setRating(5);

        }catch (Exception e){
            System.out.println("异常");
            e.printStackTrace();
        }
        System.out.println("interest" + beanProxy.getInterests());
        System.out.println("name" + beanProxy.getName());
        beanProxy.setName("sjhsjhsjh");
        System.out.println("name" + beanProxy.getName());
    }
}
