/*
��̬�ĺô�:1:����˴����ά����(�̳б�֤) 2:����˴������չ��(��̬��֤) 3:���Ե�������,���������������method(ainmal z)��������,��������ָ��������������
��̬�Ļ���:����ʹ���������е����Ժ���Ϊ
aimal z = new cat()  ���д��뿪����һ���ǲ�����ôд��,������������ʾһ��method(ainmal z)��������
*/
class  DT1111{
	public static void main(String[] args) {
			method(new cat());//���д����aimal z = new cat();��һ����˼,���Ǹ�������ָ���������.new cat()��������������,��������Ҳ������������,���ն���
			method(new dog());//
	}
	public static void method(ainmal z){//�������������������ʱ���ö�̬���,��չ��ǿ
		z.eat();
	}

}
class ainmal{
	public void eat(){
		System.out.println("����Է�");
	}
}
class cat extends ainmal{
	public void eat(){
		System.out.println("è����");
	}
}
class dog extends ainmal{
	public void eat(){
		System.out.println("������");
	}
}
/*
è����
������
�밴���������. . .
*/