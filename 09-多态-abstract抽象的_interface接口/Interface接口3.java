class Interface�ӿ�3 {
	public static void main(String[] args) {
		
	}
}
/*
1:������,����ӿ�,�ӿ���ӿ�֮��Ĺ�ϵ?
	a:������,�Ǽ̳й�ϵ,ֻ�ܵ��̳�,�ɶ��̳�(���ǿ��Լ̳и����,Ҳ���Լ̳и��������үү���,��ֻ�ܼ̳�һ��)
2:����ӿ�?
    B:ʵ�ֹ�ϵ,���Ե�ʵ��,Ҳ���Զ�ʵ��.���һ������ڼ̳�һ�����ͬʱ,ʵ�ֶ���ӿ�ʵ��
	
3:�ӿ���ӿڵĹ�ϵ?
	c:�̳й�ϵ,���Ե��̳�,Ҳ���Զ�̳�.
4:�ܽ�,ǰ��ͺ���һ���м̳�,��һ����ʵ��
*/
interface a{
	public abstract void work();
}
interface b{
	public abstract void print();
}
interface c extends a,b{
	public abstract void eat();
}
class d extends Object implements a,b{	//����ӿ�?ʵ�ֹ�ϵ,���Ե�ʵ��,Ҳ���Զ�ʵ��,���һ������ڼ̳�һ�����ͬʱ,ʵ�ֶ���ӿ�ʵ��.
	public void work(){
		System.out.println("work");
	}
	public void print(){
		System.out.println("print");
	}
}