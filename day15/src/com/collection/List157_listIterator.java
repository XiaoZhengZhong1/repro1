package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
@SuppressWarnings({ "rawtypes", "unchecked" })
public class List157_listIterator {
	/*###15.11_���Ͽ��(�����޸��쳣������ԭ�򼰽������)
	* A:������ʾ
		* ��������һ�����ϣ����ʣ������ж�������û��"world"���Ԫ�أ�����У��Ҿ����һ��"javaee"Ԫ�أ���д����ʵ�֡�*/

public static void main(String[] args) {
			List L = new ArrayList();
			L.add("a");
			L.add("b");
			L.add("c");
			L.add("world");
			L.add("d");
//listIterator��������Listר�еĵ�����,�����ڵ���(����)��ͬʱ,�������������Ԫ�ض���,���Ǳ����ǵ������������ ��ӷ�����	S.add("javaee");	
		ListIterator  S = L.listIterator();//ע��һ��Ҫ��L���õ�����,��Ϊ��ӵ�ֵ����L��,��������List����,�˴��˷�1Сʱ
			while(S.hasNext()){
		String a = (String)S.next();//��ΪҪ�ж�S��,�Ƿ��к�"world"��ͬ���ַ���,����Ҫ�ѵ����Ķ���ǿת���ַ���,
				if("world".equals(a)){	
					S.add("javaee");	//������������� ��ӷ�����	S.add("javaee");	
///*###15.11_���Ͽ��(����ʱ���ϵ�����ӳ��ֲ����޸��쳣������ԭ�򼰽������),����취�����õ�����������ӷ���,������listIterator������					
				}
			}
			System.out.println(L);	//�����ж���ɺ��ӡ[a, b, c, world, javaee, d]
	}

}
/*###15.14_���Ͽ��(���ݽṹ֮���������)
* A:����
	* ��ѯ���޸�Ҳ��	//��Ϊ�����ǿ��������Ĵ洢�ռ�,�൱����һ������.��һ�������ѯ�޸��ǿ��
	* ��ɾ��			//��Ϊ����һ��,ɾ��һ������������ǰ�ͺ��ƶ�.
* B:����
	* ��ѯ��,�޸�Ҳ��	//��Ϊ�����൱��ÿ�����Ӷ���һ������,ֻ��¼���������Ӹ���,10��Ԫ�ض�����൱��10������,��10��������ҵ�Ȼ��.
	* ��ɾ��		//��Ϊÿ�����Ӷ��Ǹ���,����ֻ��Ҫ������λ�õ�,ǰ�����ӽӵ��Լ����ϾͿ���,��Ȼ��ɾ��.

###15.15_���Ͽ��(List������������ص�)
* A:List������������ص�
* 
		ArrayList:
			�ײ����ݽṹ�����飬��ѯ�죬��ɾ����
			�̲߳���ȫ��Ч�ʸߡ�
		Vector:
			�ײ����ݽṹ�����飬��ѯ�죬��ɾ����
			�̰߳�ȫ��Ч�ʵ͡�
		Vector���ArrayList��ѯ��(�̰߳�ȫ��)
		Vector���LinkedList��ɾ��(����ṹ)
		LinkedList:
			�ײ����ݽṹ��������ѯ������ɾ�졣
			�̲߳���ȫ��Ч�ʸߡ�

		Vector��ArrayList������
			Vector���̰߳�ȫ��,Ч�ʵ�
			ArrayList���̲߳���ȫ��,Ч�ʸ�
		��ͬ��:��������ʵ�ֵ�
		ArrayList��LinkedList������
			ArrayList�ײ���������,��ѯ���޸Ŀ�
			LinkedList�ײ�������ṹ��,����ɾ�ȽϿ�,��ѯ���޸ıȽ���
		��ͬ��:�����̲߳���ȫ��
* B:List���������ӣ����ǵ���ʹ��˭��?
		��ѯ����ArrayList
		��ɾ����LinkedList
		�������ArrayList*/




