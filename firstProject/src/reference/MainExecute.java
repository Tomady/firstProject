package reference;

import java.util.Scanner;

public class MainExecute {
	public static void main(String[] args) {
		// 1.�л��� ����. 2.�л��̸� �Է� 3.��� 4.����
		String[] student = null;
		int num = 0;

		while(true) {
			showMenu();

			num = Integer.parseInt(get_str());
			
			if (num == 1) {	//1.�л��� ����
				student = createSutdent(student);
				
			} else if (num == 2) {	//2.�л��̸� �Է�
				input_name(student);
				
			} else if (num == 3) {
				print_sutdent(student);	//3.�л����
				
			} else if (num == 4) {	//4.����
				System.out.println("���α׷��� �����մϴ�.");
				break;
				
			} else {	//����ó��
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
			
			System.out.println("==============================");
			System.out.println();
		}
	}

	// �޴� ����ȭ��.
	public static void showMenu() {
		System.out.println("1.�л��ο� ���� 2.�л��̸� �Է� 3.��ü ��� 4.����");
	}

	// 1.�л��� ����
	public static String[] createSutdent(String[] student) {
		int student_num;
		
		System.out.println("�л� ���� �Է��ϼ���.");
		student_num = Integer.parseInt(get_str());
		student = new String[student_num];
		
		return student;
	}

	// 2.�л��̸� �Է�
	public static void input_name(String[] student) {
		if(student == null) {
			System.out.println("�л� ���� ���� �Է��ϼ���.");
			return;
		}
		
		for(int i=0; i<student.length; i++) {
			System.out.printf("%d��° �л��� �̸��� �Է��ϼ���.\n", i+1);
			student[i] = get_str();
		}
	}

	// 3.���
	public static void print_sutdent(String[] student) {
		if(student == null) {
			System.out.println("�л� ���� ���� �Է��ϼ���.");
			return;
		}
		
		for(int i=0; i<student.length; i++) {
			System.out.printf("%d��° �л��� �̸� : %s\n", i+1, student[i]);
		}
	}

	// �޴� ���� �Է� �ޱ�
	public static String get_str() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		return str;
	}
}
