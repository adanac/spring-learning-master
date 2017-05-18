package com.brianway.learning.spring.ioc.factorybean;

/**
 * Created by allen on 2017/3/8.
 */
public class PersonServiceImpl implements PersonService {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String sayHello() {
        return "hi,"+this.name;
    }
}
