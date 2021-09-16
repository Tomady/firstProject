package reference;

public class EnhanceForExample {
	public static void main(String[] args) {
		String[] strAry = null;
		strAry = new String[5];	//null, null, null, null, null
		strAry = new String[] {"Hong", "Park", "Choi", "Kim", "Hwang"};
		int[] scores = {50, 70, 80, 60};
		int sum = 0;
		
		
		System.out.println(strAry.length);
		System.out.println();
		
		strAry[2] = "Hong";
		
		for(int i=0; i<strAry.length; i++) {
			if(strAry[i].equals("Hong")) {
				System.out.println(strAry[i]);
			}
		}
		
		System.out.println("===�ٽ�===");
		
		//Enhanced for
		for(String name : strAry) {
			System.out.println(name);
		}
		
		System.out.println();
		
		for(int score : scores) {
			sum += score;
		}
		
		//�л� 3��. 4.2, 3.5, 2.8������ ���� �� �ִ� �迭 ����
		//�հ踦 ���� �� �ֵ��� ����.
		//����� ����ؼ� avg������ ����
		//��� -> �л����: [����]�Դϴ�. 
		double[] student_scores = {4.2, 3.5, 2.8};
		double d_sum = 0;
		double avg = 0;
		
		for(double sc : student_scores) {
			d_sum += sc;
		}
		
		avg = d_sum/student_scores.length;
		
		System.out.printf("�л����: %.2f�Դϴ�.\n", avg);
	}
}
