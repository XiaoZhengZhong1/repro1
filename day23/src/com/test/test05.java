package com.test;

public class test05 {
	/*###23.05_�ݹ���ϰ(쳲���������)
	* ��������
	* ���µô���Ԫ1202��˵�𣬻�˵��һλ��������꣬����쳲�������
	* �ʣ�һ�Ըճ��������ӣ�һ���ڷ�ֳ�ɶ��ٶ�����?
	* 1 1 2 3 5 8 13
	* ��һ����һ��С����					1
	* �ڶ�����һ�Դ�����					1
	* ��������һ�Դ���������һ��С����		2
	* ���ĸ���һ�Դ���������һ��С����
	* 		 һ��С���ӳ��ɴ�����			3
	* ����������Դ�����������С����	
	* 		 һ��С���ӳ��ɴ�����			5*/
	public static void main(String[] args) {
		

	System.out.println(getNum(12));
	}
  //�õݹ�ķ�����ʾ,��һ�귱ֳ���ӵ�����.
	public static int getNum(int num) {
    	if(num == 1 || num == 2){
    		return 1;
    	}else{
    		return getNum(num - 2) + getNum(num - 1);/*��Debug֤��,��ֵ12�󵽵ݹ�����,���ǻ����num=1�� num=2��
    		λ�ÿ�ʼ�����num=3.4.5.6....��ֵ,�������num=12��ֵ,*/
    	}
    
    
    }
//demo();�����������ķ���,��һ�귱ֳ���ӵ�����.
	public static void demo() {
		int[] in = new int[12];
		in[0] = 1;
		in[1] = 1;
		for (int i = 2; i < in.length; i++) {
			in[i] = in[i-2] + in[i-1];
			}
		System.out.println(in[in.length - 1]);	//��ӡ���������һ����
	}

}
