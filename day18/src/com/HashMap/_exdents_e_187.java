package com.HashMap;


import java.util.ArrayList;

import com.student.BaseStudent;
import com.student.student2;

/*###18.15_���Ͽ��(���͹̶��±߽�)(�˽�����)
* 1:���͹̶��±߽�.
* ? super E  ��������TreeSet(Comparator<? super E> comparator) ,���кܶ�������Ҳ��д���������.������˼��,�����ȡ��
* �Ƚ���,���Ϸ������м̳й�ϵ����������,Ҳ���Ե�������Ƚ������бȽ�,���õ��������Ƚ���.


* 2:���͹̶��ϱ߽�.
* ? extends E  ��˼������new������ķ����Ǹ���.����new�ļ�����ķ��������淺�͵�����,���Ϸ����ǹ̶���,�·��ͼ̳��Ϸ���.�º���Ҫ�м̳�
* �ǳ�����addAll(Collection<? extends E> c) �����е�,ArrayList����.
	�ܽ�:���͹̶��ϱ߽�,��Ҫ�������,����������,���������Ǽ̳й�ϵ��,���԰Ѽ�����ӵ���һ������.
* 
* 
* 
* */
public class _exdents_e_187 {
	public static void main(String[] args){
		ArrayList<student2> a = new ArrayList<>();
				a.add(new student2("Ф��",2));
		ArrayList<BaseStudent> a2 =new ArrayList<>();
				a2.add(new BaseStudent("��ϼ",24));	
					a.addAll(a2);
					
	}
}
