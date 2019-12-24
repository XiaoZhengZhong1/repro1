package com.HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;



public class next4 {

/*###18.14_集合框架(模拟斗地主洗牌和发牌并对牌进行排序的代码实现)
* A:案例演示
	* 模拟斗地主洗牌和发牌并对牌进行排序的代码实现
* 1:需要一副牌,我们需要把它存储到集合中,里面包括从3......J.Q.K.A.2.小王.大王.还有颜色,黑,梅,红,方.我们不但要有数字,还要有颜色,
* 而且颜色还要和数字配和一起,每个数字都有四个颜色,大小王不算,可以单独添加.-------得用两个数组,一个装数字.一个装颜色.
* 定义一个索引int index = 0 因为我们需要根据索引顺序来比较牌的大小,方便后面看牌, 再用for循环遍历
* 两个数组,并且用concat()合并方法.外循环是数字,内循环是颜色,每个数字配四种颜色.把 合并后的四色3.四色4......添加到HashMap双列集合
* 的值里面,而键就是index.显然我们还需要 存取有序,因为还要添加大小王,取牌时到手上也要有序方便看牌.只有ArrayList有这功能,所有把所有循环的
* 索引index都添加到ArrayList中.
* 2:添加小王,和index到HashMap.再把index添加ArrayList中.因为数字实现是存取有序的,所有小王的索引会添加到2对应的索引后面,大王也是.
* 3:洗牌,洗索引.因为只有索引是有序的,只有洗索引,发索引,到看牌时才会有序,Collections shuffle();随机洗牌.
* 4:创建4个treeSet集合.三个人.一个底牌.因为treeSet集合可以自动排序.
* 5:发牌是循环发.发四份.用for循环加if用%3(摸鱼3),因为任何数摸鱼3只有3个结果,0,1,2,最后一个放else里面
* 6:看牌要看四次.可以单独写的看 牌方法,让4个分别调用方法
* 
* */
	public static void main(String[] args) {
		String[] s = {"3","4","5","6","7","8","9","10","J","Q","K","A","2",};
		String[] s1 = {"黑桃","梅花","红桃","方块"};
			
			HashMap<Integer, String> hm = new HashMap<>();
			ArrayList<Integer> a = new ArrayList<>();
			
			int index = 0;		//定义索引,索引会贯穿整个洗牌,发牌,和看牌.
		
			for (String b : s) {
				for (String b1 : s1) {
					hm.put(index, b1.concat(b));	//键是索引,值是合并后的索引元素配索引颜色.
						a.add(index);
						index++;
				
				}
			}
		
		hm.put(index, "小王");
		a.add(index);
		index++;	//加1表示下面加的大王比小王大.
		hm.put(index, "大王");
		a.add(index);
	
		Collections.shuffle(a);			//随机洗牌.
	
		TreeSet<Integer> xiaolei = new TreeSet<>();
		TreeSet<Integer> xiaohai = new TreeSet<>();
		TreeSet<Integer> lixia = new TreeSet<>();
		TreeSet<Integer> dipai = new TreeSet<>();
	
		for (int i = 0; i < a.size(); i++) {
			if(i >= a.size()-3){
				dipai.add(a.get(i));		/*注意if(){}else{};嵌套一定要加else if{},嵌套几次加几次,比如下面几是嵌套
两次	if(){}else if(){}else if{}else{};就加两次,如果两次都不加else,那么只有最下面的一个else,只对离它最近的一个if有效其它的if
,就算条件满足,也会循环到最底下的else里面去.也就是说到发牌结束,最底下的else里面会多出一个人的牌,多十几张.	*/
			}else if(i % 3 == 0){
				lixia.add(a.get(i));
			}else if(i % 3 == 1){
				xiaohai.add(a.get(i));
			}else{
				xiaolei.add(a.get(i));
			}
			
		}
		
		lookpai("肖磊",xiaolei,hm);
		lookpai("肖海",xiaohai,hm);
		lookpai("李霞",lixia,hm);
		lookpai("底牌",dipai,hm);
	
	
	}
	
	public static void lookpai(String name,TreeSet<Integer> r,HashMap<Integer,String> hm){
		System.out.print(name + "的牌是:");
		for (Integer index : r) {					
			System.out.print(hm.get(index) + " ");	//通过键获取值hm.put(index, b1.concat(b));
		}
		System.out.println();//换行.
	}
}


