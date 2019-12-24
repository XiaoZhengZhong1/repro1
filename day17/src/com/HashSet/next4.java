package com.HashSet;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import com.xzz.bean_1.student;

public class next4 {
	/*###17.19_���Ͽ��(����¼��ѧ����Ϣ�����ܷ����������ڿ���̨)
	* A:������ʾ
		* ���󣺼���¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ������������̨��
		*1:��Ҫ����һ����ʾ��,�����װ��,����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�,�����ܺ�. 
		*2:�ܺ��Ǹ����������ųɼ��������.�������вι������������͵Ĵ���,�����������,�������,�������ṩһ��������ȡ�͵�get����
		*3:��дtoString����.��ʽ���԰��Զ������,����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�,�ܺ�.
		*4:����һ�����д���scanner,��������ʾ,����������,���ĳɼ�,��ѧ�ɼ�.Ӣ���
		*5:����һ��TreeSet����,�ڲ����д�һ���Ƚ���new comparator(),��д�ȽϷ���compare();
		*6:while()ѭ���ж�¼�볤��.ֻ��Ҫ5��.<5
		*7:��Ϊ¼����������ͳɼ�,������ͬһ¼�뵽String s = sc.nextLine();
		*8:��ΪҪ�Ƚϵ��ǳɼ���int��,���ð�¼����ַ������п�,��ת��int��,�ڴ浽�����бȽ�.��һ����������ת.
		*9:��������.
		*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("������ѧ��:����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�");
				
			TreeSet<student> ts = new TreeSet<>(new Comparator<student>() {

				@Override
				public int compare(student s1, student s2) {
					int num = s2.getSum() - s1.getSum();	/*s2-s1���ص��Ǹ���,��������,���ܷ����ߵ���.(��Ϊs1��
					ÿ���½�����,s2���ϴα�����С��,ÿ������С�ļ��½���,�����Ӷ�.)*/
					return num == 0 ? 1 : num;
				}
			});
	
			while(ts.size() < 5){
				String s = sc.nextLine();
					
				String[] arr = s.split(",");		//��ʾ��¼������ݰ�","�и���ַ���.
				int chinese = Integer.parseInt(arr[1]);		//�ѳɼ�ת����int���ֲ���װ�Ӷ���.���ܴ浽����.
				int math = Integer.parseInt(arr[2]);
				int english = Integer.parseInt(arr[3]);
				
				ts.add(new student(arr[0],chinese,math,english));	//��ʾ���ÿ��ѧ������arr[0],�ͳɼ�.
			}
			sc.close();	//��������¼��.
			
			for (student sdt : ts) {	//��������.
				System.out.println(sdt);
			}
	
	}

}
