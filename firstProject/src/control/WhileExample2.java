package control;

import java.util.Scanner;

public class WhileExample2 {
	public static void main(String[] args) {
		String name = "������";
		String age = "20";
		String phone = "010-1234-1234";
		int push_num = 0;
		boolean isOk = true;
		
		// ������� �Է��� �޾�
		// 1�� ������ �̸��� ���
		// 2�� ������ ���� ���
		// 3�� ������ ����ó ���
		// 4�� ������ �ݺ��� ����.
		
		Scanner sc = new Scanner(System.in);
		
		while(isOk) {
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("1.�̸� 2.���� 3.����ó 4.����");
			push_num = sc.nextInt();
			
			switch(push_num) {
			case 1:
				System.out.println("�̸�: " + name);
				System.out.println();
				break;
			case 2:
				System.out.println("����: " + age);
				System.out.println();
				break;
			case 3:
				System.out.println("����ó: " + phone);
				System.out.println();
				break;
			case 4:
				System.out.println("����...");
				isOk = false;
				break;
			default:
				break;
			}
		}
		
		System.out.println("��.");
	}
}
