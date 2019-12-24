class j面试题 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
/*
1:一个类如果没有抽象方法,可不可以定义成抽象类,有什么意义,
	答:可以.
	这样做就是不让其它类创建此类对象.交给子类完成.
2;abstract和那些关键字不能共存?
	答:static-------非法的修饰符组合: abstract和static------被abstract修饰的方法是空方法,没有实例的.被static修饰的方法,用类名来调用空方法是没有意义的
	   fine---------非法的修饰符组合: abstract和final-------final是最终方法,无法重写.而abstract抽象方法,必须重写.一起修饰,相互矛盾
	   private-------非法的修饰符组合: abstract和private-----被abstract修饰的方法是为了让子类看到并强制重写.而被private修饰的,不让子类看到,也是相互矛盾
*/
//abstract class father{
	//public static abstract void print();// 非法的修饰符组合: abstract和static

	//public final abstract void print();	//非法的修饰符组合: abstract和final

	//private abstract void print();			//非法的修饰符组合: abstract和private
//}