package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import com.xzz.bean.person;

public class ���� {
/*###16.06_���Ͽ��(���͸����ͻ���ʹ��)(����)
* A:���͸���
* B:���ͺô�
	* ��߰�ȫ��(�������ڵĴ���ת����������) ������ǰû�ӷ��ͱ��벻�ᱨ�������лᱨ��,����֮��������,����ͻᱨ��.
	* ʡȥǿת���鷳
* C:���ͻ���ʹ��
	* <>�зŵı����������������� 
* D:����ʹ��ע������
	* ǰ��ķ��ͱ���һ��,���ߺ���ķ��Ϳ���ʡ�Բ�д(1.7�����������η���)  
	��������ò��ö����Object,û������.��Ϊ���е��඼��Object���������.���ڶ�������е���.
E:1:��������class<>�з��ͺ����з���public<>�еķ��������һ�µ�,�����һ��,�����е�������Ҫ���¶���,�����в���Ҳ����ͷ�������һ��.
2:������,��̬�������붨�����Լ��ķ���static<>��Ϊ��̬��������ļ��ض����ڵ�,������û��������֮ǰ����static��,��class<>����,��Ҫ����
������и�ֵ,���о�̬static<>Ҫ�����Լ��ķ���.
*/
	public static void main(String[] args) {
		LinkedList<person> b = new LinkedList<person>();	//��ʾ��������ӵ���person�����.
						b.add(new person("Ф��",2));
						b.add(new person("xzz",31));
					Iterator<person> I = b.iterator();		//��ʾ��������Ҳ��person�����.
							while(I.hasNext()){
								// ʡȥǿת���鷳
								person p =I.next();	//��I����next()����ʱ,����ֵ������ʾperson,��Ϊ�������еķ���
							//��ʾ��p��¼ÿ�������ļ��϶���
							System.out.print(p.getName() + "..." + p.getAge() + ",");
							//Ф��...2,xzz...31,
							//ע�ⲻ����I next.getName()��Ϊ����һ������Ʒ,��һ��,��һ��.���������һ�������͵ڶ�������
							}
/*##16.07_���Ͽ��(ArrayList�洢�ַ������Զ�����󲢱������Ͱ�)(����)
* A:������ʾ
	* ArrayList�洢�ַ������������Ͱ�*/
		System.out.println();   //����
	ArrayList<String> A = new ArrayList<>();//ǰ��ķ��ͱ���һ��,���ߺ���ķ��Ϳ���ʡ�Բ�д(1.7�����������η���)  
						A.add("a");
						A.add("b");
						A.add("c");
					Iterator<String> I2 = A.iterator();
							while(I2.hasNext()){
								System.out.println(I2.next());
							}
	
	
	
	}

}
