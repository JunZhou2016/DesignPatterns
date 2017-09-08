package com.fangshuoit.abstractfactory.client;

import com.fangshuoit.abstrctfactoy.entity.CheesePizza;
import com.fangshuoit.abstrctfactoy.entity.GreekPizza;
import com.fangshuoit.abstrctfactoy.entity.Pizza;
import com.fangshuoit.abstrctfactoy.factory.CheesePizzaFactory;
import com.fangshuoit.abstrctfactoy.factory.GreekPizzaFactory;
import com.fangshuoit.abstrctfactoy.factory.PizzaFactory;

/**
 * 工厂模式测试客户端; 抽象工厂模式相对于简单工厂模式而言，扩展性更好，符合开闭原则;
 * 注意点:抽象工厂的返回值必须为抽象产品类，只有这样才能做到对产品的多态性，否则将会产生退化; 抽象工厂模式中产品是抽象的，是所有产品的公有属性;
 * 抽象工厂模式的根本原理是多态，遵循的原则是开闭原则; 如果需要具体的产品则需要进行向下转型,此时由于父类指向了对应的子类，所以此时的转型是安全的;
 * 
 * @author JunZhou
 * @Time 上午10:01:28
 * @Email 3040237357@qq.com
 * @Place @fangshuoit.com
 */
public class FactoryClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建工厂;
		PizzaFactory cheesePizzaFactory = new CheesePizzaFactory();
		PizzaFactory greekPizzaFactory = new GreekPizzaFactory();
		// 创建抽象产品;
		Pizza cheesePizza = cheesePizzaFactory.createPizza();
		Pizza greekPizza = greekPizzaFactory.createPizza();
		// 转换为具体的产品;
		CheesePizza chePizza = (CheesePizza) cheesePizza;
		GreekPizza grePizza = (GreekPizza) greekPizza;
		// 调用特有的方法;
		chePizza.taste();
		grePizza.hot();
	}
}
