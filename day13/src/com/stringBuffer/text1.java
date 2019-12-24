package com.stringBuffer;

public class text1 {

	public static void main(String[] args) {
		/*:案例演示
		* 需求：把数组中的数据按照指定个格式拼接成一个字符串
		* 
				举例：
					int[] arr = {1,2,3};	
				输出结果：
					"[1, 2, 3]"
					
				用StringBuffer的功能实现
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
