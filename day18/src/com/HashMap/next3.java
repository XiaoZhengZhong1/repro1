package com.HashMap;

import java.util.HashMap;

import com.student.student2;

public class next3 {
/*###18.09_���Ͽ��(����Ƕ��֮HashMapǶ��HashMap)
* A:������ʾ
	* ����Ƕ��֮HashMapǶ��HashMap
	* 0:�ȵö�����������,��Ӽ�student2,��ֵString(���Ĺ�����);
	* 1:�⼯�ϼ����꼶,ֵ���꼶������.
	* 2:�ڼ��Ͼ���student,ֵ�Ǿ�����꼶.
	* */
	
	public static void main(String[] args){
		HashMap<student2, String> hm1 = new HashMap<>();	//�����ڼ���student����
			hm1.put(new student2("��ϼ", 24), "�����");
		HashMap<student2, String> hm2 = new HashMap<>();
			hm2.put(new student2("Ф����",31 ), "ʩ�");
		
//�����ѧ��Ƕ�׽��꼶����ȥ.���涨������꼶����hm,����ļ���Ƕ�������ѧ������.	
		HashMap<HashMap<student2,String>,String> hm = new HashMap<>();	/*�����⼯���꼶����.�꼶���ϵļ������е�
		student2,ֵ���꼶�ĸ���.�������涨���student����,�����꼶������.*/
		hm.put(hm1, "���꼶");
		hm.put(hm2, "���꼶");
//��forѭ��Ƕ��,�������ļ���Ƕ��.	
			int index = 0;
		for (HashMap<student2,String> h : hm.keySet() ) {/* ��ʾ���;������Ե�ѧ������,������h,�������ƾ������м�.
	hm.keySet()�����꼶�����еļ�,��ѭ��������Ҫ�ҳ�����ѧ����Ӧ���꼶*/
			String value = hm.get(h);	//h�������е�ѧ��.��hm�꼶���û�ȡ����.��ʾ��ȡ����ѧ����Ӧ���꼶.
				index++;
			for (student2 key :h.keySet()) {	/*��ѭ����ѭ��ѧ��,��ȡ����ѧ����ֵ,ѧ������������ı���װ��student2������,ֵ
		����ѧ����������,���͵�ȻҲ��ѧ����,������������ѧ��,���ƾ���ѧ���еļ�,��ѭ������Ҫ�ҵ���ֵ,������*/
					String value2 = h.get(key);	//��ȡ����ѧ���Ĺ�����.
			
					System.out.print(key + "=" + value2 + "=" + value + ",");//ע��һ��Ҫ��ѭ���������,ѭ��������û����
			//student [name=Ф����, age=31]=ʩ�=���꼶,student [name=��ϼ, age=24]=�����=���꼶,
			index++;
			System.out.println(index);
			}
		
	}
	
	}
}
