package com.fangshuoit.abstrctfactoy.factory;

import com.fangshuoit.abstrctfactoy.entity.CheesePizza;
import com.fangshuoit.abstrctfactoy.entity.Pizza;

public class CheesePizzaFactory implements PizzaFactory {

	@Override
	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new CheesePizza();
	}

}
