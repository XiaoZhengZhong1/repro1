package com.HashSet;

import java.util.HashSet;

import com.xzz.bean_1.person;

public class HashSet172 {
/*###17.02_���Ͽ��(HashSet�洢�Զ������֤Ԫ��Ψһ��)
* A:������ʾ
	* �洢�Զ�����󣬲���֤Ԫ��Ψһ�ԡ�*/

	public static void main(String[] args) {
		HashSet<person> hs = new HashSet<>();
					hs.add(new person("Ф��",2));
					hs.add(new person("Ф��",2));
					hs.add(new person("Ф����",31));
					hs.add(new person("Ф����",31));
					hs.add(new person("��ϼ",24));
					System.out.println(hs);
	//[person [name=Ф��, age=2], person [name=��ϼ, age=24], person [name=Ф����, age=31]]
/*��Ϊperson������д��hashCode()����,��equals()����.�����вι��������Զ���������ķ���,���� ��ַ �� ��ֵ .ע��hashCode�Ǹ�����
����ַ���Ǵ洢��ַ��,API�жԸ�ַ�����˸��ӵ��㷨,������֤���������䲻ͬ�ĵ�ַҲ��ͬ,���õ���equals()�����Ƚ�.ֻ��������������ͬ��ַ
�Ż�һ��,����Ҫ����equals()����.API����д��equaks()����.Ҳ������ϸ���ж�.ֱ��Ait+shift+s+h,�������Զ����������ɷ���.*/	

					
/* ��дhashCode()��equals()����
 ###17.03_���Ͽ��(HashSet�洢�Զ������֤Ԫ��Ψһ��ͼ�⼰�����Ż�)
 * A:��ͼ��ʾ
 	* ��ͼ˵���ȽϹ���
 * B:�����Ż�
 	* Ϊ�˼��ٱȽϣ��Ż�hashCode()����д����
 	* ���հ�����Զ����ɼ��ɡ�

 ###17.04_���Ͽ��(HashSet��α�֤Ԫ��Ψһ�Ե�ԭ��)
 * 1.HashSetԭ��
 	* ����ʹ��Set���϶�����Ҫȥ���ظ�Ԫ�ص�, ����ڴ洢��ʱ�����equals()�Ƚ�, Ч�ʽϵ�,��ϣ�㷨�����ȥ�ظ���Ч��, ������ʹ��equals()�����Ĵ���
 	* ��HashSet����add()�����洢�����ʱ��, �ȵ��ö����hashCode()�����õ�һ����ϣֵ, Ȼ���ڼ����в����Ƿ��й�ϣֵ��ͬ�Ķ���
 		* ���û�й�ϣֵ��ͬ�Ķ����ֱ�Ӵ��뼯��
 		* ����й�ϣֵ��ͬ�Ķ���, �ͺ͹�ϣֵ��ͬ�Ķ����������equals()�Ƚ�,�ȽϽ��Ϊfalse�ʹ���, true�򲻴�
 
 * 
 * 
 * 2.���Զ�����Ķ������HashSetȥ�ظ�
 	* �Զ������б�����дhashCode()��equals()����
 	* hashCode(): ������ͬ�Ķ��󷵻�ֵ������ͬ, ���Բ�ͬ�ķ���ֵ������ͬ(���Ч��)
 	* equals(): ������ͬ����true, ���Բ�ͬ����false,����false��ʱ��洢*/	
					
					
					
					
	}

}
