package com.exception;
/*###19.09_�쳣(finally�ؼ��ֵ��ص㼰����)
* A:finally���ص�
	* ��finally���Ƶ������һ����ִ��
	* �����������ִ�е�finally֮ǰjvm�˳���(����System.exit(0))
* B:finally������
	* �����ͷ���Դ����IO�����������ݿ�����л����
* C:������ʾ
	* finally�ؼ��ֵ��ص㼰����*/
public class finally194 {
	public static void main(String[] args){
	try{
		System.out.println(10/0);
	}catch (Exception e) {
		System.out.println("����Ϊ0��");
		return;
	}finally{	//�����ͷ���Դ,�Ǳ���һ����ִ�е�.���ǹر�jvm�����Syetem.exit(0);
		System.out.println("����һ����ִ�е�");
	}
	}
}
/*###19.10_�쳣(finally�ؼ��ֵ�������)
* A:������1final finally finalize������.
	* final,��������,�಻�ܱ��̳�.�����γ�Ա����,��Ա������ɳ���,ֻ�ܸ�ֵһ��.�����γ�Ա����,�������ܱ���д.
	* finally���ܵ���ʹ��,ֻ�ܺ�try���ʹ��,�����ͷ���Դ,IO��,���ݿ�.
	* finalize����������,
* B:������2
	* ���catch������return��䣬����finally�Ĵ��뻹��ִ����?����ᣬ��������returnǰ����return��*/
		//��:��ִ��.��return��ִ��.ע��finally�����ǲ��ܼ�return����,





