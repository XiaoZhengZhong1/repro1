package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import com.xzz.bean.person;


@SuppressWarnings({ "rawtypes", "unchecked" })

public class ArrayList162_contains {
/*###16.02_���Ͽ��(ȥ��ArrayList���ظ��Զ������Ԫ��)(����)
* A:������ʾ
	* ����ArrayListȥ���������Զ������Ԫ�ص��ظ�ֵ(����ĳ�Ա����ֵ��ͬ)
* B:ע������
	* ��дequals()������,��Ϊcontains��remove���ж��ǵײ㶼����equals*/
	
	public static void main(String[] args) {
		ArrayList A = new ArrayList();	//��������
			A.add(new person("Ф��",2));	//����Զ������Ͷ���.
			A.add(new person("Ф��",2));
			A.add(new person("xzz",31));
			A.add(new person("xzz",31));
			ArrayList A1 = get(A);	/*��ʾ��ȡһ������,�����еĲ�����A����,��ȡ�Ľ�������¼���A1,������A1���Ƿ��к�A��ͬ��
�Զ������,�оͲ����.�����¼����оͲ�������ظ���,��������get��,ctrl+1���Զ�����get����*/			
			System.out.print(A1);	//ֱ�����:[person [name=Ф��, age=2], person [name=xzz, age=31]]
			Iterator I2 = A1.iterator();
			while(I2.hasNext()){
				Object obj1 = I2.next();
				person p1= (person)obj1;
			System.out.print(p1.getName() + "," + p1.getAge() + ",");	//����get�������:Ф��,2,xzz,31,
			}
			
			
	}

	public static ArrayList get(ArrayList A) {
		ArrayList A1 = new ArrayList();	//���¼�һ���¼���,���������A1
		Iterator I = A.iterator();	//��ȡ������.
		while(I.hasNext()){			//��ʾ�����Ԫ�ؾͼ���.
			Object obj = I.next();	//����ÿ��Ԫ�ذ�˳��.
			if(!A1.contains(obj)){	/*ע��contains�ж��Ƿ����,�ײ�����equals����ʵ�ֵ�,���ж��Զ������ʱ,�Զ�������
������дequals����,������contains�жϽ��,���û����д�ж���Ч.�޷���ȥ�ظ��Զ������.��Ϊ�Զ�����������������,�жϵ���ֵ		*/		
				A1.add(obj);
		
				}
		}
		
		return A1;
	}
	
}
