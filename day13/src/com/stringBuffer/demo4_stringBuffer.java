package com.stringBuffer;

public class demo4_stringBuffer {

	public static void main(String[] args) {
		/*###13.07_常见对象(StringBuffer和String的相互转换)
		* A:String -- StringBuffer
			* a:通过构造方法
			* b:通过append()方法
		* B:StringBuffer -- String
			* a:通过构造方法
			* b:通过toString()方法
			* c:通过subString(0,length);*/
//把string转换成StringBuffer
		/*StringBuffer f = new StringBuffer("helloword");
			System.out.println(f);//通过构造方法,输出结果是字符串String
				
			StringBuffer j = new StringBuffer();
				j.append("helloword");
					System.out.println(j);//通过添加方法,输出结果是字符串String
				*/
//把StringBuffer转换成string
		StringBuffer f = new StringBuffer("helloword");
			String h = new String(f);//把StringBuffer f 赋值给string h
				System.out.println(h);
	
			f.subSequence(0, f.length());//截取从0索引开始,到最后一个不包含最后一个.因为最后一个是length-1,要被截取.
				System.out.println(f);
	}

}
