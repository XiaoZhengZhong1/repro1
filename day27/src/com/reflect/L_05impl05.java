package com.reflect;
/*###27.11_����(��̬����ĸ�����ʵ��)
* A:��̬�������
	* ��������Ӧ���Լ��������飬���˱���������������˾��Ǵ������
	* ���������ڻؼ���Ʊ���˴���
	* ��̬�����ڳ������й����в������������,���������й����в���������ʵ�������Ǹղŷ��佲������ݣ����ԣ���̬������ʵ����ͨ������������һ������
		
	* ��Java��java.lang.reflect�����ṩ��һ��Proxy���һ��InvocationHandler�ӿڣ�ͨ��ʹ�������ͽӿھͿ������ɶ�̬�������JDK�ṩ�Ĵ���ֻ����Խӿ������������и�ǿ��Ĵ���cglib��Proxy���еķ���������̬���������
	* public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
	* ���ջ����InvocationHandler�ķ���
	* InvocationHandler Object invoke(Object proxy,Method method,Object[] args)*/
public class L_05impl05 implements L_05 {//ʵ�ֽӿ�.ע��L_05�ӿ�д��һ��Ҫ����.��Ȼ����ʵ�ֻᱨ��.

	@Override
	public void add() {
/*��Ϊ��Ӻ�ɾ��������ʵ��L_05�ӿ���д�ķ���.��ʹ����Ӻ�ɾ��ǰ��,���ܶ�Ҫ����Ȩ��У�����־��¼.����ÿ��ʵ�ָýӿڵ��඼Ҫ�޸�ԭ����
	���ӹ���̫�鷳,���Ծ����˶�̬����,�ѹ̶���Ȩ��У�����־��¼,�ö�̬�����ڵ���ʵ����ķ���,ǰ�����ִ��*/	
		//System.out.println("Ȩ��У��");
		System.out.println("��ӹ���");
	//	System.out.println("��־��¼");
	
	}

	@Override
	public void delete() {
		//System.out.println("Ȩ��У��");
		System.out.println("ɾ������");
		//System.out.println("��־��¼");
	}

}
