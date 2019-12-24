package com.HashMap;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Set;

public class keySet182_getKey {
	/*###18.03_���Ͽ��(Map���ϵı���֮����ֵ)
	* A:����ֵ˼·��
		* ��ȡ���м��ļ���
		* �������ļ��ϣ���ȡ��ÿһ����
		* ���ݼ���ֵ
	* B:������ʾ
		* Map���ϵı���֮����ֵ	Map˫�м��Ͻӿ�����û��Iterator����������.
		*
		* * d:��ȡ����
			* Set<Map.Entry<K,V>> entrySet():
			* V get(Object key):���ݼ���ȡֵ
			* Set<K> keySet():��ȡ���������м��ļ���
			* Collection<V> values():��ȡ����������ֵ�ļ���
		* */
	public static void main(String[] args) {
		Map<String, Integer> mp = new HashMap<>();
				mp.put("Ф��", 2);
				mp.put("��ϼ", 24);
				mp.put("Ф����",31);
/*������Ҫ����,����Map�ӿڼ�����û�е�������,HashMap��ʵ����Map�ӿ�,����Ҳû�е�������.����Ҫ��HashMap����keySet():��ȡ������
	���м��ļ�,API����ʾ���ص���Set<K>�ӿڵĶ���,Set�ӿ�����Iterator��������.�����÷��������ȡ���õ���*/
	
//:Map˫�м��ϱ���-----keySet()����-----Iterator����������.	
				//���½����ķ�����:keyget(); get(Key)
				Set<String> S = mp.keySet();	//���÷���,��ȡ���������м��ļ���,����ֵ��S����.
				Iterator<String> I = S.iterator();	//��S���ϻ�ȡ������.���Ѽ��ϸ�ֵ��������I��.
					while(I.hasNext()){				//�������м����Ƿ���Ԫ��.
						String key = I.next();		//��ȡ�������е�ÿһ����. ��ֵ��key,��Ϊ����洢��ֻ�м�.
						Integer V = mp.get(key);	//��ȡ���еļ�ӳ���ֵ,����ֵ��V.
					System.out.print(key + "=" + V + " ");	//������еļ���ֵ.
					//Ф����=31 ��ϼ=24 Ф��=2 
					}
					System.out.println();//��ʾ����
//��ʽ1:keySet()��ǿforѭ������.					
					for (String k : mp.keySet()) {//mp.keySet();�ǻ�ȡ���м�,û�и�ֵ����������������,k��ʾ���еļ�
						System.out.print(k + "=" + mp.get(k) + ",");
					//Ф����=31,��ϼ=24,Ф��=2,
					}
			System.out.println();		
/*###18.04_���Ͽ��(Map���ϵı���֮��ֵ�Զ����Ҽ���ֵ)
* A:��ֵ�Զ����Ҽ���ֵ˼·��
	* ��ȡ���м�ֵ�Զ���ļ���
	* ������ֵ�Զ���ļ��ϣ���ȡ��ÿһ����ֵ�Զ���
	* ���ݼ�ֵ�Զ����Ҽ���ֵ
* B:������ʾ
	* Map���ϵı���֮��ֵ�Զ����Ҽ���ֵ*/

/*Map˫�м��ϱ���֮��ֵ�Զ����Ҽ���ֵ-----��ν��ֵ����һ���ӿڷ���,�Ѽ����е����м���ֵ�������󷵻�,���ص�ֵ�����еķ���������ӿڷ���
 * Set<Entry<String,Integer>>,��Ϊ���еļ���ֵ��������һ��������,�Ǿ����������ӿڷ���,�������ӿڷ�������������������,����ӿڷ���
 * EntrySet()��Map�ӿ��еĽӿ�Map.EntrySet().----��Ϊ��Map�ӿ��еĽӿ�,�൱������ӿ��е��ڽӿ�,����ʱҪͨ��Map.�ⲿ�ӿ�
 * ����������ڽӿ�entry,���и�ʽ����Map.Entry(),Map������entry()������,mp���Ե���,���÷��صĵļ�ֵ�Զ���дȫMap.Entry()
 * ���������ʡȥMap.������import java.util.Map.Entry;*/
				
		
			Set<Map.Entry<String,Integer>>	mn = mp.entrySet();	//���ü�ֵ�Է���,����һ����ֵ�Զ���mn.
			//��ΪSet<>��������д��Iterator����������,��������� mn ���Ե��õ���.			
//Map˫�м��ϱ���------Entry()����.-------Iterator����������
		Iterator<Map.Entry<String, Integer>> I1 = mn.iterator();	//�ü�ֵ�Ķ���,��ȡ������.�Ѷ���ֵ������I1
					while (I1.hasNext()) {	//�������ж����Ƿ�Ϊ��.
						Map.Entry<String, Integer> me = I1.next();	//�����е�������,��ֵ��me.
						String S1 = me.getKey();	//��ȡme�еļ�.
						Integer IT = me.getValue();	//��ȡme�е�ֵ.
					System.out.print(S1 + "=" + IT + ",");
					//Ф����=31,��ϼ=24,Ф��=2,
					}

					System.out.println();

					
					
					
					
//2:entry();����.��ǿforѭ��.
			for (Map.Entry<String, Integer> me2 : mp.entrySet()) {/*��ʾ������������ֵ��,������me�������м���ֵ.
			��ֵ�Է����ķ���ֵ����,ֻ������,ֻ������������ı���me2���ܴ������м���ֵ.ע��Map.Entry<>�ǽӿ�,�ӿڵķ������붼��
			�����,����ķ����ǲ��ܱ�ʵ������,������������ܱ�����,˵��entryʵ���˸ýӿ�.����ʵ��������*/
				System.out.print(me2.getKey() + "=" + me2.getValue() + ",");  /*��ʾ��ȡ�����еļ���ֵgetKey()
				getValue()����entry�еķ���.me2�������,���Ե����䷽��.*/
			}
			//Ф����=31,��ϼ=24,Ф��=2,
//����֪ʶ��:Map.Entry�ӿ�Map�ӿ��еĽӿ�. entry()��ֵ�Է���,�Ѽ���ֵ��ɶ���.�ӿ��� getKey()��ȡ������. getValue()��ȡֵ����
			
	}

}
