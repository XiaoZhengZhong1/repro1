//��̬��Ա�������������ص���ϰ:��̬��,���뿴���,���п��ұ�.
class  xt1{
	public static void main(String[] args) {
		
		ainmal a = new cat();
			a.function();
		cat b = new dog();		
			b.function();
	}
}
class ainmal{
	public void eat(){
		function();
	}
	public void function(){
		System.out.println("�ܶ๦��");
	}
}


class cat extends ainmal{
	public void function(){
		System.out.println("èץ����");
	}
}
class dog extends cat{
	public void function(){
		System.out.println("������");
	}
}
/*
èץ����
������
�밴���������. . .


*/