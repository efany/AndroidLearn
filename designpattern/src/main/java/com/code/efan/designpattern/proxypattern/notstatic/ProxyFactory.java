package com.code.efan.designpattern.proxypattern.notstatic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by efan on 2017/7/3.
 * Email: yifanyan@sohu-inc.com
 */

public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

                        System.out.println("开始事务...");
                        Object returnValue = method.invoke(target, objects);
                        System.out.println("提交事务...");
                        return returnValue;
                    }
                }
        );
    }
}
