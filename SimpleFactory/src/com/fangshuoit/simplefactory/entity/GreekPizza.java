package com.fangshuoit.simplefactory.entity;

public class GreekPizza  extends Pizza{
    public void prepare(){
       System.out.println("׼��GreekPizza~");
    }
    public void bake(){
        System.out.println("���ڿ�GreekPizza~");
    }
    public void cut(){
        System.out.println("������GreekPizza~");
    }
    public void box(){
        System.out.println("���ڴ��GreekPizza~");
    }
}