class next3 {
	public static void main(String[] args) {
		A q = new A();
			q.method();
	}
}
/*

###10.13_�������(�����ڲ���ĸ�ʽ�����)
* A:�����ڲ���
	* �����ڲ���ļ�д����
* B:ǰ�᣺����һ������߽ӿ�
	* �����������Ǿ�����Ҳ�����ǳ����ࡣ
* C:��ʽ��
* 
		new �������߽ӿ���(){
			��д����(){}
		
		};		//����new�����Ǽ̳е��Ӷ���,��������ķ�����������,������,����������,�ڶ�������������Ҫ����;�ֺ�,��ʾ��������������
* D:������ʲô��?
	* ��һ���̳��˸������ʵ���˸ýӿڵ�������������
*/
abstract class father{	//������
	public abstract void eat();
}
class A {
	class B extends father{
		public void eat(){}
		public void method(){
		new father(){
			public void eat(){
				System.out.println("��");
			}
		}.eat();
	
		}
	}
}