package control;

public class WhileExe {
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		
		// while ������ 1~10���� ���.
		while(i<11) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("��1.");
		System.out.println();
		
		// while ������ ¦�� ���
		i=0;
		while(i<10) {
			i+=2;
			System.out.println(i);
		}
		
		System.out.println("��2.");
		System.out.println();
		
		// while ������ Ȧ�� ���
		i=1;
		while(i<9) {
			i+=2;
			System.out.println(i);
		}
		
		System.out.println("��3.");
		System.out.println();
		
		// while ������ 1~10 ��.
		i=1;
		while(i<11) {
			sum+=i;
			i++;
		}
		
		System.out.println(sum);
		System.out.println("��4.");
		
	}
}
