/*(��������
###06.11_�������(��������ʽ������������ʱ����ε���)(����)
* A:�����Ĳ���������public void print(Student s){}//print(new Student());
	* ����㿴����һ����������ʽ������һ��������(��������)��������ʵ��Ҫ���Ǹ���Ķ���
*///ע��.����������д����,��Ҫ�Ӿ�̬,static,
class  yingyong {
	public static void main(String[] args) {
		jiaju c = new jiaju();
			print(c);//�������c,������b,��һ����˼
		
	}
	public static void print(jiaju b){//(jiaju b)������������,���������е�,������.�������ͱ����ȸ�ֵ����ʹ��,��������û��ϵͳĬ��ֵ,
		b.name = "x����";			  //������Ҫnew,��ʵ����һ�������,�¼���new����,������b.��Ϊ��ͬ�������ֵ�ǲ��ܷ��ʵ�,����new�ĵ�ַ���ظ�c,������b
		b.colour = "��ɫ";			 //������һ����,��Ϊ����ͬһ���еĶ���.����ֻ��һ��new�洢,
	System.out.println(b.name + " " + b.colour);	
		b.zhedie();
	}
}
class jiaju {
	String name;
	String colour;
	public void zhedie() {
		System.out.println("����һ������۵�������");
	}
/*������:
x���� ��ɫ
����һ������۵�������
�밴���������. . .
*/
}