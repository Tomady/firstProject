package reference;

public class ArrayExample2 {
	public static void main(String[] args) {
		//1-10���� ���� ���� ����.
		//�л� 10��
		int sum = 0;
		int[] scores = new int[10];
		
		System.out.println(scores.length);
		System.out.println();
		
		for(int i=0; i<scores.length; i++) {
			int temp = (int)(Math.random() * 10) + 1;
			scores[i] = temp;
		}
		
		//���
		for(int i=0; i<scores.length; i++) {
			System.out.printf("scores[%d] => %d\n", i, scores[i]);
		}
		
		System.out.println("��!.");
		System.out.println();
		
		//�迭�� ����ִ� ��ҵ��� ��.
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("�迭�� �հ�: " + sum);
		System.out.println("��2.");
		System.out.println();
		
		//�迭�� ����� 5���� ū ���� �հ�.
		sum = 0;
		for(int i=0; i<scores.length; i++) {
			if(scores[i] > 5) {
				sum += scores[i];
			}
		}
		
		System.out.println("�迭 �� 5���� ū �� �հ�: " + sum);
		System.out.println("��3.");
		System.out.println();
		
		//�迭 ����� ¦����° ���� �հ�.
		sum = 0;
		for(int i=0; i<scores.length; i++) {
			if(i%2==0) {
				sum += scores[i];
			}
		}
		
		System.out.println("¦���迭 ��: " + sum);
		System.out.println("��4.");
		
	}
}
