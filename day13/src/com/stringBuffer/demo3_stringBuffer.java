package com.stringBuffer;

public class demo3_stringBuffer {

	public static void main(String[] args) {
/*
###13.04_常见对象(StringBuffer的删除功能)
* A:StringBuffer的删除功能
	* public StringBuffer deleteCharAt(int index):
		* 删除指定位置的字符，并返回本身
	* public StringBuffer delete(int start,int end):
		* 删除从指定位置开始指定位置结束的内容，并返回本身
*/
		/*StringBuffer d = new StringBuffer("helloword");
			d.deleteCharAt(1);//删除指定索引1对应的字符.
				System.out.println(d);//hlloword
			d.delete(1,4);//删除包含从头1索引开始,到不不包含尾4索引结束的字符串.
				System.out.println(d);//hword
*/		
		
		
		
		/*###13.05_常见对象(StringBuffer的替换和反转功能)
		* A:StringBuffer的替换功能
			* public StringBuffer replace(int start,int end,String str):
				* 从start开始到end用str替换
		* B:StringBuffer的反转功能
			* public StringBuffer reverse():
				* 字符串反转*/
	//StringBuffer的替换功能    replace(int start,int end,String str):
	/*StringBuffer c = new StringBuffer("helloword");
		c.replace(0, 4, "aaa");//替换从0索引开始,到4索引结束的字符串,用aaa替换.
			System.out.println(c);//aaaoword
		c.reverse();//反转字符串
			System.out.println(c);//drowoaaa
*/	
				
	
	
		/*###13.06_常见对象(StringBuffer的截取功能及注意事项)
		* A:StringBuffer的截取功能
			* public String substring(int start):
				* 从指定位置截取到末尾
			* public String substring(int start,int end):
				* 截取从指定位置开始到结束位置，包括开始位置，不包括结束位置
		* B:注意事项
			* 注意:返回值类型不再是StringBuffer本身*/
	// 从指定位置截取到末尾
	StringBuffer e = new StringBuffer("hellowString");
		String e1 = e.substring(4);//提取从4索引开始包含4,默认到结尾的字符.因为提取字符串,所有返回值是String类型.
			System.out.println(e1);//owString
		String e2 = e.substring(0, 5);//提取从0索引开始包含0,到5索引结束,不包含5的字符串.
			System.out.println(e2);//hello
		System.out.println(e);//hellowString  提取了两次StringBuffer e的值都没改变.
	}

}
