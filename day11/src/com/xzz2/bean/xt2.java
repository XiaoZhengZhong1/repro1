/*
* ������Ŀ
* ������
* ������

B:���ȥ��Ĭ��ע��?
	* window -- Preferences -- Java -- Code Style -- Code Templates
	* ѡ���㲻��Ҫ�����ݣ�ͨ���ұ�Edit�༭��
	* ע�⣺��ֻɾ��ע�Ͳ��֣�����ע�Ͳ��ֵĲ�Ҫɾ����
* C:�кŵ���ʾ������
	* ��ʾ���ڴ������������ߵĿհ������Ҽ� -- Show Line Numbers���ɡ�
	* ���أ�������Ķ�������һ�Ρ�
* D:�����С����ɫ
	* a:Java��������������С����ɫ��
		* window -- Preferences -- General -- Appearance -- Colors And Fonts --Java�޸� -- Java Edit Text Font
	* b:����̨
		* window -- Preferences -- General -- Appearance -- Colors And Fonts -- Debug -- Console font
	* c:�����ļ�
		* window -- Preferences -- General -- Appearance -- Colors And Fonts -- Basic -- Text Font
* E:�����Ū���ˣ���ô��?
	* window -- Reset Perspective
* F:����̨�Ҳ����ˣ���ô��?
	* Window--Show View��Console
* G:ȡ��������ʾ
	* window -- Preferences -- Java--Editor--Hovers���ұ߽�Combined Hover��ȥ����
	* ���������������Ͳ����Զ������ˡ�����뿴��ʾ������������ڴ����ϣ���F2���ɡ�
 
###11.05_Java��������(Eclipse�����ݸ�������ʹ��)(����)
* A:Alt+/ ����ʾ����
* B:main+alt+/,syso+alt+/,����������ʾ
* C:����������,ѡ����Ҫ����Ĳ���,alt+/ѡ�����һ���
* C:�����Լ���alt + /
	* windows--perference-Java-Editor-Templates--New

*/
package com.xzz2.bean;

public class xt2 {
	private String name;
	private int age;
	public xt2() {
		super();
		
	}
	public xt2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
