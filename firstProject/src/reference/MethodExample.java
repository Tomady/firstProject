package reference;

public class MethodExample {
	public static void main(String[] args) {
//		�񸸵� ������.
//		bmi = ������ / (Ű*Ű);
//		bmi < 18.5 ��ü��.
//		18.5 ~ 23 ����.
//		23 ~ 25 ��ü��.
//		25 ~ 30 ��.
//		30 ~ ����.
		
		double weight = 72.5, height = 1.75;
		
		check_BMI(weight, height);	//�޼ҵ� ����.
		check_BMI(65.8, 1.73);
		
	}
	
	//�޼ҵ带 ������ ��, �Ű�����.
	public static void check_BMI(double weight, double height) {
		double bmi = 0;
		
		bmi = weight / (height*height);
		
		if(bmi < 18.5) {
			System.out.println("��ü��.");
		}else if(bmi <= 23) {
			System.out.println("����.");
		}else if(bmi <= 25) {
			System.out.println("��ü��.");
		}else if(bmi <= 30) {
			System.out.println("��.");
		}else {
			System.out.println("����. �ǻ�� ����ϼ���.");
		}
	}
}
