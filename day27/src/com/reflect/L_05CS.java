package com.reflect;

import java.lang.reflect.Proxy;

/*###27.11_����(��̬����ĸ�����ʵ��)
* A:��̬�������
	* ��������Ӧ���Լ��������飬���˱���������������˾��Ǵ������
	* ���������ڻؼ���Ʊ���˴���
	* ��̬�����ڳ������й����в������������,���������й����в���������ʵ�������Ǹղŷ��佲������ݣ����ԣ���̬������ʵ����ͨ������������һ������
		
	* ��Java��java.lang.reflect�����ṩ��һ��Proxy���һ��InvocationHandler�ӿڣ�ͨ��ʹ�������ͽӿھͿ������ɶ�̬�������JDK�ṩ�Ĵ���ֻ����Խӿ������������и�ǿ��Ĵ���cglib��Proxy���еķ���������̬���������
	* public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
	* ���ջ����InvocationHandler�ķ���
	* InvocationHandler Object invoke(Object proxy,Method method,Object[] args)*/
public class L_05CS {//������

	public static void main(String[] args) {
		L_05impl05 L = new L_05impl05();
				L.add();
				L.delete();
	System.out.println("--------------------");
	L_05JK jk = new L_05JK(L);//�������������,����L.
	//JDK�ṩ�Ĵ���ֻ����Խӿ�������,���Է��ص���һ���ӿ�,���Ǵ������ĸ��ӿ�.
	L_05 D = (L_05) Proxy.newProxyInstance(L.getClass().getClassLoader(),L.getClass().getInterfaces(), jk);
		D.add();
	System.out.println();
		D.delete();
	}

}
