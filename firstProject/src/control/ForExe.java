package control;

public class ForExe {

	public static void main(String[] args) {
		int sum=0;
		
		// 1~10 ���
		// ��1.
		
		for(int i=1; i<11; i++) {
			System.out.println(i);
		}
		
		System.out.println("��1.");
		System.out.println();
		
		// 1~10 �߿��� ¦�� ���
		for(int i=2; i<11; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("��2.");
		System.out.println();
		
		// 1~10 �߿��� Ȧ�� ���
		for(int i=1; i<11; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("��3.");
		System.out.println();
		
		// 1~10���� ���� ���ϵ���. => 1
		for(int i=1; i<11; i++) {
			sum += i;
		}		
		
		System.out.printf("�հ�: %d\n", sum);
		System.out.println("��4.");
		System.out.println();
	}
}
