package firstProject;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		// ���� : ����� �Է�(10, 20)
		// 10 + 20 = 30 
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��Ͻÿ�...");
		num1 = sc.nextInt();
		System.out.println("���ڸ� �Է��Ͻÿ�...");
		num2 = sc.nextInt();
		
		result = num1 + num2;
		
		System.out.println("����� : " + result);
	}
}
