package com.ö��;

public abstract class week3 {	//����ö���෽ʽ3:��ö��������һ�����󷽷�.
	public static final week3 mon3 = new week3("����һ"){/*��Ϊ�����г��󷽷�,����������ǳ����,�������ǲ���ʵ�������ǲ���
	new��,���ǿ���ͨ�������ڲ���(����newһ�������������,��д���󷽷�.new week3("����һ")����һ������,ͨ���вι��촴������������
	�����{};�����źͷֺŴ���һ�����������ʽ,��Ϊ���ڲ�������Ҫ�ӷֺ�*/
		public void show(){
			System.out.println("����һ");
		}
	};
	public static final week3 tue3 = new week3("���ڶ�"){
		public void show(){
			System.out.println("���ڶ�");
		}
	};
	public static final week3 wed3 = new week3("������"){
		public void show(){
			System.out.println("������");
		}
	};

	private String name;
	private week3(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public abstract void show();
	
	}
