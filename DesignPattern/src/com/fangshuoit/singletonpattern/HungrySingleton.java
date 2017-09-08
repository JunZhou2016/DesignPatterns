package com.fangshuoit.singletonpattern;
/**
 * ����ģʽ�µĵ���ģʽ;
 * @author JunZhou
 * @Time   ����8:16:17
 * @Email  3040237357@qq.com
 * @Place  @fangshuoit.com
 */
public class HungrySingleton {
	//�˴�����jvm����Ļ��ƣ�����̬�������ڴ���ֻ����һ��ʵ�����̵߳İ�ȫ;
	
   //����ģʽ�£�Ϊ��ʵ������ģʽ�����þ�̬�ڲ���ķ�ʽʵ�֣�
	public static class SingletonHolder{
		private static final HungrySingleton INSTANCE = new HungrySingleton();
	}
	//˽�еĹ��췽��;
	private HungrySingleton(){}
	
	//���е�ȡֵ����;
	public static HungrySingleton getInstance(){
		return SingletonHolder.INSTANCE;
	}
}
