package reference;

import java.util.Scanner;

public class AppMain {
	public static void main(String[] args) {
		// �л������� ���� �л����� �迭.
		// 1.�л��ο� ����, 2.�л�����, 3.��ü����Ʈ, 4.�м�:���, �ְ���, 5.����
		int[] scores = null;

		while (true) {
			showMenu();

			int choice = readInt("��ȣ�� �����ϼ���>>");

			if (choice == 1) {
				int size = createStudent();
				scores = new int[size];
				
			} else if (choice == 2) {
				inputValue(scores);

			} else if (choice == 3) {
				showList(scores);

			} else if (choice == 4) {
				analysis(scores);

			} else if (choice == 5) {
				break;
				
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
			System.out.println("==============================");
			System.out.println();
		}

		System.out.println("��.");

	}

	public static void showMenu() {
		System.out.println("1.�л��ο� ����, 2.�л�����, 3.��ü����Ʈ, 4.�м�:���, �ְ���, 5.����");
	}

	public static int createStudent() {
		int cnt = readInt("�л� ���� �Է��ϼ���.");
		
		return cnt;
	}

	public static void inputValue(int[] ary) {
		if (ary == null) {
			System.out.println("���� �л����� �Է��ϼ���.");

		} else {
			for (int i = 0; i < ary.length; i++) {
				ary[i] = readInt("�л������� �Է��ϼ���.");
			}
		}
	}

	public static void showList(int[] ary) {
		if (ary == null) {
			System.out.println("���� �л����� �Է��ϼ���.");

		} else {
			for (int i = 0; i < ary.length; i++) {
				// scores[0] => 88 �������� ���.
				System.out.printf("scores[%d] => %d\n", i, ary[i]);
			}
		}
	}

	public static void analysis(int[] ary) {
		// ���, �ְ��� => �ܼ�.
		if (ary == null) {
			System.out.println("���� �л����� �Է��ϼ���.");

		} else {
			// ��� ���ϱ�
			int sum = 0;
			double avg = 0;

			for (int num : ary) {
				sum += num;
			}

			avg = (double) sum / ary.length;

			// �ְ��� ���ϱ�.
			int maxVal = 0;

			for (int num : ary) {
				maxVal = maxVal < num ? num : maxVal;
			}

			System.out.printf("���:%.2f , �ְ���: %d\n", avg, maxVal);
		}
	}

	public static int readInt(String msg) {
		int menu = 0;
		Scanner sc = new Scanner(System.in);

		// ����ó��
		try {
			System.out.println(msg);
			menu = sc.nextInt();
		} catch (NumberFormatException e) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �����Է�.");
		}

		return menu;
	}
}
