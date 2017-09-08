package com.fangshuoit.abstrctfactoy.factory;

import com.fangshuoit.abstrctfactoy.entity.GreekPizza;
import com.fangshuoit.abstrctfactoy.entity.Pizza;

public class GreekPizzaFactory implements PizzaFactory {

	@Override
	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new GreekPizza();
	}

}
