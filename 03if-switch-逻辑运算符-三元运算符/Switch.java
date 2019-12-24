/*switch(表达式) {			//表达式能接收的基本数据类型范围有 byte shar short int 只要能生成 int 类型的都可以. 引用数据类型的可以接收 枚举 string字符串
		      case 值1：    //case 后面的值只能是常量,不能是变量,并且往下依次的case后的值,不能相同.意思就是case 1  case 2 就是第一 第二的意思
				语句体1;
				break;
			    case 值2：
				语句体2;
				break;
			    …
			    default：	//可以省略  建议不要省略  可以放在任何位置.都会最后执行.建议放在最后
				语句体n+1;
				break;			//最后一个可以省略  其他的不能省略 省略了就会穿透 意思是整个swit语句最终只会输出一个符合case下面的语句体
									或者是一个都不符合输出defau下面的语句,如果省略中间的break就会输出break下面的case语句体.都省略就会全部输出
			//switc语句的结束条件 最后遇上break 或者}大括号						
 }*/



class Switch
{
	public static void main(String[] args) 
	{
	int x = 3,y = 4;//一次标识两个,中间可以用逗号,不能用空格
	switch(x){
	case 1:
		x++;
	break;
	case 2:				//这是switch语句的表准格式 break;case:可以有很多个
		y++;
	default:
		++y;	
	System.out.println("x=" + x + ",y=" + y);	//输出结果 x=3,y=5 因为x不是case1和case2 所以执行最后的default ++y 所以y=5
	break;
	}	
		
	  /*int x = 3,y = 4;
		switch(x){
		    default:  //虽然defau在最上面,但还是最后执行.建议放最地下
			x = 10;
			break;	//如果省略这个break,会穿透,执行下面的++x 输出的值会变成11
			case 1:
				++x;
				break;
		      case 2:
				y++;
		//最底下省略了break
		}
	System.out.println(x);*/
	}
}
