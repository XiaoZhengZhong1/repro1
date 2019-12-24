package com.xzz.bean_1;

public class person implements Comparable<person> {  //��ʾʵ�ֱȽϽӿ�,��person��Ctrl+1��д��Compareto����
	private String name;
	private int age;
	
	public person() {
		super();
		
	}
	
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;/*ѡ31������ԭ��.1:��������,�ܱ������1����.2:���ֲ���С�պ�,���˺�����˻���ܳ���int��ȡֵ
		��Χ,С��,��ַ��Χ�����ظ�.3:���������,31��2��5�η�-1,Ҳ����2 >>>>>*/
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)		//��ʾ����һ��,ֱ�Ӳ�Ҫ
			return true;		//����true�Ȳ���Ҫ�Ƚ�,Ҳ����Ҫ�¸���ַ.
		if (obj == null)		//��ʾ��������ǿմ�,Ҳ����Ƚ�
			return false;		//����false,����
		if (getClass() != obj.getClass())	//��ʾ���������һ�����,
			return false;					//����
		person other = (person) obj;		//����ǿת
		if (age != other.age)				//�������������͵��ö������䲻һ��
			return false;					//����
		if (name == null) {					//��ʾ��������������ǿմ�,
			if (other.name != null)			//���ö������ֲ��ǿմ�.
				return false;				//����
		} else if (!name.equals(other.name))	//����,������������ֲ����ڵ��ö�������,
			return false;						//����
		return true;	//�������������������,���ܴ�ͷ�ߵ���.˵���������������ͱ�������һ��,���Ե���equals����
	}

/*//TreeSet����Զ������,���,��Ҫ��������compareto�Ƚ϶���˳��ķ���,�����������.
//1:��д�����򷽷��ǰ���������	
	@Override
	public int compareTo(person o) {
		int num = this.age - o.age;	��ʾ�ñ���������-���ö��������.ϵͳĬ�Ϸ���ֵ��0,����ֻ���һ��������,������ʹ���o
	Ȼ������ÿ��Ԫ�ض����������ȽϷ���.�͸�age�������,�ȸ�������,�ȸ�С���ұ�.�����Ϊ�˱�֤ÿ�εķ���ֵ��һ��,����ֵһ��
	�ͱ�ʾ��ַһ�� ,�ͻᵱ���ظ���,�������.	
		return num == 0 ? this.name.compareTo(name) : num ;��ʾ����Ľ��num����0��,���ھͱȽ�����.��ΪString��
	ʵ����comparable�ӿ�,������compareTo����,��������ʾ�ַ������бȽϷ��ص���intֵ,����˵���������ͬ���Ϊ0,�ͱȽ�����,����
	�����ͬ�ͻ᷵��һ��intֵ,�������ֵ,ֻҪ����0�Ͳ��͸���ַ��ͻ,���ܴ��ȥ.���num���������0.��ֱ�ӷ���num	
		
		1:������ֵ��0,TreeSet�������һ��Ԫ��,�൱���Ƕ�����������,��������ʾֻ���������,ÿ�����������÷���ֵ,�ٺ͸���age�Ƚ�
	�ȸ���ͷ��ұ�,�ȸ�С�ͷ����,�����߻����ұ��ж���,�ͼ����Ƚ�age,���Ǵ�ķ��ұ�,С�ķ����.ֱ����߻����ұ�û�ж���,�����ʱ��
	Ҳ�Ǵ�������,�����ұ�ʱ�ȿ��������û�ж���,�о���������.2:������ֵ����0ʱ,��˳�����������ô����ôȡ,3:������ֵ�Ǹ���,�����


	}*/
	/*
	//2:��дһ������������ķ���
			@Override
			public int compareTo(person o) {
				int num = this.name.compareTo(o.name);
			return num == 0 ? this.age - o.age : num;
			}	*/

//3:��дһ����������������ıȽϷ���.
				@Override
				public int compareTo(person o) {
					int length = this.name.length() - o.name.length();	//��ʾ�Ƚ���������.
					int num = length == 0 ? this.name.compareTo(o.name) : length;	/*num������Ԫ������
	��ʾ�������Ƚ�����������һ����,�ͱȽ���������,һ���ͷ���0,��һ���ͷ���length����*/
					return num == 0 ? this.age - o.age : num;	/*��ʾnum����0��,����0��˵���������Ⱥ����ݶ�һ��.
					 �ǾͱȽ�����,�������һ���ͷ���0,�����һ���ͷ������������ֵ*/
				}	
}
