package com.Thread2;

public class D09_Z_shipeiqi {
	/*###25.19_���ģʽ(���������ģʽ)(����)
	* a.ʲô��������
		* ��ʹ�ü�������ʱ��, ��Ҫ����һ�����¼��������ӿ�.
		* ͨ���ӿ����ж������, �������в�һ�����еĶ��õ�, ���ֱ�����д, ��ܷ���.
		* ������������Щ����, ���Ƕ��������ʱֻҪ�̳�������, Ȼ����д��Ҫ�ķ�������.
	* b.������ԭ��
		* ����������һ����, ʵ���˼������ӿ�, ���г��󷽷�����д��, ���Ƿ���ȫ�ǿյ�.
		* ����������Ҫ����ɳ����,��Ϊ�����������,���ÿշ�����û�������
		* Ŀ�ľ���Ϊ�˼򻯳���Ա�Ĳ���, ���������ʱ�̳�������, ֻ��д��Ҫ�ķ����Ϳ�����.*/
	public static void main(String[] args) {

	}

}
interface ABCDE{
	public void a();	//��Ϊ�ӿڵķ���,�����ǳ����.ϵͳ��Ĭ�ϼ���abstract,���󷽷���û��{}��
	public void b();
	public void c();
	public void d();
	public void e();
}
 abstract	class FG implements ABCDE{//FG����һ����������.��ʵ��������ӿ�,��д�˷���(��Ϊ�ӿ��еķ���Ĭ�϶��ǳ����,ǿ����д)

	@Override
	public void a() {
	}

	@Override
	public void b() {
	}

	@Override
	public void c() {
	}

	@Override
	public void d() {
	}

	@Override
	public void e() {
	}
	
}
 class HJ extends FG{
	 @Override
	public void c() {
		System.out.println("��ֻ��Ҫc����.�̳�������FG�Ϳ������,���û��������,��Ҫʵ�ֽӿ�,��д���з���");
		
	}
 }