package firstProject;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		//���������Է�:
		//���������Է�:
		//�̸��Է�:
		//ȫ�浿���� ����, ���������� ����?, ����� ? �Դϴ� printf���
		
		int score_eng = 0;
		int score_math = 0;
		int sum = 0;
		double avg = 0;
		String name = "������";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� �Է�");
		score_eng = sc.nextInt();
		System.out.println("�������� �Է�");
		score_math = sc.nextInt();
		
		sum = score_eng + score_math;
		avg = (double)sum/2;
		
		System.out.printf("%s���� ����,���������� ���� %d, ����� %f �Դϴ�.", name, sum, avg);
		
	}

}
