package cn.demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
	//private ˽��.������
	//Ĭ�ϵ�  : ������	
	//protected �ܱ�����.��������ר��.	
	//public �������.
public class classdemo3 {
//ͨ�������ȡ�вι���.������.
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("cn.demo1.student");
		Constructor con = c.getConstructor(String.class,int.class);//����Ҫ�󴫵ݲ������͵�class.��Ϊ�������class
		Object obj = con.newInstance("Ф��",2);
		System.out.println(obj);
	
	//33-09:�����ȡ���췽�������еĿ�ݷ�ʽ:ֱ��Class���е�newInstance()����.��ȡ����������ʵ��.
	//ǰ����:���������б�����public���εĿղι���.
		Object obj2 = c.newInstance();
		System.out.println(obj2);

	
	//33-10:��������.ǿ�ƻ�ȡ����˽�й��췽��(��Ϊ�ƻ��˳���,������ʹ��)
	//Class������Constructor[] con2 = c.getDeclaredConstructors();ǿ�ƻ�ȡ���й��췽��.����˽��.
	//Class������Constructor con3 = c.getDeclaredConstructor(Class<?>... parameterTypes); ǿ�ƻ�ȡ����˽�з���.	
	//Constructor������setAccessible(true);��ȥ˽��Ȩ�޷���.
	Constructor[] con2 = c.getDeclaredConstructors();//ǿ�ƻ�ȡ���й��췽��.����˽��.
	Constructor con3 = c.getDeclaredConstructor(String.class);//ǿ�ƻ�ȡ����˽�з���.
	con3.setAccessible(true);//��ȥ˽��Ȩ�޷���.
	Object obj3 = con3.newInstance("xiaolei");
	System.out.println(obj3);
	
	
	
	//33-11:�����ȡ��Ա����,���޸ı�����.
	//Class������  Field[]  getFields();��ȡ���г�Ա��������.����reflect������е�Field������
	//Class������ Field  getField(String name);��ȡָ����������.(ָ���������еı���)
	//Filed������set(Object obj,Object value);�޸�ֵ����.Object obj ָ���Ǳ����ж���֧��(ָnewInstance).value�޸ĺ��ֵ
	Field[] field = c.getFields();
	for (Field field2 : field) {
		System.out.println(field2);
	}
	Object obj4 = c.newInstance();
	Field f = c.getField("name");//ע��ֻ�ܻ�ȡpublic���εı�����
	f.set(obj4, "xiaohai");
	System.out.println(obj4);
	
	
	//33-12:�����ȡ��Ա����.������.
	//Class������getMethod(String name, Class<?>... parameterTypes) ָ�����������д�������,�ͷ�������.û�в����ɲ���
	//��getMethods();��ȡ���й�������.�����̳е�.����Method[]  
	//Method��������,��invoke(Object obj, Object... args)ִ�л�ȡ���õķ���,����������,��������(ָnewInstance),һ
	//���Ƿ����Ĳ���.û�в����ɲ���.
	Method[] m = c.getMethods();//��ȡ���й�������.�����̳е�.����Method[]
	for (Method method : m) {
		//System.out.println(method);
	}
	
	Method m2 = c.getMethod("eat");//ָ�����������д�������,�ͷ�������.û�в����ɲ���
	Object obj5 = c.newInstance();//obj5�����淽����������Ҫ�Ķ������.
	m2.invoke(obj5);//��ʾ��Method���ִ�����õķ���.ִ��class����obj5�еĻ�ȡ��m2����.
	
	Method m3 = c.getMethod("eat",String.class,int.class);//ָ�����������д�������,�ͷ�������
	Object obj6 = c.newInstance();
	m3.invoke(obj6,"�ڸ�",20);//ִ�з��������ж���֧��(ָnewInstance),ִ���в����ķ���,���ݲ���
	
	//33-15:���Ͳ���
	//��ĿҪ�󴴽�ArrayList<String>
	//�����������Integer����ֵ
	ArrayList<String> array = new ArrayList<>();
	array.add("Ф��");
	Class cla = array.getClass();//�����ȡclass����
	Method m4 = cla.getMethod("add",Object.class);//�鿴API�ɿ���add�����Ĳ�����<E e>��ʾȻ��Ԫ��.Ҳ��Object
	m4.invoke(array, 100);//ִ�з���,��Ӳ���ֵ
	//��Ϊ�޷�����,����û��ʵ�ü�ֵ.(��Ϊ����������,��ǿforѭ���͵������޷�����)
	//ֻ�ǿ���Է�������.
	
	}

}
/*getConstructor(Class<?>... parameterTypes) �����б�ʾ��class���͵Ŀɱ����.��Ϊ���������ֻ��class��������ҲҪ
 * String.class int.class
 * 
*/
