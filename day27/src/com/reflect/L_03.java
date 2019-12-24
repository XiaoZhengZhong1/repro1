package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


import java.lang.reflect.Method;
import java.util.ArrayList;

import com.person.person2;

public class L_03 {
	/*##27.05_����(ͨ�������ȡ���ι��췽����ʹ��)
	* Constructor
		* Class���newInstance()������ʹ�ø����޲εĹ��캯����������, ���һ����û���޲εĹ��캯��, �Ͳ�������������,���Ե���
		* Class���getConstructor(String.class,int.class)������ȡһ��ָ���Ĺ��캯��Ȼ���ٵ���Constructor���
		* newInstance("����",20)������������
*/
	public static void main(String[] args) throws  Exception {
		Class<?> class3 = Class.forName("com.person.person2");	//��ȡ�ַ��������ֽ���class����.����һ��class�����
		Constructor<?>	 c = class3.getConstructor(String.class,int.class);	//��ȡ�вι���.
		person2 p = (person2) c.newInstance("xzz",31);						//ͨ���вι��촴��ʵ������.
		System.out.println(p);

	/*	###27.06_����(ͨ�������ȡ��Ա������ʹ��)
		* Field
			* Class.getField(String)�������Ի�ȡ���е�ָ���ֶ�(�ɼ���), �����˽�еĿ�����getDeclaedField("name")������ȡ,ͨ��set(obj, "����")������������ָ�������ϸ��ֶε�ֵ, �����˽�е���Ҫ�ȵ���setAccessible(true)���÷���Ȩ��,�û�ȡ��ָ�����ֶε���get(obj)���Ի�ȡָ�������и��ֶε�ֵ	
	*/
	
			Field f = class3.getDeclaredField("name");//���������ȡ�ֶ�(��Ϊ�ֶ��Ѿ���private˽����,)
					f.setAccessible(true);				//��ȥ˽��Ȩ��.
					f.set(p, "xiaohai");				//�޸�����
	
/*
 * ###27.07_����(ͨ�������ȡ������ʹ��)
* MethodҲ��һ����.�Ƿ�����µ�.Method �ṩ�������ӿ��ϵ���ĳ���������Լ���η��ʸ÷���������Ϣ������ӳ�ķ����������෽����ʵ���������������󷽷����� 
* * Class.getMethod(String, Class...) �� Class.getDeclaredMethod(String, Class...)�������Ի�ȡ���е�ָ������,����invoke(Object, Object...)���Ե��ø÷���,Class.getMethod("eat") invoke(obj) Class.getMethod("eat",int.class) invoke(obj,10)
*  */
		Method m = class3.getMethod("eat");	//��ʾ��ȡclass3���е��޲η���,���ֽ������еķ���,class3�����ֽ������
				m.invoke(p);	//��ʾ��Method���͵�m,���÷������еķ���invike().���л�ȡ�ķ���.p����person���ʵ������.
	
		Method m2 = class3.getMethod("eat",int.class);	/*��ʾ��ȡ�вη���.��Ϊ�Ƿ�����µ����в��������ֽ�������(ע��
		���еĴ��붼�����ֽ����)*/
				m2.invoke(p, 10);	//��ʾ���л�ȡ�ķ���.����������ֵ.
	
	
/*###27.08_����(ͨ������Խ�����ͼ��)
* A:������ʾ
	* ArrayList<Integer>��һ��������������������һ���ַ������ݣ����ʵ���أ�
˵��:����ֻ�ڱ�������Ч,�����е�ʱ����Զ�������.*/
	ArrayList<Integer> list = new ArrayList<>();
			list.add(11);
			list.add(22);
	Class<?> class4 = Class.forName("java.util.ArrayList");//��ȡ���鼯�ϵ��ֽ������.
	Method m3 = class4.getMethod("add",Object.class);//��ȡ�вη���.��������add �������������,��Ϊ�Ƿ����������ֽ������
		m3.invoke(list, "abc");//��ʾ�������������еķ���,���һ���ַ���.
	System.out.println(list);	
	}
	


}




