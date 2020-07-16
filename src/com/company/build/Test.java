package com.company.build;

public class Test {

    public static void main(String[] args) {
        BuildBean.Builder builder = new BuildBean.Builder();
        builder.setAge("12122");
        builder.setName("sfdsdf");
        BuildBean buildBean = builder.build();
        BuildBean buildBean2 = new BuildBean.Builder()
                .setName("adcc")
                .setAge("00")
                .build();
    }
}
