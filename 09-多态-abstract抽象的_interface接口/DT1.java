/*09--02
��̬�еĳ�Ա�����ص�֮��Ա����:���뿴���.���п����,   ����father a = new son()
*/

class  DT1{
	public static void main(String[] args) {
		father a = new son();
		System.out.println(a.NUM);//������ 10 ��Ϊnew son()��Ȼ���������,���̳��˸���,�����¼������Ĭ�Ϸ��ʸ������.�õ�ֵ10 ���뿴���,���п����,
								  // //new�������ѵ�ַ��ֵ���˸���,�������10
		son b = new son();
		System.out.println(b.NUM);//������20
	
	}							 
}
class father{
	int NUM = 10;
}
class son extends father{
	int NUM = 20;
}

