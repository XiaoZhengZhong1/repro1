/*switch(���ʽ) {			//���ʽ�ܽ��յĻ����������ͷ�Χ�� byte shar short int ֻҪ������ int ���͵Ķ�����. �����������͵Ŀ��Խ��� ö�� string�ַ���
		      case ֵ1��    //case �����ֵֻ���ǳ���,�����Ǳ���,�����������ε�case���ֵ,������ͬ.��˼����case 1  case 2 ���ǵ�һ �ڶ�����˼
				�����1;
				break;
			    case ֵ2��
				�����2;
				break;
			    ��
			    default��	//����ʡ��  ���鲻Ҫʡ��  ���Է����κ�λ��.�������ִ��.����������
				�����n+1;
				break;			//���һ������ʡ��  �����Ĳ���ʡ�� ʡ���˾ͻᴩ͸ ��˼������swit�������ֻ�����һ������case����������
									������һ�������������defau��������,���ʡ���м��break�ͻ����break�����case�����.��ʡ�Ծͻ�ȫ�����
			//switc���Ľ������� �������break ����}������						
 }*/



class Switch
{
	public static void main(String[] args) 
	{
	int x = 3,y = 4;//һ�α�ʶ����,�м�����ö���,�����ÿո�
	switch(x){
	case 1:
		x++;
	break;
	case 2:				//����switch���ı�׼��ʽ break;case:�����кܶ��
		y++;
	default:
		++y;	
	System.out.println("x=" + x + ",y=" + y);	//������ x=3,y=5 ��Ϊx����case1��case2 ����ִ������default ++y ����y=5
	break;
	}	
		
	  /*int x = 3,y = 4;
		switch(x){
		    default:  //��Ȼdefau��������,���������ִ��.����������
			x = 10;
			break;	//���ʡ�����break,�ᴩ͸,ִ�������++x �����ֵ����11
			case 1:
				++x;
				break;
		      case 2:
				y++;
		//�����ʡ����break
		}
	System.out.println(x);*/
	}
}
