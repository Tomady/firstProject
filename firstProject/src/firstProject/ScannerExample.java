package firstProject;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name;
		String hobby;
		int age = 0;
		
		System.out.println("�̸��� �Է��ϼ���...");
		name = scn.nextLine();	// 1ch Enter.
		System.out.println("���̸� �Է��ϼ���...");
		age = scn.nextInt();	// 20 Enter.
//		scn.nextLine();	//nextInt enter�� ����
		System.out.println("��̸� �Է��ϼ���...");
		hobby = scn.nextLine();
		System.out.println("[�Է��� ��]");
		System.out.printf("�̸�: %s, ����: %d, ���: %s", name, age, hobby);
	}

}
