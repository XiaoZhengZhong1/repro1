package com.HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;



public class next4 {

/*###18.14_���Ͽ��(ģ�⶷����ϴ�ƺͷ��Ʋ����ƽ�������Ĵ���ʵ��)
* A:������ʾ
	* ģ�⶷����ϴ�ƺͷ��Ʋ����ƽ�������Ĵ���ʵ��
* 1:��Ҫһ����,������Ҫ�����洢��������,���������3......J.Q.K.A.2.С��.����.������ɫ,��,÷,��,��.���ǲ���Ҫ������,��Ҫ����ɫ,
* ������ɫ��Ҫ���������һ��,ÿ�����ֶ����ĸ���ɫ,��С������,���Ե������.-------������������,һ��װ����.һ��װ��ɫ.
* ����һ������int index = 0 ��Ϊ������Ҫ��������˳�����Ƚ��ƵĴ�С,������濴��, ����forѭ������
* ��������,������concat()�ϲ�����.��ѭ��������,��ѭ������ɫ,ÿ��������������ɫ.�� �ϲ������ɫ3.��ɫ4......��ӵ�HashMap˫�м���
* ��ֵ����,��������index.��Ȼ���ǻ���Ҫ ��ȡ����,��Ϊ��Ҫ��Ӵ�С��,ȡ��ʱ������ҲҪ���򷽱㿴��.ֻ��ArrayList���⹦��,���а�����ѭ����
* ����index����ӵ�ArrayList��.
* 2:���С��,��index��HashMap.�ٰ�index���ArrayList��.��Ϊ����ʵ���Ǵ�ȡ�����,����С������������ӵ�2��Ӧ����������,����Ҳ��.
* 3:ϴ��,ϴ����.��Ϊֻ�������������,ֻ��ϴ����,������,������ʱ�Ż�����,Collections shuffle();���ϴ��.
* 4:����4��treeSet����.������.һ������.��ΪtreeSet���Ͽ����Զ�����.
* 5:������ѭ����.���ķ�.��forѭ����if��%3(����3),��Ϊ�κ�������3ֻ��3�����,0,1,2,���һ����else����
* 6:����Ҫ���Ĵ�.���Ե���д�Ŀ� �Ʒ���,��4���ֱ���÷���
* 
* */
	public static void main(String[] args) {
		String[] s = {"3","4","5","6","7","8","9","10","J","Q","K","A","2",};
		String[] s1 = {"����","÷��","����","����"};
			
			HashMap<Integer, String> hm = new HashMap<>();
			ArrayList<Integer> a = new ArrayList<>();
			
			int index = 0;		//��������,������ᴩ����ϴ��,����,�Ϳ���.
		
			for (String b : s) {
				for (String b1 : s1) {
					hm.put(index, b1.concat(b));	//��������,ֵ�Ǻϲ��������Ԫ����������ɫ.
						a.add(index);
						index++;
				
				}
			}
		
		hm.put(index, "С��");
		a.add(index);
		index++;	//��1��ʾ����ӵĴ�����С����.
		hm.put(index, "����");
		a.add(index);
	
		Collections.shuffle(a);			//���ϴ��.
	
		TreeSet<Integer> xiaolei = new TreeSet<>();
		TreeSet<Integer> xiaohai = new TreeSet<>();
		TreeSet<Integer> lixia = new TreeSet<>();
		TreeSet<Integer> dipai = new TreeSet<>();
	
		for (int i = 0; i < a.size(); i++) {
			if(i >= a.size()-3){
				dipai.add(a.get(i));		/*ע��if(){}else{};Ƕ��һ��Ҫ��else if{},Ƕ�׼��μӼ���,�������漸��Ƕ��
����	if(){}else if(){}else if{}else{};�ͼ�����,������ζ�����else,��ôֻ���������һ��else,ֻ�����������һ��if��Ч������if
,������������,Ҳ��ѭ��������µ�else����ȥ.Ҳ����˵�����ƽ���,����µ�else�������һ���˵���,��ʮ����.	*/
			}else if(i % 3 == 0){
				lixia.add(a.get(i));
			}else if(i % 3 == 1){
				xiaohai.add(a.get(i));
			}else{
				xiaolei.add(a.get(i));
			}
			
		}
		
		lookpai("Ф��",xiaolei,hm);
		lookpai("Ф��",xiaohai,hm);
		lookpai("��ϼ",lixia,hm);
		lookpai("����",dipai,hm);
	
	
	}
	
	public static void lookpai(String name,TreeSet<Integer> r,HashMap<Integer,String> hm){
		System.out.print(name + "������:");
		for (Integer index : r) {					
			System.out.print(hm.get(index) + " ");	//ͨ������ȡֵhm.put(index, b1.concat(b));
		}
		System.out.println();//����.
	}
}


