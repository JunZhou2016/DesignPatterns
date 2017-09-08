package com.fangshuoit.polymorphicfactoy.factory;

import com.fangshuoit.polymorphicfactoy.entity.Pizza;

public interface PizzaFactory {
	/**
	 * 工厂方法
	 * 
	 * @return
	 */
	public Pizza createPizza();
}
