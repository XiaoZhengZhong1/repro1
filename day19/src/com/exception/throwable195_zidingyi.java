package com.exception;

public class throwable195_zidingyi {
	/*###19.11_�쳣(�Զ����쳣�����ͻ���ʹ��)
	* A:Ϊʲô��Ҫ�Զ����쳣  -----Ϊ�˶�������,����ʾ�������쳣����.
		* �������˵�����
	* B:�Զ����쳣����
		* �̳���Exception		//�̳б����쳣,�ͱ��봦��.
		* �̳���RuntimeException	//�̳������쳣���Ա���ʱ������,���к��ڴ���.
	* C:������ʾ
		* �Զ����쳣�Ļ���ʹ��*/

	public static void main(String[] args) {

	}

}
@SuppressWarnings("serial")
class  AgeOutofBoundsException extends Exception{	/*��ʾ�Զ�����һ�����䳬����Χ���쳣,��д�˿ղκ��вι���
													�Ժ�����������䳬���쳣�ľͿ����׳��Զ���������쳣��
*/

	public AgeOutofBoundsException() {
		super();
		
	}

	public AgeOutofBoundsException(String message) {
		super(message);
		
	}
	
}