/*(��������ĸ�����Ӧ��
##06.12_�������(��������ĸ�����Ӧ��)(����)
* A:ʲô����������
	* û�����ֵĶ��� 
* B:��������Ӧ�ó���
	* a:���÷���������ֻ����һ�ε�ʱ��
		* ��ô����������������ʲô�ô���?
			* ��ʡ���� 
		* ע�⣺���ö�ε�ʱ�򣬲��ʺϡ��������������Ͼ������������Ա��������������ա�*/
class  liming{
	public static void main(String[] args) {
		diannao daier = new diannao();//�����ж���daier
			daier.name = "����";
			daier.zhongliang = 2;
		System.out.println( "Ʒ��" + daier.name + " " + "������λkg:" + daier.zhongliang);
			daier.shangwang();
		new diannao().shangwang();//new diannao()�����һ��û�и�ֵ�������������.���÷���������ֻ����һ�ε�ʱ��,��ʡ����,��ε��þͲ�����,��Ϊÿ�ε��þ�
								  //�����¼�һ���洢��ַ,�˷�,�������������Ϊʵ�ʲ�������
	}
}
class diannao{
	String name;
	int zhongliang;
public void shangwang(){
	System.out.println("����������");
	}
/*����������:
Ʒ�ƴ��� ������λkg:2
����������
����������
*/

}