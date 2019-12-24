
//###05.20_Java语言基础(思考题Java中的参数传递问题及图解)(掌握)
//* A:案例演示

	//	看程序写结果，并画内存图解释
//基本数据类型(有多个方法的)传递值不改变'因为调用方法执行完后数值释放掉了,数值还是调用前的,因为方法只进 栈,
//引用数据类型.(有多个方法的)传递值改变,因为引用有new,new进堆了,数值用完了会保存,
//问:java中传值还是传址,答:java中只有传值,因为地址也是值(java之父 高斯林说的)
class xt1{
	
		public static void main(String[] args) {
			int a = 10;
			int b = 20;
			System.out.println("a:"+a+",b:"+b);//1第一个输出结果 a:10,b:20 没问题.
			change(a,b);
			System.out.println("a:"+a+",b:"+b);//4第四个输出结果 a:10,b:20 ,第三次输出的结果是a:20,b:40 为啥最后输出结果还是a=10,b=20
											    //因为方法进 栈 没有新键new,调用方法执行完后就会弹栈,局部变量就消失了,什么都没有,打印的还是第一次的值
			int[] arr = {1,2,3,4,5};
			change(arr);
			System.out.println(arr[1]);			//5第五个输出结果 4 是因为调用方法进 栈 后有new在堆里新建存储空间,调用方法结束后方法弹出栈,堆里元素数值还在
		}
	
		public static void change(int a,int b) {
			System.out.println("a:"+a+",b:"+b);//2第二个输出结果:a:10,b:20 也没问题,因为是直接把第一次的输出结果,方法调用下来的
			a = b;
			b = a + b;
			System.out.println("a:"+a+",b:"+b);//3第三个输出结果:a:20,b:40 数值调换相加后也也没问题,
		}
	
		public static void change(int[] arr) {
			for(int x=0; x<arr.length; x++) {
				if(arr[x]%2==0) {
					arr[x]*=2;
				}
			}
		}

/*输出结果如下;
a:10,b:20
a:10,b:20
a:20,b:40
a:10,b:20
4
*/






}