package com.ö��2;

public  enum we3 {	//enum��ö�ٷ�ʽ3:��enum�����г��󷽷�.(ע����Ȼ�����г��󷽷�,�����಻�ó���)
	mo2("����һ"){	
		public void show(){
			System.out.println("����һ");
		}
	},tu2("���ڶ�"){	//ע����Ȼ���ڲ��൫��,�����ź����;��,����ͬʱ���� ��enum�еĶ���,��ʽ.
		public void show(){
			System.out.println("���ڶ�");
		}
	},we2("������"){
		public void show(){
			System.out.println("������");
		}
	};	

	private String name;
	private we3(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public abstract void show();
}
