import java.util.Scanner;
class ifxt2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int z = sc.nextInt();
	if (z == 1)	{System.out.println("����7000-9000");
	}
	
	
	if (z == 2) {System.out.println("����9000--12000");					
	}
	
	
	if (z == 3) {System.out.println("����12000--15000");
	}
	if (z > 3 | z <1){System.out.println("�Բ������������������");
	}
	}
}
//����ϰ�����˼���Сʱ ԭ��1 �����˲���Ҫ��else  2  ���˴����� 3 ��& �� ��| �������