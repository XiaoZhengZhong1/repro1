class Interface�ӿ� {
	public static void main(String[] args) {
		//father z = new father();	//����: father�ǳ����; �޷�ʵ����
		father z = new son();	//ͨ����̬ʵ�ֽӿ�ʵ����,��������ָ���������.��̬��ǰ��.
			z.print();			//��̬��,���뿴���,���п��ұ�,
	}
}
/*
1:�ӿڵĸ���.
	a:������ĽǶȾ���ָjava�е�interface.
	b:�ӹ���ĽǶȾ���ָ����ָ�������,���ǽӿ�.����һ�๫˾ָ������.���๫˾ָ��Ʒ��.���๫˾�ṩ����
2:�ӿڹؼ���interface,��ʽ:
	interface �ӿ��� {}
3:ʵ�ֽӿ���implements��ʾ,��ʽ:
	class ���� implements �ӿ��� {} 
4:�ӿڲ���ʵ����
	���԰��ն�̬�ķ�ʽ,������ʵ����
5:�ӿڵ�����:
	�����ǳ�����,�����岻��,
	�����Ǿ������,��Ҫ��д�ӿ�������з���.(�Ƽ�ʹ��)
*/
interface father{
	public abstract void print();	//�ӿ��еķ���,���붼�ǳ����

}
class son implements father{		//ʵ�ֽӿ�
	public void print(){			//��д����,ʵ�ֳ����������д����
		System.out.println("dayin");
	}			
}
/*
dayin
�밴���������. . .

*/