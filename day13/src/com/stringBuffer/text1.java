package com.stringBuffer;

public class text1 {

	public static void main(String[] args) {
		/*:������ʾ
		* ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
		* 
				������
					int[] arr = {1,2,3};	
				��������
					"[1, 2, 3]"
					
				��StringBuffer�Ĺ���ʵ��
*/
		int[] arr = {1,2,3};
			System.out.println(arrayToString(arr));
	}
		public static String arrayToString(int[] arr){
			
		
		StringBuffer a = new StringBuffer();
			a.append("[ ");
			for (int i = 0; i < arr.length; i++) {
				if(i == arr.length-1){
					a.append(arr[i]).append("]");
				}else{
					a.append(arr[i]).append(", ");
				}
				
			}
			return a.toString();
	
			
	}
	
	

}
