package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList161 {
	/*###16.01_���Ͽ��(ȥ��ArrayList���ظ��ַ���Ԫ�ط�ʽ)(����)
	* A:������ʾ
		* ����ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
		* ˼·�������¼��Ϸ�ʽ*/
/*1:������Ŀ��Ҫ���ϼ���.
 * 2:дһ����ȡԪ�صķ���.�����¼�һ���ռ���,����(����)�ϼ���,���ж��¼������Ƿ�����ϼ���Ԫ��,�����������.��󷵻����������.
 * 3:������������ʾ,�´�������=��ȡԪ�ط����еĻ�ȡԪ��.������ֵ.
 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList A = new ArrayList();//��Ŀ��Ҫ�ϼ���
				A.add("a");
				A.add("a");
				A.add("b");
				A.add("b");
				A.add("c");
				A.add("c");
				A.add("d");
				A.add("d");
			ArrayList A1 = get(A);	//��ʾ�¼��Ͼ��Ƿ����з��ؽ��,Ҳ���ǵ��÷���.
			System.out.println(A1);
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList get(ArrayList A){
		ArrayList A1 = new ArrayList();	//��ȥ�ظ���Ҫ���¼���.
		Iterator I = A.iterator();		//��ȡ������,�ϼ�������Ԫ�����������ϼ��ϵ���	
		while(I.hasNext()){				//��ʾ�����Ԫ�ؾͼ����������
			 Object O = I.next();		//������һ��Ԫ��,��0������ʼ.����ÿ��Ԫ�ظ�ֵ��O
			 if(!A1.contains(O)){		//�ж��¼������Ƿ�������������ϼ��ϵ�Ԫ��,�������ͼ���ִ��.
				 A1.add(O);				//�������������Ԫ����ӵ��¼�����.
			 }
		}
		return A1;
		}
}
