package com.company.proxy.demo2;

public class PersonBeanImpl implements PersonBean {

    String name;
    String interests;
    int rating ;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setRating(int rating) {
        this.rating = rating;
    }

    public PersonBeanImpl() {
    }

    public PersonBeanImpl(String name, String interests, int rating) {
        this.name = name;
        this.interests = interests;
        this.rating = rating;
    }
}
