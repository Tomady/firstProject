package firstProject;

import java.util.Scanner;

public class JeongDoYoung {
	public static void main(String[] args) {
		String name = "0";
		int score_eng = 0;
		String score_math = "0";
		int score_mathInt = 0;
		int sum = 0;
		double avg = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��Ͻÿ�...");
		name = sc.nextLine();
		System.out.println("���������� �Է��Ͻÿ�...");
		score_eng = sc.nextInt();
		sc.nextLine();
		
		System.out.println("���������� �Է��Ͻÿ�...");
		score_math = sc.nextLine();
		if(score_math.equals("")) {
			score_math = "0";
		}
		score_mathInt = Integer.parseInt(score_math);
		
		sum = score_eng + score_mathInt;
		avg = (double)sum/2;
		
		System.out.printf("%s���� ��������:%d, ��������:%d, ����:%d, �������:%f\n", name, score_eng, score_mathInt, sum, avg);
		
	}
}
