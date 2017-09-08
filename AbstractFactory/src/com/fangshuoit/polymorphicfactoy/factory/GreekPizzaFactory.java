package com.fangshuoit.polymorphicfactoy.factory;

import com.fangshuoit.polymorphicfactoy.entity.GreekPizza;
import com.fangshuoit.polymorphicfactoy.entity.Pizza;

public class GreekPizzaFactory implements PizzaFactory {

	@Override
	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new GreekPizza();
	}

}
