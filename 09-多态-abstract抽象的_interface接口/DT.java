/*09--01
多态的概述:事物存在的多种形态,     比如猫可以是一只白猫,也可以说是一种可爱的动物.
多态的前提:
1:要有继承关系.    如果没有继承关系,说明是一个极端的类,
2:要有方法重写,    只有继承并且还有新的属性和行为才能有多种形态,
3:要有父类引用指向子类对象,   比喻你new了一个猫对象cat a = new cat(),那a就是一只猫,再把这个对象赋值给猫的父类Ainmal b = new ccat(),b就代表是猫一只动物
*/

class DT{
	public static void main(String[] args) {
		cat a = new cat();	
			a.eat();	//调用输出结果:猫吃鱼
	Ainmal b = new cat();						//父类引用指向子类对象   表示猫类对象是动物
		   b.eat();	//调用输出结果:猫吃鱼,系统就近原则,子类和父类有同样的方法,就近原则输出子类方法
	}
}
class Ainmal{									//动物类
	public void eat(){							//成员方法,吃饭
		System.out.println("猫吃饭");
	}
}
class cat extends Ainmal{						//继承继承动物类		
	public void eat(){							//重写了成员方法.
		System.out.println("猫吃鱼");
	}
}
/*
猫吃鱼
猫吃鱼
请按任意键继续. . .
*/