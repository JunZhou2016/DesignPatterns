package com.fangshuoit.singletonpattern;
/**
 * ����ģʽ����
 * @author JunZhou
 * @Time   ����8:09:01
 * @Email  3040237357@qq.com
 * @Place  @fangshuoit.com
 */
public class SingleTonTest {
  public static void main(String[] args) {
	  System.out.println(LazySingleton.getInstance().hashCode()+"------------->1");
	  System.out.println(LazySingleton.getInstance().hashCode()+"------------->1");
}
}
