package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import com.xzz.bean.person;


public class jdk_1_5 {
	/*###16.13_���Ͽ��(��ǿfor�ĸ�����ʹ��)(����)
	* A:��ǿfor����
		* �������Collection���ϵı���
	* B:��ʽ��
	* 
			for(Ԫ���������� ���� : �������Collection����) {
				ʹ�ñ������ɣ��ñ�������Ԫ��
			}
	* C:������ʾ
		* ���飬���ϴ洢Ԫ������ǿfor����
	* D:�ô�
		* �򻯱���
		* ��ǿforѭ���ײ���������Iterator������.
		* 
		* */
	public static void main(String[] args) {
		int[] a = {11,22,33,44,55};
			for(int i:a){		//fore----Alt+/----���Զ�������ǿforѭ����ʽ.----i ��ʾ��ÿ��Ԫ��.
				System.out.println(i + ",");	//11,22,33,44,55,
			}
			ArrayList<person> A2 = new ArrayList<>(); 
			A2.add(new person("Ф��",2));
			A2.add(new person("Ф��",2));
			A2.add(new person("Ф��",2));
			for (person person : A2) {		//��ʾperson�����¼����ÿ���Զ������.
				System.out.println(person);
			}
		
				ArrayList<String> A = new ArrayList<>();
					A.add("a");
					A.add("b");
					A.add("c");
					A.add("d");
					for (String string : A) {		//string��ʾ��ÿ���ַ���.
					System.out.println(string);
				}
/*###16.15_���Ͽ��(���ֵ������ܷ�ɾ��)(����)
*1:��ͨforѭ��,����ɾ��,��������Ҫ--
*2:������,����ɾ��,���Ǳ���ʹ�õ����������remove����,�������ֲ����޸��쳣
*3:��ǿforѭ������ɾ��			}*/
//1:����������a������ʾ,��ͨforѭ��,ɾ��Ԫ��.		
			for (int i = 0; i < A.size(); i++) {
				if("c".equals(A.get(i))){	//��ʾ���"c"��A�����л�ȡ��ѭ��Ԫ��ֵ����ͬ�ľͼ���
					A.remove(i--);	/*��ʾi��Ԫ��ֵ��ɾ��,i�������Լ�.��ΪArrayList��������ʵ�ֵ�,���Ӻ�ɾ������������ǰ����
����ƶ�,������ظ���Ԫ���ƶ���i������ȥ��,i��ѭ����++,�ͻ�©ɾ.����Ҫi--����ȥ�Ѹո�ɾ��������ֵ��ѭ���Ƚ�һ��.	*/			
				}
			}
				System.out.println(A);//[a, b, d]
//2:�õ�����Iteratorɾ��.					
				Iterator<String> I2 = A.iterator();
					while(I2.hasNext()){
						if("b".equals(I2.next())){
							//A.remove(I2.next());���л���ֲ����޸��쳣,�����ڵ������ü��ϵ������Ӻ�ɾ���ķ���
							I2.remove();/*remove()�ǵ�����Iterator�еķ���,�Ǻ�hasNext(),next(),remove()һ��
���ʹ��,remover()��ɾ�������е����һ��,Ҳ���ǵ�ǰ�����Ķ���,�������������Ķ���.	*/					
						}
					}
					System.out.println(A);//[a, d]
//3:��ǿforѭ������ɾ��						
		for (String string : A) {
			if("a".equals(string)){
			//	A.remove(string); ����ֲ����޸��쳣.��Ϊ��û�е�����.���ò��˵�������remove()����
			}
		}			
/*#16.16_���Ͽ��(��̬����ĸ�����ʹ��)(����)
* A:��̬�������:��jdk1.5��������Ψһ��һ���ܱ�.��ʵ��.
* B:��ʽ��
	* import static ������.����.������;
	* ����ֱ�ӵ��뵽�����ļ���
* C:ע������
	* ���������Ǿ�̬��,����ж��ͬ���ľ�̬���������ײ�֪��ʹ��˭?���ʱ��Ҫʹ�ã������ǰ׺���ɴ˿ɼ������岻������һ�㲻�ã�����Ҫ�ܿ�����*/
/*��̬�����ʽ��ʾ:
 * û�Ӿ�̬:import java.util.ArrayList;
 * ���˾�̬:import static java.util.Arrays.sort;	//��ʾ���뾲̬Arrays���е�sort����ķ���.���sort��λ���� * �������з���
 * �����˾�̬��,�����п���ʡ������Arrays
 * */

					
				
/*#16.17_���Ͽ��(�ɱ�����ĸ�����ʹ��)(����)
* A:�ɱ��������
	* ���巽����ʱ��֪���ö�����ٸ�����
* B:��ʽ
	* ���η� ����ֵ���� ������(�������͡�  ������){}
* C:ע�����
	* ����ı�����ʵ��һ������
	* ���һ�������пɱ�����������ж����������ô���ɱ�����϶������һ��*/
	int[] c = {56,66,77,88,99};
		print(c);
		print1(1,2,3,4,5,6,7,8,9);
	}
	public static void print(int[] c){	//���ǲ��ɱ���������.
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
	public static void print1(int ... c){	/*���ǿɱ���������.Ҳ���൱��һ����������� ...�����������[],���������
											���Դ����ȿɱ�Ĳ���,�ڵ��õ�ʱ�򴫵�.														*/
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
//����ѧ��jdk1.5����������,1һ����ǿforѭ��,2һ����̬����.3�ɱ����------��ǰ����һ���Զ�װ��.
}





