class Ljys{
	public static void main(String[] args) {
		//�߼�������Ļ�������    �߼�����Ľ����boolean(������)(����true����false)
		// & �߼� �� ������7������.�� ����(and) ����˼ ����ʱ�� ��  ��������ʱ�� ����
		//int a = 10;
		//int b = 20;
		//int c = 30;
		//System.out.println(a < b & b < c);			//������ true  (true & true)=true ��Ϊa<b&b<c ����aС��b ����bС��c �ǶԵ�.���Խ�����������
		//System.out.println(a < b & b > c);			//������ false (true & flase)=false ��Ϊ��������һ���Ǽٵ�,���������ȻҲ�Ǽٵ�
		//System.out.println(a > b & b < c);			//������ false (false * true)=false 
		//System.out.println(a > b & b > c);			//������ false (false & false)=false
		//����,ֻ��(true & true)�����true,������flase
		//����false��false
		
		// && ˫��.�ڲ�������ʱ����͵��� & һ��.���� && ˫���ж�·��Ч��,�������falseʱ,�ұ߲�ִ��.  ��Ϊ�����false�Ѿ������˽��Ҳ��false
			//int x = 4;												//��������true,�ұ�����ִ��
			//int y = 3;
		//System.out.println(++x == 4 & ++y == 3);		    //������ false ûë��
		//System.out.println(y);							//������ 4 ˵������&����ִ�����ұ�++�Ĳ���

		//System.out.println(++x == 5 && ++y == 3);			//������ false ûë��
		//System.out.println(y);					//������ 3 ˵������ && ˫��û��ִ���ұ�++�Ĳ���	����Ƕ�·��Ч��,�������falseʱ,�ұ߲�ִ��				



		// | �߼� �� ��enter�س������� �� ����(or)����˼ ������ �� ��������ʱ�� ����
		//System.out.println(a < b | b < c);				//������ true
		//System.out.println(a < b | b > c);				//������ true
		//System.out.println(a > b | b < c);				//������ true
		//System.out.println(a > b | b > c);				//������ false
		
		// | ����������� ����,��������ֻҪ��һ������,�����������,���������true ������ȫ������false��,�ǽ���϶�Ҳ�Ǽٵ�
	    //����true��true
		// || ˫��  �� | ������һ��,����||˫���ж�·Ч��.���������trueʱ �ұ߲�ִ�в���.��Ϊ�����true�Ѿ������˽��Ҳ��true
															//��������false,�ұ�����ִ��




	// ^�߼� ���,��6��, �ֻ��������˼,���������ʵ���˼.�˽⼴��
	
	//System.out.println(a < b ^ b < c);		//������ false  (true^true)=false
	//System.out.println(a < b ^ b > c);		//������ true   (true^false)=true
	//System.out.println(a < b ^ b > c);		//������ true   (true^false)=true
	//System.out.println(a > b ^ b > c);		//������ false  (false^false)=false
	//���� ��������ŵ����ݾ���^���ߵıȽϽ����һ��,���Ի��߶��Ǵ��  �������false��  һ����һ��������������true��
	//����ͬ��false ��ͬ��true

	// !�߼� �� ���������Ϸǵ���˼,����͵ļ� �Ǽپ����� �Ƿ��滹���� �ǷǼٻ��Ǽ�
	//System.out.println(! true);				//������false
	//System.out.println(! false);			//������true
	
	 
	 //��������
	 
	// int x = 5;
	//  int y = 10;
	//	int z;
	//	z = x;
		//y = z;
	//System.out.println(y);		//�������� 5 ������������������ֵ����������,�õ���������z��ת��
	
	//x = x + y;						//5+10=15
	//y = x - y;						//15-10=5
	//System.out.println(y);			//������ 5  ��������Ҳ����������ֵ����������,û���õ���������,�б׶�.���������ֵ̫��.����п��ܳ���int��ȡֵ��Χ
	
	/*int a = 5,b = 10;
	b = b - a;
	a = a + b;
	System.out.println("a=" + a + ",b=" + b);*/

	
	
	
	
	
	}
}
