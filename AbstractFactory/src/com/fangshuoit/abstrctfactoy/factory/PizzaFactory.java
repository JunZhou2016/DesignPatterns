package com.fangshuoit.abstrctfactoy.factory;

import com.fangshuoit.abstrctfactoy.entity.Pizza;

public interface PizzaFactory {
	/**
	 * 工厂方法
	 * 
	 * @return
	 */
	public Pizza createPizza();
}
