package com.fangshuoit.simplefactory;

import com.fangshuoit.simplefactory.entity.CheesePizza;
import com.fangshuoit.simplefactory.entity.GreekPizza;
import com.fangshuoit.simplefactory.entity.Pizza;

/**
 * SimpleFactoryģʽ�ֳ�Ϊ��̬����ģʽ;
 * �򵥹���ģʽ���ŵ㣺
 *ģʽ�ĺ����ǹ����ࡣ����ຬ�б�Ҫ���ж��߼������Ծ�����ʲôʱ�򴴽���һ����Ʒ���ʵ����
 *���ͻ�����������ֱ�Ӵ�����������Σ������Ǹ�����Ա�����򵥹���ģʽͨ����������ʵ���˶����εķָ
 *ʵ��������ʹ����ķ���; 
 * @author JunZhou
 * @Time   ����10:19:27
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
