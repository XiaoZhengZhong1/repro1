package com.test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class test1 {
/*1.ArrayList<Integer> list = new ArrayList<Integer>(); 
	�������ΪInteger��ArrayList�д��һ��String���͵Ķ���*/
	public static void main(String[] args) throws Exception{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(200);
		Class c = list.getClass();
		Method md = c.getMethod("add",Object.class);
		md.invoke(list, "���");
		System.out.println(list);
	}

}
