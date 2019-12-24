/*
* 数组遍历：就是依次输出数组中的每一个元素。
	* 数组的属性:arr.length数组的长度
	* 数组的最大索引:arr.length - 1;
*/
class DemoArra2 {
	public static void main(String[] args) {
/*		int[] arr = {11,22,23,44,};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
*/
/*	
11
22
23
44	
*/	
													//由于上面代码不够简洁,为了提高代码的可复用性,就有了数组遍历,就是用for循环来依次输出,每个元素.如下:
	
	
	//for (int b = 0;b < 4 ;b++ ){					//b 是假设的存储空间中的元素,因为元素都是0 1 2 3 4.......所以b=0由于上面有4个元素,所以b<4,
	//	System.out.println(arr[b]);					//arr[b] 由于b=0,那么对应的就是上面简化格式的数组,右边的元素赋值了,所以循环的也是每个元素值
	
													//如果有一万个元素值,怎么办,还数出来,才能确定for循环里的关系表达式b<多少.所以又有了arr.length数组的长度
/*															//任何数组名加上 .length 就表示该数组的元素总个数,a.length,表示是a数组的元素总个数
		
		for (int b = 0;b < arr.length ;b++ ){		//b是一个假设变量值,因为要循环输出数组里的每个元素值,所以要把元素默认值 0 赋值给b,从0开始循环;
													//arr.length格式意思是arr数组里的存储空间的元素长度,arr里有4个,arr.length就是4.
													//元素是从0开始的,0 1 2 3 ,所以arr.length-1就是存储空间的元素个数,就是<arr.length

		System.out.println(arr[b]);	}			//因为b=0,0是arr的第一个默认元素值,b++也是arr和所以数组的系统默认元素初始值,所以循环输出b,就是循环输出元素
*/
/*	输出结果如下:
11
22
23
44
请按任意键继续. . .	
*/
	
	}
}
