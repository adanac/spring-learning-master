package com.brianway.learning.spring.ioc.factorybean;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by allen on 2017/3/8.
 */
public class DefineFactoryBeanTest {
    /**
     * 会发现sayHello与getName方法调用前后都有log打印
     */
    @Test
    public void testGetBean() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/brianway/learning/spring/ioc/factorybean/beans-definefactorybean.xml");
        PersonService person = (PersonService) ctx.getBean("definePerson");

        System.out.println(person);
        System.out.println(person.getName());
        System.out.println(person.sayHello());
    }
}