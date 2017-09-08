package com.fangshuoit.abstractfactory.client;

import com.fangshuoit.abstrctfactoy.entity.CheesePizza;
import com.fangshuoit.abstrctfactoy.entity.GreekPizza;
import com.fangshuoit.abstrctfactoy.entity.Pizza;
import com.fangshuoit.abstrctfactoy.factory.CheesePizzaFactory;
import com.fangshuoit.abstrctfactoy.factory.GreekPizzaFactory;
import com.fangshuoit.abstrctfactoy.factory.PizzaFactory;

/**
 * ����ģʽ���Կͻ���; ���󹤳�ģʽ����ڼ򵥹���ģʽ���ԣ���չ�Ը��ã����Ͽ���ԭ��;
 * ע���:���󹤳��ķ���ֵ����Ϊ�����Ʒ�ֻ࣬���������������Բ�Ʒ�Ķ�̬�ԣ����򽫻�����˻�; ���󹤳�ģʽ�в�Ʒ�ǳ���ģ������в�Ʒ�Ĺ�������;
 * ���󹤳�ģʽ�ĸ���ԭ���Ƕ�̬����ѭ��ԭ���ǿ���ԭ��; �����Ҫ����Ĳ�Ʒ����Ҫ��������ת��,��ʱ���ڸ���ָ���˶�Ӧ�����࣬���Դ�ʱ��ת���ǰ�ȫ��;
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
