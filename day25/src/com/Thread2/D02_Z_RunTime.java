package com.Thread2;

import java.io.IOException;

public class D02_Z_RunTime {
	/*###25.02_���߳�(Runtime��)-----��java lang���µ�,��ʱ���õ���.
	* Runtime����һ��������---������һ�������� Process exec(String command) ��ʾ �ڵ����Ľ�����ִ��ָ�����ַ������
 	1:Runtime����û�й��췽��(һ���������û�й��췽��.)˵��˽���˹��췽��.�п����������з������Ǿ�̬��.������һ��������.(���ñ�������
	�����������������.ֻ�ڱ����д���һ������,�����ṩһ����ȡ����.)����ʽ.
	*
	*
	*/
	public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime();	//��ȡ���������.
			//	rt.exec("shutdown -s -t 600");	//��ʾִ���ַ����ػ�����.���к�,���������10���Ӻ�ر�.
			rt.exec("shutdown -a");//��ʾȡ������Ĺر�����,(ע�ⵥ����,ֻ�ܴ���һ������,ÿ��ֻ����һ������ִ������)
	}

}
