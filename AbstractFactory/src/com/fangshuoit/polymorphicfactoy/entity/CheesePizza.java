package com.fangshuoit.polymorphicfactoy.entity;

public class CheesePizza extends Pizza {
	public void prepare() {
		System.out.println("׼��CheesePizza~");
	}

	public void bake() {
		System.out.println("���ڿ�CheesePizza~");
	}

	public void cut() {
		System.out.println("������CheesePizza~");
	}

	public void box() {
		System.out.println("���ڴ��CheesePizza~");
	}

	public void taste() {
		System.out.println("�̲�ζ����");
	}
}