package com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap181 {
	/*###18.01_���Ͽ��(Map���ϸ������ص�)
	* A:Map�ӿڸ���
		* �鿴API����֪����
			* ����ӳ�䵽ֵ�Ķ���
			* һ��ӳ�䲻�ܰ����ظ��ļ�
			* ÿ�������ֻ��ӳ�䵽һ��ֵ
	* B:Map�ӿں�Collection�ӿڵĲ�ͬ
		* Map��˫�е�,Collection�ǵ��е�
		* Map�ļ�Ψһ,Collection������ϵSet��Ψһ��
		* Map���ϵ����ݽṹֵ��Լ���Ч����ֵ�޹�;Collection���ϵ����ݽṹ�����Ԫ����Ч
		
	###18.02_���Ͽ��(Map���ϵĹ��ܸ���)
	* A:Map���ϵĹ��ܸ���
		* a:��ӹ���
			* V put(K key,V value):���Ԫ�ء�
				* ������ǵ�һ�δ洢����ֱ�Ӵ洢Ԫ�أ�����null
				* ��������ǵ�һ�δ��ڣ�����ֵ����ǰ��ֵ�滻����������ǰ��ֵ
		* b:ɾ������
			* void clear():�Ƴ����еļ�ֵ��Ԫ��
			* V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
		* c:�жϹ���
			* boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
			* boolean containsValue(Object value):�жϼ����Ƿ����ָ����ֵ
			* boolean isEmpty()���жϼ����Ƿ�Ϊ��
			*collcetion<> Map.values();		//��ȡ���е�ֵ.
		* e:���ȹ���
			* int size()�����ؼ����еļ�ֵ�Եĸ���
		
*/
	public static void main(String[] args) {
		Map<String, Integer> mp = new HashMap<>();	/*������������������������,����Map��˫�м���.��һ���������������Ǽ�
�ڶ�����������������ֵ,����ֵ.	 put(K key,V value):���Ԫ�ء�k�����,v����ֵ.һ�����������put���,	*/		
		
		Integer I1 = mp.put("Ф��",3);	//put��ӷ�����ʾ���ؽ����Integer���͵�.
		Integer I2 = mp.put("Ф��",2);
		Integer I3 = mp.put("Ф��",4);

//1:put();���,���ص��Ǳ����ǵ�ֵ,���û�м���ֵ,���صĶ���null,�������ͬ�ļ��ͻ���ֵ,����Ψһ,ֵ�ᱻ����.		
		mp.put("Ф����",31);
		mp.put("��ϼ",24);
		System.out.println(I1);	//null	֤����mp������û�����ֵʱ,��һ��������ǳ�ʼ��ֵ.
		System.out.println(I2);	//3		//��ȻI2��ӵ���2,���������ȷ���ϴε�I1��ֵ3,˵��������Ǳ����ǵ�ֵ.
		System.out.println(I3);	//2		
		System.out.println(mp);	/*{Ф����=31, ��ϼ=24, Ф��=4}	˵������Ψһ�Ĳ����ظ�,ֵ�ᱻ����ӵĸ���.������
		 							��ʾ Ф��=4 .���ں����Զ����ɵ�. ÿ�������ֻ��ӳ�䵽һ��ֵ				*/
//2:size();��ʾ���ĸ���,��ֵ�޹�.
		System.out.println(mp.size());	//3		��Ȼһ����ӵ�������Ԫ��,����ϵͳ��������һ������,

//3:remove()���ݼ�,ɾ������ֵ.
		Integer I4 = mp.remove("Ф����");	//remove������ʾ,���ؽ����Integer����.��ʾ���ݼ�ɾ����ֵ��Ԫ��
		System.out.println(I4);	//31
		System.out.println(mp);	//{��ϼ=24, Ф��=4}	���֤����Ȼֻɾ������ֵ,��Ҳû�����.

//4:�ж��Ƿ������.containsKey();
		
		boolean b = mp.containsKey("Ф����");		//��ʾ�жϼ������Ƿ���� ��
			System.out.println(b);		//false  ��Ϊ��ɾ����,û��û��,�Ͳ�����.

//5:values��ȡ���е�ֵ.
			System.out.println(mp.values());
	}
//��������һ���ᵽ put()��ӷ���, remove()ɾ������, containsKey()�Ƿ�����жϷ���.values()��ȡ����ֵ����,
}
