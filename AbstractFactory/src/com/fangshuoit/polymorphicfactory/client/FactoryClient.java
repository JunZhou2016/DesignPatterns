package com.fangshuoit.polymorphicfactory.client;

import com.fangshuoit.polymorphicfactoy.entity.CheesePizza;
import com.fangshuoit.polymorphicfactoy.entity.GreekPizza;
import com.fangshuoit.polymorphicfactoy.entity.Pizza;
import com.fangshuoit.polymorphicfactoy.factory.CheesePizzaFactory;
import com.fangshuoit.polymorphicfactoy.factory.GreekPizzaFactory;
import com.fangshuoit.polymorphicfactoy.factory.PizzaFactory;

/**
 * ��������ģʽ���Կͻ���; ���󹤳�ģʽ����ڼ򵥹���ģʽ���ԣ���չ�Ը��ã����Ͽ���ԭ��;
 * ע���:��������ģʽ�ķ���ֵ����Ϊ�����Ʒ�ֻ࣬���������������Բ�Ʒ�Ķ�̬�ԣ����򽫻�����˻�; ��������ģʽ�в�Ʒ�ǳ���ģ������в�Ʒ�Ĺ�������;
 * ��������ģʽ�ĸ���ԭ���Ƕ�̬����ѭ��ԭ���ǿ���ԭ��; �����Ҫ����Ĳ�Ʒ����Ҫ��������ת��,��ʱ���ڸ���ָ���˶�Ӧ�����࣬���Դ�ʱ��ת���ǰ�ȫ��;
 * 
 * @author JunZhou
 * @Time ����10:01:28
 * @Email 3040237357@qq.com
 * @Place @fangshuoit.com
 */
public class FactoryClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��������;
		PizzaFactory cheesePizzaFactory = new CheesePizzaFactory();
		PizzaFactory greekPizzaFactory = new GreekPizzaFactory();
		// ���������Ʒ;
		Pizza cheesePizza = cheesePizzaFactory.createPizza();
		Pizza greekPizza = greekPizzaFactory.createPizza();
		// ת��Ϊ����Ĳ�Ʒ;
		CheesePizza chePizza = (CheesePizza) cheesePizza;
		GreekPizza grePizza = (GreekPizza) greekPizza;
		// �������еķ���;
		chePizza.taste();
		grePizza.hot();
	}
}
