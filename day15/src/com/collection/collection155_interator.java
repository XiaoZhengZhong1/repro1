package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collection155_interator {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
/*###15.06_���Ͽ��(���ϵı���֮����������)
* A:����������
	* �����������洢Ԫ��,�洢��Ԫ����Ҫ�鿴,��ô����Ҫ����(����) 
* B:������ʾ
	* ��������ʹ��*/
				
			Collection  c = new ArrayList();
			/*		c.add("a");
					c.add("b");
					c.add("c");
					c.add("d");
					
			Iterator it = c.iterator();		//��ȡ������������
				while(it.hasNext()) {		hasNext()��iterator�������еķ���ǰһ�����жϵ��������Ƿ���
Ԫ��,�оͷ���true,����whileѭ���б�ʾ�о�ִ�������,next()Ҳ��iterator�������еķ���,�Ƿ��ص������е���һ��Ԫ��,��0������ʼ					
					System.out.println(it.next());
					}*/
				c.add(new xt2("�ڸ�",2));
				c.add(new xt2("����",2));
				c.add(new xt2("־ǿ",2));
				Iterator it1 = c.iterator();	
				while(it1.hasNext()){//��whileѭ��������forѭ������Ϊ,while�ĳ�ʼ��������������,ѭ��������Ȼ������
					xt2 x = (xt2)it1.next();//����ת��
				System.out.println(x.getName() + "------" + x.getAge());
				}
					
/*##15.08_���Ͽ��(��������ԭ��Դ�����)(�˽�)
* A:������ԭ��
	* ������ԭ��:�������ǶԼ��Ͻ��б���,��ÿһ�������ڲ��Ĵ洢�ṹ���ǲ�ͬ��,����ÿһ�����ϴ��ȡ���ǲ�һ��,
	* ��ô����Ҫ��ÿһ�����ж���hasNext()��next()����,�������ǿ��Ե�,���ǻ�������������ϵ����ӷ��,�������ǽ������ķ������ϳ�ȡ���ӿ�,
	* Ȼ����ÿ������ڲ�,�����Լ�������ʽ,�������ĺô��ж�,��һ�涨������������ϵ�ı�����ʽ����hasNext()��next()����,�ڶ�,
	* �����еײ��ڲ�ʵ��,ʹ���߲��ù���ôʵ�ֵ�,���ü��� 
* B:������Դ�����
	* 1,��eclipse��ctrl + shift + t�ҵ�ArrayList��
	* 2,ctrl+o����iterator()����
	* 3,�鿴����ֵ������new Itr(),˵��Itr�����ʵ��Iterator�ӿ�
	* 4,����Itr����ڲ���,������д��Iterator�е����г��󷽷� 
*/
	
	
	
	
	
	
	}

}
