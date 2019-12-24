package com.reflect;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class L_02 {
	/*###27.04_����(Class.forName()��ȡ�����ļ�����)
	* ե֭��(Juicer)ե֭�İ���
	* �ֱ���ˮ��(Fruit)ƻ��(Apple)�㽶(Banana)����(Orange)ե֭(squeeze)*/
	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
/*3:���ÿ��ֻ���һ�ֹ�֭.��ô����,��̬ǰ�Ͷ�̬��,ÿ�ζ���Ҫ�޸����д���,������͵Ĺ�֭,�ص�����ȵ�.ÿ�ζ��ø�ԭ����̫�鷳.�Ϳ����÷���
����(Class.forName()��ȡ�����ļ�����)(������˼���Ǵ���һ�������ļ������ļ�,������ˮ������ͬһ��Ŀ�µ��ļ�.�ļ�����Ϊˮ���������ֽ���
�ļ�.����com.reflect.apple���������ļ��оʹ���ƻ������class�ֽ���.��Ϊ������һ����,��ȡ�������ַ������ֽ���͵��ڻ�ȡ����ƻ�����
�ֽ���,����뻻һ�ֹ�֭,�Ͱ�������ƻ���ĳɽ���,�㽶.....�ȸ�ԭ���뷽��*/


//3:ѧ�˷���֮��,�뻻��֭,�����޸�ԭ����,ֱ���޸ĺ�ˮ����class����һ���������ļ�,����.		
BufferedReader br = new BufferedReader(new FileReader("peizhi"));//��ʾ�����ַ�����������,�������ж�ȡ�����ļ�����
Class<?> class2 = Class.forName(br.readLine());//��Class��Ļ�ȡ��������.��ȡ��ȡ��������.����һ������.
	fruit f = (fruit) class2.newInstance();	//�������еĴ������󷽷�,����һ����������Object����ǿת��ˮ������
	juicer j3 = new juicer();	//�������ļ����ܻ�һ�ֹ�֭�������Ǳ���ʵ��ˮ���ӿ�.
		j3.run(f);
		br.close();
		
	
		//1:ûѧ��̬֮ǰ��д��,����̫����.		
		juicer j2 = new juicer();
		orange or = new orange();	
				j2.run(or);
		
		
		//2:ѧ�˶�̬��.һ�д�������3�д���.������ǿ.		
		juicer j = new juicer();
		j.run(new apple());
		j.run(new orange());	
		j.run(new banana());             
		
//2:ѧ�˶�̬֮��,���ǾͿ��԰����е�ˮ����ȡ��һ���ӿ�.Ȼ����ը������,run��������֮�䴫��ˮ������,��ʵ����ˮ���ӿڵ�����������run����
		//j.run(new apple());/*2:���˶�̬��.��ʾfruit f = new apple();��ʾ�ָ�������ָ���������.f�������е�ˮ��
		//	�������.ֱ�ӵ���ը��ե֭����,ե��������Ӧ�Ĺ�֭.(��̬----�ṩ����ĸ�����.�ó������չ�ԱȽ�ǿ.)*/
	}

}

interface fruit{	//ˮ���ӿ�
	public void squeeze();	//��֭����.
}

class apple implements fruit{//ƻ����		//2:���˶�̬��,��ʾƻ����ʵ����ˮ���ӿ�.��д�˹�֭����.
	public void squeeze(){//��եƻ��֭
		System.out.println("ե��һ��ƻ��֭");
	}
}
//�ȸ�ϰ�¶�̬.1:�Ȳ��ö�̬,��ե����,������ե֭run����,������ƻ��.���ӵ���дһ��run����,�����ǽ���.�㽶�ֵõ���дһ��run����.�����㽶
class orange{//������
	public void squeeze(){//��ը����֭
		System.out.println("ե��һ������֭");
	}
}
class banana implements fruit{//�㽶��
	public void squeeze(){//��ը�㽶֭
		System.out.println("ե��һ���㽶֭");
	}
}
class juicer{//ը����
	public void run(apple a){//ե֭����,ƻ�������.��ʾը����ƻ��֭.(ע��֮ǰ���˲����������������͵�,��ʵ����Ҫ����һ������)
		a.squeeze();	//��ʾ��ը��ե֭����.ե��һ��ƻ��֭.
	}
	public void run(orange o){
		o.squeeze();
	}
	public void run(banana b){
		b.squeeze();
	}		//������û��ѧϰ��̬֮ǰ��д��.ÿ��һ��ˮ��������дһ�η���(Ҳ�з�������),���븴����̫��

	public void run(fruit f){	//��ʾըˮ��.�������е�ˮ��.
		f.squeeze();			//����ըե֭ըˮ��.
	}
}
