package reference;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;
		int cnt = 0;
		
		//
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}//End_for
		
		System.out.println("��1.");
		System.out.println();
		
		// 1-10���� �ݺ�, ¦���� ���.
		for(int i=2; i<11; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}//End_if
		}//End_for
		
		System.out.println("��2.");
		System.out.println();
		
		// 1-10���� �ݺ�, Ȧ���� ���ϱ�
		for(int i=1; i<11; i++) {
			if(i%2 == 1) {
				sum += i;
			}//End_if
		}//End_for
		
		System.out.println("�հ�: " + sum);
		System.out.println("��3.");
		System.out.println();
		
		// 1-10���� �ݺ�, sum�� ���� 20�� �Ѿ�� �׶��� Ƚ��. 
		sum = 0;
		
		for(int i=1; i<11; i++) {
			if(sum > 20) {
				cnt = i;
				break;
			}//End_if
			
			sum += i;
		}//End_for
		
		System.out.println("Ƚ��: " + cnt);
		
	}//End_main
}//End_class
