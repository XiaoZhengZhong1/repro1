package com.reflect;

import com.person.person;

public class L_01 {
	/*###27.01_����(��ļ��ظ����ͼ���ʱ��)-----��Ҫ��Ե���class
	* A:��ļ��ظ���
		* ������Ҫʹ��ĳ����ʱ��������໹δ�����ص��ڴ��У���ϵͳ��ͨ�����أ����ӣ���ʼ��������ʵ�ֶ��������г�ʼ����
		* ���� 
			* ����ָ��class�ļ������ڴ棬��Ϊ֮����һ��Class�����κ��౻ʹ��ʱϵͳ���Ὠ��һ��Class����
		* ����
			* ��֤ �Ƿ�����ȷ���ڲ��ṹ������������Э��һ��
			* ׼�� ����Ϊ��ľ�̬��Ա�����ڴ棬������Ĭ�ϳ�ʼ��ֵ
			* ���� ����Ķ����������еķ��������滻Ϊֱ������
			
		* ��ʼ�� ����������ǰ�����ĳ�ʼ������
	* B:����ʱ��
		* �������ʵ��
		* ������ľ�̬����������Ϊ��̬������ֵ
		* ������ľ�̬����
		* ʹ�÷��䷽ʽ��ǿ�ƴ���ĳ�����ӿڶ�Ӧ��java.lang.Class����
		* ��ʼ��ĳ���������
		* ֱ��ʹ��java.exe����������ĳ������

	###27.02_����(��������ĸ����ͷ���)
	* A:��������ĸ���
		* ����.class�ļ����ص��ڴ��У���Ϊ֮���ɶ�Ӧ��Class������Ȼ���ǲ���Ҫ��������ػ��ƣ������˽�����������Ǿ��ܸ��õ�������
		* �����С�
	* B:��������ķ���
		* Bootstrap ClassLoader ���������
		* Extension ClassLoader ��չ�������
		* Sysetm ClassLoader ϵͳ�������
	* C:�������������
		* Bootstrap ClassLoader ���������
			* Ҳ����Ϊ�����������������Java������ļ���
			* ����System,String�ȡ���JDK��JRE��libĿ¼��rt.jar�ļ���
		* Extension ClassLoader ��չ�������
			* ����JRE����չĿ¼��jar���ļ��ء�
			* ��JDK��JRE��libĿ¼��extĿ¼
		* Sysetm ClassLoader ϵͳ�������
			* ������JVM����ʱ��������java�����class�ļ����Լ�classpath����������ָ����jar������·��

	###27.03_����(�������)
	* A:�������
		* JAVA���������������״̬�У���������һ���࣬���ܹ�֪���������������Ժͷ�����
		* ��������һ�����󣬶��ܹ�������������һ�����������ԣ�
		* ���ֶ�̬��ȡ����Ϣ�Լ���̬���ö���ķ����Ĺ��ܳ�Ϊjava���Եķ�����ơ�
		* Ҫ�����һ����,������Ҫ��ȡ��������ֽ����ļ�����
		* ������ʹ�õľ���Class���еķ�����������Ҫ��ȡ��ÿһ���ֽ����ļ���Ӧ��Class���͵Ķ���

	* B:���ַ�ʽ
		* a:Object���getClass()����,�ж����������Ƿ���ͬһ���ֽ����ļ�---Class class4 = p.getClass()
		* b:��̬����class,������----Class class3 = person.class;
		* c:Class���о�̬����forName(),��ȡ�����ļ�-----Class class2 = Class.forName("com.person.person");
	* C:������ʾ
		* ��ȡclass�ļ���������ַ�ʽ*/
	public static void main(String[] args) throws ClassNotFoundException {
	Class<?> class2 = 	Class.forName("com.person.person");/*c:Class���о�̬����forName(),��ȡ�����ļ�(ע��,��������ͬ
	һ��Ŀ��.���Ҳ�����,ͬһ��Ŀ��,����д��Ŀ��,���ǰ���������һ��Ҫдȫ.)*/
	Class<person> class3 = person.class;	//b:��̬����class,������
	
		person p = new person();
		Class<? extends person> class4 = p.getClass();	//a:Object���getClass()����,�ж����������Ƿ���ͬһ���ֽ����ļ�
		System.out.println(class2 == class3);
	System.out.println(class3 == class4);
	}

}
