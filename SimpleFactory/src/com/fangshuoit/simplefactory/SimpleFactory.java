package com.fangshuoit.simplefactory;

import com.fangshuoit.simplefactory.entity.CheesePizza;
import com.fangshuoit.simplefactory.entity.GreekPizza;
import com.fangshuoit.simplefactory.entity.Pizza;

/**
 * SimpleFactory模式又称为静态工厂模式;
 * 简单工厂模式的优点：
 *模式的核心是工厂类。这个类含有必要的判断逻辑，可以决定在什么时候创建哪一个产品类的实例。
 *而客户端则可以免除直接创建对象的责任（比如那个服务员）。简单工厂模式通过这种做法实现了对责任的分割。
 *实现了请求和创建的分离; 
 * @author JunZhou
 * @Time   下午10:19:27
 * @Email  3040237357@qq.com
 * @Place  @fangshuoit.com
 */
public class SimpleFactory {
	public static Pizza CreatePizza(String orderType){
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new GreekPizza();
        }
        return pizza;
    }
}
