package control;

public class ConditionExe {
	public static void main(String[] args) {
		// �� ���� 60, 70
		// �� ���� ���� ��� 100�� �Ѿ�� �հ�, ���հ� ���
		// ��.
		int num1 = 60;
		int num2 = 70;

		if (num1+num2 > 100) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}

		System.out.println("��.");

		// �� ���� ���ؼ� ¦���̸� ¦��, Ȧ���̸� Ȧ�� ���
		// 2��° ��.
		if ((num1*num2)%2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}

		System.out.println("2��° ��.");

		// num1 10�� ���� �� 2�� ����̸� 2�� ���, 3�� ����̸� 3�� ���, 2�� ���, 3�� ��� ���
		num1 = 6;

		if (num1%2 == 0 && num1%3 == 0) {
			System.out.println("2, 3�� ��������Դϴ�.");
		} else if (num1%2 == 0) {
			System.out.println("2�� ����Դϴ�.");
		} else if (num1%3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		}

		System.out.println("3��° ��.");
		System.out.println();
		
		
		int randomValue = (int)(Math.random() * 6) + 1;
//		System.out.println(randomValue);
		
		switch(randomValue) {
		case 1:
			System.out.println("1�� ���Խ��ϴ�");
			break;
		case 2:
			System.out.println("2�� ���Խ��ϴ�");
			break;
		case 3:
			System.out.println("3�� ���Խ��ϴ�");
			break;
		case 4:
			System.out.println("4�� ���Խ��ϴ�");
			break;
		case 5:
			System.out.println("5�� ���Խ��ϴ�");
			break;
		case 6:
			System.out.println("6�� ���Խ��ϴ�");
			break;
		default:
			break;	
		}
		
		System.out.println("4�� ��.");
		System.out.println();
		
		//0~99������ ������ �� 90�� �̻�a 80��b
		
		int randomNum = (int)(Math.random() * 100);
		
		if(randomNum >= 90) {
			System.out.println("A����");
		}else if(randomNum >= 80) {
			System.out.println("B����");
		}else if(randomNum >= 70) {
			System.out.println("C����");
		}else if(randomNum >= 60) {
			System.out.println("D����");
		}else {
			System.out.println("F����");
		}
		
		System.out.println("5�� ��.");
		System.out.println();
		
		switch(randomNum/10) {
		case 9:
			System.out.println("A�����Դϴ�.");
			break;
		case 8:
			System.out.println("B�����Դϴ�.");
			break;
		case 7:
			System.out.println("C�����Դϴ�.");
			break;
		case 6:
			System.out.println("D�����Դϴ�.");
			break;
		default:
			System.out.println("F�����Դϴ�.");
		}
		
		System.out.println(randomNum);
	}
}
