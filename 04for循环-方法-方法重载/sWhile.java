/*

###04.06_Java���Ի���(ѭ���ṹwhile���ĸ�ʽ�ͻ���ʹ��)
* A:ѭ���ṹwhile���ĸ�ʽ��
* 		
		whileѭ���Ļ�����ʽ��
		while(�ж��������) {
			ѭ�������;
		}
		
		������ʽ��
		
		��ʼ�����;
	    while(�ж��������) {
			 ѭ�������;
			 �����������;
		}
* B:ִ�����̣�
	* a:ִ�г�ʼ�����
	* b:ִ���ж��������,���䷵��ֵ��true����false
		* �����true���ͼ���ִ��
		* �����false���ͽ���ѭ��
	* c:ִ��ѭ�������;
	* d:ִ�п����������
	* e:�ص�B������
* C:������ʾ
	* �������ڿ���̨�������1-10*/
class sWhile {
	public static void main(String[] args){
	/*	int x = 1;	
	while (x <= 10){
		System.out.println("x=" + x);
			x++;	
		}*/
//��1-10������֮��	
/*		int x = 1;	
	int y = 0;
	while (x <= 10){
	y += x;			//��y = x + y��һ����˼;		
	x++;	//����������¼�������Ĵ��� 55,��������е���λ��.��������65		
	}
	System.out.println("y=" + y);*/

//ͳ��ˮ�ɻ��ĸ���
	/*int y = 0;
	int x = 100;
	while (x <= 999){
	int ge = x % 10;
	int shi = x / 10 % 10;
	int bai = x / 10 / 10 % 10; 
	if (x == ge * ge * ge + shi * shi * shi + bai * bai * bai){
			y++;
	}
			x++;
	}
		System.out.println(y);	//������y=4*/
	}
}