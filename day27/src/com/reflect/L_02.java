package com.reflect;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class L_02 {
	/*###27.04_反射(Class.forName()读取配置文件举例)
	* 榨汁机(Juicer)榨汁的案例
	* 分别有水果(Fruit)苹果(Apple)香蕉(Banana)桔子(Orange)榨汁(squeeze)*/
	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
/*3:如果每天只想喝一种果汁.那么以下,多态前和多态后,每次都需要修改运行代码,运行想和的果汁,关掉不想喝的.每次都用改原代码太麻烦.就可以用反射
反射(Class.forName()读取配置文件举例)(具体意思就是创建一个配置文件就是文件,和以下水果类在同一项目下的文件.文件内容为水果的类名字节码
文件.比如com.reflect.apple放在配置文件中就代表苹果类是class字节码.因为类名是一样的,获取到这行字符串的字节码就等于获取到了苹果类的
字节码,如果想换一种果汁,就把最后面的苹果改成桔子,香蕉.....比改原代码方便*/


//3:学了反射之后,想换果汁,不用修改原代码,直接修改和水果类class类名一样的配置文件,即可.		
BufferedReader br = new BufferedReader(new FileReader("peizhi"));//表示创建字符缓冲输入流,用来整行读取配置文件内容
Class<?> class2 = Class.forName(br.readLine());//用Class类的获取类名方法.获取读取内容类名.返回一个类名.
	fruit f = (fruit) class2.newInstance();	//调用类中的创建对象方法,返回一个该类对象把Object对象强转成水果对象
	juicer j3 = new juicer();	//该配置文件就能换一种果汁的其它是必须实现水果接口.
		j3.run(f);
		br.close();
		
	
		//1:没学多态之前的写法,代码太繁琐.		
		juicer j2 = new juicer();
		orange or = new orange();	
				j2.run(or);
		
		
		//2:学了多态后.一行代替上面3行代码.复用性强.		
		juicer j = new juicer();
		j.run(new apple());
		j.run(new orange());	
		j.run(new banana());             
		
//2:学了多态之后,我们就可以把所有的水果抽取成一个接口.然后在炸机类中,run方法参数之间传入水果类型,让实现了水果接口的子类来调用run方法
		//j.run(new apple());/*2:用了多态后.表示fruit f = new apple();表示分父类引用指向子类对象.f代表所有的水果
		//	子类对象.直接调用炸机榨汁方法,榨出参数对应的果汁.(多态----提供代码的复用性.让程序的扩展性比较强.)*/
	}

}

interface fruit{	//水果接口
	public void squeeze();	//果汁方法.
}

class apple implements fruit{//苹果类		//2:用了多态后,表示苹果类实现了水果接口.重写了果汁方法.
	public void squeeze(){//能榨苹果汁
		System.out.println("榨出一杯苹果汁");
	}
}
//先复习下多态.1:先不用多态,有榨机类,类中有榨汁run方法,参数是苹果.桔子得重写一个run方法,参数是桔子.香蕉又得得重写一个run方法.参数香蕉
class orange{//桔子类
	public void squeeze(){//能炸桔子汁
		System.out.println("榨出一杯桔子汁");
	}
}
class banana implements fruit{//香蕉类
	public void squeeze(){//能炸香蕉汁
		System.out.println("榨出一杯香蕉汁");
	}
}
class juicer{//炸机类
	public void run(apple a){//榨汁方法,苹果类参数.表示炸的是苹果汁.(注意之前讲了参数是引用数据类型的,其实是需要创建一个对象)
		a.squeeze();	//表示用炸机榨汁方法.榨出一杯苹果汁.
	}
	public void run(orange o){
		o.squeeze();
	}
	public void run(banana b){
		b.squeeze();
	}		//以上是没有学习多态之前的写法.每换一种水果都用重写一次方法(也叫方法重载),代码复用性太差

	public void run(fruit f){	//表示炸水果.代表所有的水果.
		f.squeeze();			//调用炸榨汁炸水果.
	}
}
