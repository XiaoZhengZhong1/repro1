package com.exception;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class next {
/*###19.13_�쳣(��ϰ)
* ����¼��һ��int���͵�����,����������Ʊ�����ʽ
	 * ���¼�����������,������ʾ,¼�����������������¼��һ������BigInteger
	 * ���¼�����С��,������ʾ,¼�����С��,������¼��һ������
	 * ���¼����������ַ�,������ʾ,¼����ǷǷ��ַ�,������¼��һ������*/

//������ʾtry catch��Ƕ��try catch,�ų�����¼���쳣,��ܰ��ʾ�쳣ԭ��. Ctrl + shift + z (�Զ�����tryqiant)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
			
			
			while(true){		//��ΪҪ��һ�����,¼����˵�����¼��,����������ѭ��.¼��ɹ�������ѭ��.
				String line = sc.nextLine();
				sc.close();	//����¼��,ע������ʱ���ܽ���,����ֻ��¼��һ��.
				try{
				int num = Integer.parseInt(line);
				System.out.println(Integer.toBinaryString(num));/*��ʾ������¼���������ת����int,�ͽ�numת��
				toBinaryString(num)������(����ת�����Ʒ���,Integer���е�),�����.*/
				break;		//��ʾ�������¼��,����ת�����Ƴɹ�.������ѭ��
				}catch(Exception e){	//��ʾ�������try������,¼��ͽ���������.
					try{
						new BigInteger(line);	//��⿴�Ƿ���ת����һ�����������,�����,����ʾ¼����������,������¼��.
						System.out.println("¼����������,������¼��.");
					}catch(Exception e2){		//������������ԭ��,�ͽ�������.
						try{			
							new BigDecimal(line);	//�������,¼�������Ƿ���ת����һ��С��.�����,����ʾ.
						System.out.println("¼�����С��,������¼��һ������.");
						}catch(Exception e3){		//����Դ򶼲�����,�Ǿ���ʾ.
							System.out.println("¼��Ƿ��ַ�,������¼��");
						}
					}
					
					
				}
			}
	
	}

}
