package com.reflect;
/*###27.11_����(��̬����ĸ�����ʵ��)
* A:��̬�������
	* ��������Ӧ���Լ��������飬���˱���������������˾��Ǵ������
	* ���������ڻؼ���Ʊ���˴���
	* ��̬�����ڳ������й����в������������,���������й����в���������ʵ�������Ǹղŷ��佲������ݣ����ԣ�
	* ��̬������ʵ����ͨ������������һ������
		
	* ��Java��java.lang.reflect�����ṩ��һ��Proxy���һ��InvocationHandler�ӿڣ�ͨ��ʹ�������ͽӿھͿ������ɶ�̬�������
	* JDK�ṩ�Ĵ���ֻ����Խӿ������������и�ǿ��Ĵ���cglib��Proxy���еķ���������̬���������
	* public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
	* ���ջ����InvocationHandler�ķ���
	* InvocationHandler Object invoke(Object proxy,Method method,Object[] args)*/
public interface L_05 {	//����һ���ӿ�.
	public void add();

	public void delete();
}
