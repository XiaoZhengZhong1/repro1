class Interface�ӿ�2 {
	public static void main(String[] args) {
		son a = new son();
			a.print();
		System.out.println(father.n);//������������,˵�� n ���˾�̬ static  ���ֵû�б�����n=20�ı�,˵������final  ���нӿڶ��ǹ�����,������public
	}
}
/*
1:�ӿڵĳ�Ա�ص�?
	��Ա����,ֻ���ǳ���.�����Ǿ�̬��,������.
		Ĭ�ϸ�ʽ:public static final------��˼�ǹ��������ճ���.�����ֶ�����.---Ĭ�Ͼ��Ǽ�ʹ��ûдϵͳҲ���ԼӼ���ȥ,���ڴ�������ʾ����,�����ؼ��ֿ��Ի�λ��

	���췽��?
		�ӿ�û�й��췽��.
	��Ա����?
		ֻ���ǳ��󷽷�,Ĭ�ϸ�ʽ:public abstract    �����ֶ�����.    
�ܽ�:�ӿ������е�,��Ա����,��Ա����,���ǹ�����.ϵͳ����Ĭ�ϼ���public �� statis �� final �� abstract ��Щ�ؼ���
*/
interface father{
         int n = 10;					//���к����д�����һ����˼,����ǰ���public static final��ϵͳĬ�ϼ��ϵ�,û����ʾ����
	//public static final int n = 10;	//public static final�������ؼ��ֶ������γ�Ա������,���Ի���λ��,���ᱨ��
	//public father(){}//���б���,��Ϊ�ӿ���û�й��췽��
//	void print();//����û����,˵�����ǳ�����ķ���,��Ϊ��û�д�����,ϵͳĬ����ǰ�����public abstract 
	public abstract void print();//���д�������д�����һ����,�����Ǽ�д��,
}
class son implements father{
	public void print(){
		int n = 20;
		System.out.println(n);
	}
	
}
/*
20
10
�밴���������. . .
*/
