class xt2 {
	public static void main(String[] args) {
		phone h = new phone();
			h.setName("��Ϊ");
			h.setPrice(688);
		System.out.println(h.getName() + " " + h.getPrice());
			h.call();
			h.SendMessage();
	}
}
class phone {		     			    //��װ�绰����
		private String name;
		private int	price;			    //��װ�绰�۸�
	public void setName(String name){	//��������
		this.name = name;
	}
	public String getName(){			//��ȡ����
		return name;
	}
	public void setPrice(int price){	//���ü۸�
		this.price = price;
	}
	public int getPrice(){				//��ȡ�۸�
		return price;
	}
	public void call(){					//��Ա����(��Ϊ)
		System.out.println("��绰");
	}
	public void SendMessage(){
		System.out.println("������");
	}
}
/*
��Ϊ 688
��绰
������
�밴���������. . .
*/