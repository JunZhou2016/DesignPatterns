package com.fangshuoit.polymorphicfactoy.factory;

import com.fangshuoit.polymorphicfactoy.entity.CheesePizza;
import com.fangshuoit.polymorphicfactoy.entity.Pizza;

public class CheesePizzaFactory implements PizzaFactory {

	@Override
	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new CheesePizza();
	}

}
