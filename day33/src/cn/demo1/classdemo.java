package cn.demo1;

public class classdemo {

	public static void main(String[] args) throws ClassNotFoundException {
	//��ʾ��ȡһ������ֽ����ļ������3�ַ�ʽ
		//1:�����ȡ
		student s = new student();
		Class c = s.getClass();
		System.out.println(c);

		//2:������ȡ(�κ�һ���඼��һ����̬������class)
		Class c2 = student.class;
		System.out.println(c2);
	
		//3:����Class���еľ�̬����,forName(String name);ע������е��ַ������������� ����.����  ������ȫ��,
		 Class c3 = Class.forName("cn.demo1.student");
		 System.out.println(c3);
	}


}
