package cn.demo1;

import java.lang.reflect.Constructor;

public class classdemo2 {
/*ͨ������class.forName()��ȡstudent��class����,����.getConstructor()��ȡ���췽��.�����Թ�������constructor ����;
 * ���й�������з���newInstance()��ȡʵ������,����һObject����.
 * ��studentǿתObject����.����ǿת��������student���г�Ա�����ͱ���.*/
	public static void main(String[] args) throws Exception {
	Class c	= Class.forName("cn.demo1.student");//ͨ������class.forName()��ȡstudent��class����
	Constructor ctr = c.getConstructor();	
	//û��s,�ǻ�ȡָ����������,API����ʾ����������Object...obj�ǿɱ����,�ɴ��ɲ���.����,��ʾ��ȡ�ղι���.
	System.out.println(ctr);		//���н�� cn.demo1.student()
	Object obj = ctr.newInstance();//���й�������з���newInstance()��ȡʵ������,����һObject����.
	System.out.println(obj);		//stuedent [name=null, age=0]
	student s = (student)obj;		//��studentǿתObject����
	s.eat();						//����ǿת��������student���г�Ա�����ͱ���.
	
	
	//����getConstructors();����s�ǻ�ȡ���й����Ĺ���.
//	Constructor[] con = c.getConstructors();//constructorsĩβ����s,��ʾ����.���Ƕ��.��ȡ��������������.
//	for (Constructor co : con) {
//		System.out.println(co);//���н��,һ���ղι��췽��,һ���вι��췽��.(ֻ�ܻ�ȡpublic���εĹ�������)
//	}
	
	}

}
