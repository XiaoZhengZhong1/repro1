class xt2 {
	public static void main(String[] args) {
		phone h = new phone();
			h.setName("华为");
			h.setPrice(688);
		System.out.println(h.getName() + " " + h.getPrice());
			h.call();
			h.SendMessage();
	}
}
class phone {		     			    //封装电话名称
		private String name;
		private int	price;			    //封装电话价格
	public void setName(String name){	//设置名称
		this.name = name;
	}
	public String getName(){			//获取名称
		return name;
	}
	public void setPrice(int price){	//设置价格
		this.price = price;
	}
	public int getPrice(){				//获取价格
		return price;
	}
	public void call(){					//成员方法(行为)
		System.out.println("打电话");
	}
	public void SendMessage(){
		System.out.println("发短信");
	}
}
/*
华为 688
打电话
发短信
请按任意键继续. . .
*/