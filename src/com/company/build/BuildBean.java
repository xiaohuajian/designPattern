package com.company.build;

public class BuildBean {

    public final String name;

    public final String age;


    private BuildBean(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }


    public String getAge() {
        return age;
    }

    public BuildBean get(){
        return this;
    }


    @Override
    public String toString() {
        return "BuildBean{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static class Builder{
        private String name;

        private String age;

        public BuildBean.Builder setName(String name){
            this.name = name;
            return this;
        }

        public BuildBean.Builder setAge(String age){
            this.age = age;
            return this;
        }

        public BuildBean build(){
            //P = new BuildBean();
            return new BuildBean(this);
        }

        public Builder(){}
    }

    public static void main(String[] args) {
        BuildBean buildBean = new BuildBean.Builder()
                .setAge("12")
                .setName("sjh")
                .build();
        System.out.println(buildBean.toString());
        BuildBean.Builder builder = new Builder();
        builder.setAge("12122");
        builder.setName("sfdsdf");
        BuildBean buildBean1 = new BuildBean(new Builder());
    }
}
