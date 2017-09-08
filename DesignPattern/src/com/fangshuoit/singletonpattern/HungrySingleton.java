package com.fangshuoit.singletonpattern;
/**
 * 饿汉模式下的单例模式;
 * @author JunZhou
 * @Time   下午8:16:17
 * @Email  3040237357@qq.com
 * @Place  @fangshuoit.com
 */
public class HungrySingleton {
	//此处利用jvm本身的机制，即静态变量在内存中只存在一份实现了线程的安全;
	
   //饿汉模式下，为了实现懒汉模式，采用静态内部类的方式实现；
	public static class SingletonHolder{
		private static final HungrySingleton INSTANCE = new HungrySingleton();
	}
	//私有的构造方法;
	private HungrySingleton(){}
	
	//公有的取值方法;
	public static HungrySingleton getInstance(){
		return SingletonHolder.INSTANCE;
	}
}
