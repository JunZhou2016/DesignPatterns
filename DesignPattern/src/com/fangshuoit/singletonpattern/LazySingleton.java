package com.fangshuoit.singletonpattern;

/**
 * ����ģʽ֮�̰߳�ȫ������ģʽ�� ����ģʽ��Ҫ�أ� ˽�еĳ�Ա���ԡ�˽�еĹ��췽�������е�getXXX������
 * 
 * @author JunZhou
 * @Time ����7:01:09
 * @Email 3040237357@qq.com
 * @Place @fangshuoit.com
 */
public class LazySingleton {
	private static LazySingleton lazySingleton = null;

	// ʹ��˫��У��ʵ�ָ�Ч���̰߳�ȫ�ĵ���ģʽ��
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
