package control;

public class DoWhileExe {
	public static void main(String[] args) {
		boolean run = false;
		int i=1;
		int sum = 0;
		int r_num = 0;
		
		// do_while�������� 1���� 10���� ���
		// ��.1
		do {
			System.out.println(i);
			i++;
		}while(i<11);	//End_do_while
		
		System.out.println("��1.");
		System.out.println();
		
		// ¦���� ��� continue ���
		i=1;
		
		do {
			i++;
			
			if(i%2 == 1) {
				continue;
			}	//End_if
			
			System.out.println(i);
			
		}while(i<11);	//End_do_while
		
		System.out.println("��2.");
		System.out.println();
		
		// Ȧ���� ���
		i=0;
		
		do {
			i++;
			
			if(i%2 == 0) {
				continue;
			}//End_if
			
			sum += i;
			
		}while(i<10);	//End_do_while
		
		System.out.println("Ȧ�� �հ�: " + sum);
		System.out.println("��3.");
		System.out.println();
		
		// ������ ���� 1~10;
		// sum ���� 100���� ū ���� �Ǿ��� ��
		// �� ���� sum ���� ���... �� �� ������ �ߴ��� ���
		
		sum = 0;
		i = 0;
		
		do {
			r_num = (int)(Math.random()*10) + 1;
			sum += r_num;
			i++;
		}while(sum < 100);//End_do_while
		
		System.out.printf("sum ��: %d, ���� ��: %d\n", sum, i);
		System.out.println("��4.");
		
		
		
	}//End_main
}//End_class
