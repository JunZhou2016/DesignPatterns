package com.fangshuoit.singletonpattern;

/**
 * 单例模式之线程安全的懒汉模式； 单例模式三要素： 私有的成员属性、私有的构造方法、公有的getXXX方法；
 * 
 * @author JunZhou
 * @Time 下午7:01:09
 * @Email 3040237357@qq.com
 * @Place @fangshuoit.com
 */
public class LazySingleton {
	private static LazySingleton lazySingleton = null;

	// 使用双重校验实现高效的线程安全的单例模式；
	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (lazySingleton == null) {
			synchronized (LazySingleton.class) {
				if (lazySingleton == null) {
					lazySingleton = new LazySingleton();
				}
			}
		}
		return lazySingleton;

	}

}
