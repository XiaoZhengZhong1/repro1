/*if语句和switch语句的各自使用场景
 switch语句建议判断固定值的时候使用
 if语句判断区间或者范围的时候使用
*/
//分别用键盘录入,switch语句和if语句来表达12个月对应的一年四季
/*import java.util.Scanner;
class IfvsSwitch {
	public static void main(String[] args) 
	{
/*	Scanner sc = new Scanner(System.in);	
		System.out.println("请输入对应的月份");
		int x = sc.nextInt();
		switch(x){
			case 3:		
			case 4:	//因为3 4 5 都是一个季节,输出的是同一条语句,所以可以省略break 让其穿透
		    case 5:	
		System.out.println("月是春季");
			break;
			case 6:	
			case 7:	
			case 8:	
		System.out.println("月是夏季");
		    break;
			case 9:	
			case 10:	
			case 11:	
		System.out.println("月是秋季");
			break;
			case 12:	
			case 1:
			case 2:	
		System.out.println("月是冬季");
			default:		
		System.out.println("对不起没有对应的季节");
		}*/
		
	//if表达	
/*import java.util.Scanner;		
class IfvsSwitch {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入对应的月份");
		int x = sc.nextInt();	
		if (x >= 3 && x<= 5){
			System.out.println("月是春季");
	    }else if (x >= 6 && x <= 8){
			System.out.println("月是夏季");
		}else if (x >= 9 && x <= 11){
			System.out.println("月是秋季");
		}else if (x  > 12 | x < 1){
		    System.out.println("对不起没有对应的季节");
			
		}else {System.out.println("月是冬季");
			
		}
		

	}


}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

