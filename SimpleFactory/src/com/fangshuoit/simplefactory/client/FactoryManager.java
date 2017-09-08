package com.fangshuoit.simplefactory.client;

import com.fangshuoit.simplefactory.entity.CheesePizza;
import com.fangshuoit.simplefactory.entity.GreekPizza;
import com.fangshuoit.simplefactory.entity.Pizza;

public class FactoryManager {
  public static void main(String[] args) {
	 getProduction("cheese").bake();
}
  
  public static Pizza getProduction(String orderType){
	  Pizza pizza = null;
	  try{
		  if("cheese".equals(orderType)) pizza = new CheesePizza();
		  if("greek".equals(orderType)) pizza = new GreekPizza();
		  }catch(Exception e){
			  e.printStackTrace();
		  }
	  
	  return pizza;
  }
}
