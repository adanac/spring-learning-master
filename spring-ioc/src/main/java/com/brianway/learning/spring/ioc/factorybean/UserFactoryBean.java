package com.brianway.learning.spring.ioc.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by allen on 2017/3/8.
 */
public class UserFactoryBean implements FactoryBean<User> {

    private User user;

    /**
     * 获取实际要返回的bean对象
     *
     * @return
     * @throws Exception
     */
    public User getObject() throws Exception {
        if(null == user){
            synchronized (this){
                if(null == user){
                    User user = new User();
                    user.setId("1");
                    user.setName("Feagle");
                }
            }
        }
        return user;
    }


    /**
     * 获取返回的对象类型
     *
     * @return
     */
    public Class<?> getObjectType() {
        return User.class;
    }

    /**
     * 是否单例
     *
     * @return
     */
    public boolean isSingleton() {
        return true;
    }
}
