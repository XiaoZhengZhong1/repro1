/*

###06.13_�������(��װ�ĸ���)(����)
* A:��װ����
	* ��ָ���ض�������Ժ�ʵ��ϸ�ڣ��������ṩ�������ʷ�ʽ��

* B:��װ�ô�
	* ����ʵ��ϸ�ڣ��ṩ�����ķ��ʷ�ʽ
	* ����˴���ĸ�����
	* ��߰�ȫ�ԡ�
* C:��װԭ��
	* ������Ҫ�����ṩ�����ݶ�����������
	* ���������أ��ṩ��������������ʡ�
*/
/*
###06.14_�������(private�ؼ��ֵĸ������ص�)(����)
* A:���ำֵ���������
* B:private�ؼ����ص�
	* a:��һ��Ȩ�����η�
	* b:�������γ�Ա�����ͳ�Ա����
	* c:�������εĳ�Աֻ���ڱ����б�����
* C:������ʾ
	* ��װ��private��Ӧ�ã�
	* A:�ѳ�Ա������private����
	* B:�ṩ��Ӧ��getXxx()��setXxx()����
	* private�����Ƿ�װ��һ��������ʽ,����˵��װ����˽��
*///���Ǹ�ѧ���Ĵ�������
/*class  Lprivate{
	public static void main(String[] args) {
		glass a = new glass();
			  a.name = "������";
			  a.g =  200;
			a.zhuangshui();
		
	}
}
class glass{
	String name;
	int g;
public void zhuangshui(){
	System.out.println(name + " " +"����" + g + "g" + " " + "��װˮ");
}
}
*/

//����,������Ĵ�������������private��װ
//��װ����߰�ȫ��,�����������glass(����)����,������������˸���-11,�ͻ����������("�Բ���,������������")
/*class  Lprivate {
	public static void main(String[] args) {
		glass a = new glass();
			  a.setN("������");
			  a.setK(11);
			 a.zhuangshui();
		
	}
}
class glass{
	private String name;
	private int Kg;
	public void setK(int b){//���д���,���ڰ�voidд��int,(�������,����: ȱ�ٷ������),����1����Сʱ,�ŷ���.set���þֲ�����,�ǲ���Ҫ����ֵ��,������void�հ�
		if (b > 0 && b < 1000){
		Kg = b;
		}else {System.out.println("�Բ���,������������");}

	}
		public void setN(String n){
			name = n;	
		}
		public String getN(){
		return name;
	
		}
	public int getK(){
		return Kg;
	
	}
	public void zhuangshui(){
		System.out.println(name + " " +"����" + Kg + "g" + " " + "��װˮ");
	}

}*/

//�������� b k  n N ����̫��,���������,�������Щ����,���Ļ�,��name�Ͷ���name,��kg�Ͷ���kg,
/*class  Lprivate {
	public static void main(String[] args) {
		glass a = new glass();
			  a.setName("������");//�����Ѿ����ø�ֵ�����ֺ�����.Ϊʲô�������ϵͳĬ��ֵunll 0,˵����ֵû�н�����װ��name��kg��
			  a.setKg(11);
			 a.zhuangshui();
	}
}
class glass{
	private String name;
		private int kg;
	public void setKg(int kg){	// �ֲ��������ƿ��Ժͳ�Ա��������һ�����ڷ�����ʹ�õ�ʱ�򣬲��õ��Ǿͽ�ԭ��
		if (kg > 0 && kg < 1000){
			kg = kg;
		}else {System.out.println("�Բ���,������������");}

	}
	public void setName(String name){//��Ϊ�ͽ�ԭ��,����ϵͳĬ�ϸ��ͽ��ķ��������е�name��kg��ֵ,����Ա����û�и�ֵ.�����������null��0
		name = name;	
	}
	public String getName(){
		return name;
	}
	public int getKg(){
		return kg;
	}
	public void zhuangshui(){
		System.out.println(name + " " +"����" + kg + "g" + " " + "��װˮ");
	}*/
/*����������:
null ����0g ��װˮ
�밴���������. . .
*/
//}
/*
#06.15_�������(this�ؼ��ֵĸ�����Ӧ��)(����)
* A:this�ؼ����ص�
	* ����ǰ���������,������ǳ�Ա����. 
* B:������ʾ
	* this��Ӧ�ó���
	* �������ֳ�Ա�����;ֲ���������
*/
/*class  Lprivate {
	public static void main(String[] args) {
		glass a = new glass();
			  a.setName("������");
			  a.setKg(11);
			 a.zhuangshui();
	//System.out.println(a.getName() + " " +"����" +a.getKg() + "g" + " " + "��װˮ");//ע��:���Ҫ�ڲ����������ӡ,��Ҫ ������.������()
						
					//ע��:getkg(),�������Դ�ӡ,�����Ի�ȡֵ,Ҳ���Ը�ֵ����������,������������,����������е�������ֻ�ܴ�ӡ��ʾ
	}
}
class glass{
	private String name;
		private int kg;
	public void setKg(int kg){
		if (kg > 0 && kg < 1000){
			this.kg = kg;	//����ǰ���������,��ǰ������� a ,ֻ��һ����������name��kg����������������
		}else {System.out.println("�Բ���,������������");}

	}
	public void setName(String name){
		this.name = name;	//this�������ֳ�Ա�����;ֲ���������
	}
	public String getName(){
		return name;
	}
	public int getKg(){
		return kg;
	}
	public void zhuangshui(){
		System.out.println(name + " " +"����" + kg + "g" + " " + "��װˮ");//�ڻ������������ӡ,ֱ������name��kg �Ϳ���;��Ϊ��������Ƕ�����
	}
}
/*��������this��.����������:
������ ����11g ��װˮ
�밴���������. . .

*/
//���������������.ֻ����һ��,this,˵��thisֻ����ǰ����,�����a����this�ʹ���a����,�����a2����this�ʹ���a2
/*class  Lprivate {
	public static void main(String[] args) {
		glass a = new glass();
			  a.setName("������");
			  a.setKg(11);
			System.out.println(a.getName() + " " +"����" +a.getKg() + "g" + " " + "��װˮ");
		glass a2 = new glass();  
			   a2.setName("�׸ֱ�");
			   a2.setKg(222);
			System.out.println(a2.getName() + " " +"����" +a2.getKg() + "g" + " " + "��װˮ");
	}
}							
class glass{
	private String name;
		private int kg;
	public void setKg(int kg){
		if (kg > 0 && kg < 1000){
			this.kg = kg;	
		}else {System.out.println("�Բ���,������������");}

	}
	public void setName(String name){
		this.name = name;	
	}
	public String getName(){
		return name;
	}
	public int getKg(){
		return kg;
	}
/*������
������ ����11g ��װˮ
�׸ֱ� ����222g ��װˮ
�밴���������. . .*/



//}