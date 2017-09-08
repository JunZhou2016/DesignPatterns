package com.fangshuoit.abstrctfactoy.entity;

public class GreekPizza extends Pizza {
	public void prepare() {
		System.out.println("准备GreekPizza~");
	}

	public void bake() {
		System.out.println("正在烤GreekPizza~");
	}

	public void cut() {
		System.out.println("正在切GreekPizza~");
	}

	public void box() {
		System.out.println("正在打包GreekPizza~");
	}

	public void hot() {
		System.out.println("有点烫手");
	}
}