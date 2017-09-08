package com.fangshuoit.thread;

public class TestThread {
	public static void main(String[] args) {
		System.out.println("���߳�ID�ǣ�" + Thread.currentThread().getId());
		MyThread my = new MyThread("�߳�1");
		my.start();

		MyThread my2 = new MyThread("�߳�2");
		/**
		 * ����ֱ�ӵ���my2��run()������
		 */
		my2.run();
	}
}

class MyThread extends Thread {
	private String name;

	public MyThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("���֣�" + name + "���߳�ID��=" + Thread.currentThread().getId());
	}
}