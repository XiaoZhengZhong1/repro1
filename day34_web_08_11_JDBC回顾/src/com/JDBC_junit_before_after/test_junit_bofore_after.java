package com.JDBC_junit_before_after;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test_junit_bofore_after {
//������ʾһ�������ж�����Է�������
	public static void main(String[] args) {

	}

/*1:ע����ز��Է�����ʽ:@Test   ctrl+1 ����	import org.junit.Test;(һ�㿪�����߶�����junit��).�����������оͻ���
 * һ�����з���Junit Test,��������ִ��junit�����е�������*/
	
	@Test
	public void junit(){
		System.out.println("junit:��������");
	}
	
	
	
/*2:@Before����import org.junit.Before;��ʾ     ��Test֮ǰִ��   ��Junit Testִ��*/
	@Before
	public void before(){
		System.out.println("before:��.....֮ǰ");
	}
	
	
	//3:@After  import org.junit.After;  after:��ʾ  ��Text֮��ִ��.��Junit Testִ��
	@After
	public void after(){
		System.out.println("after:��....֮��");
	}
	
	
}
