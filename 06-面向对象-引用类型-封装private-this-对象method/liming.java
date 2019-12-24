/*(匿名对象的概述和应用
##06.12_面向对象(匿名对象的概述和应用)(掌握)
* A:什么是匿名对象
	* 没有名字的对象 
* B:匿名对象应用场景
	* a:调用方法，仅仅只调用一次的时候。
		* 那么，这种匿名调用有什么好处吗?
			* 节省代码 
		* 注意：调用多次的时候，不适合。匿名对象调用完毕就是垃圾。可以被垃圾回收器回收。*/
class  liming{
	public static void main(String[] args) {
		diannao daier = new diannao();//此行有对象daier
			daier.name = "戴尔";
			daier.zhongliang = 2;
		System.out.println( "品牌" + daier.name + " " + "重量单位kg:" + daier.zhongliang);
			daier.shangwang();
		new diannao().shangwang();//new diannao()这就是一个没有赋值对象的匿名对象.调用方法，仅仅只调用一次的时候,节省代码,多次调用就不合适,因为每次调用就
								  //等于新键一个存储地址,浪费,匿名对象可以作为实际参数传递
	}
}
class diannao{
	String name;
	int zhongliang;
public void shangwang(){
	System.out.println("电脑能上网");
	}
/*输出结果如下:
品牌戴尔 重量单位kg:2
电脑能上网
电脑能上网
*/

}