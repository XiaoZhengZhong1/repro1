class Abstract_1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
������ĳ�Ա�ص�:
	1:��Ա����:�ȿ��Զ���ɱ���,Ҳ���Զ���ɳ���.
	2:�й��췽����:��------����������ʸ���ĳ�ʼ��ֵ.
	3:��Ա�����ȿ����ǳ����,Ҳ�����Ƿǳ����.
������ĳ�Ա�������ص�:
	1:���󷽷�,ǿ��Ҫ��������������.ֻ����д.
	2:�ǳ��󷽷�,����̳е�����.��ߴ��븴����


*/
abstract class forest{
	int num = 10;	//����
	final int a = 20;	//��final���ι��ı���,���ɳ���,���ձ���,�����ǳ�����
	public forest(){}	//�ղι���
	public void play(){}	//�������еķǳ���
	public abstract void live();	//�������еĳ��󷽷�(ע��;���󷽷�û�д�����,ֱ�ӷֺŽ���)
}
class pine extends forest{			//���б���,��Ϊ�̳г�����,Ҫô����Ĵӳ�����.Ҫô������󷽷�
	public void live(){}			//��д�˳��󷽷�,����ͨ��
}