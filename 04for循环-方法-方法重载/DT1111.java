/*
//ע��;��������ת�ͺ�����ǿת,ʹ��������еĳ�Ա����,�ڿ����к�����,�˽⼴��.�����ж���ֱ�Ӽ̳к���д,�ٰѸ��෽�����ɷ�������mathod(father a)
//mathod(father a)��ʾ������� a �߱������������Ժ���Ϊ,����������󶼿��Ե���ִ��,

*/
class DT1111 {
	public static void main(String[] args) {
		method(new cat());
		method(new dog());
	}
	public static void method(ainmal a){
		a.eat();
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