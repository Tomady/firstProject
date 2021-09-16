package reference;

public class MethodExample2 {

	//�� ������ �Է� �޾Ƽ� �� ���� ���� ����ϴ� �޼ҵ�
	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("�� ���� ����: " + sum);
	}
	
	//�� ������ �Է� �޾Ƽ� �� ���� ���� ����ϴ� �޼ҵ�
	public static void multi(int n1, int n2) {
		int multi = n1 * n2;
		System.out.println("�� ���� ����: " + multi);
	}
	
	//���簢�� ���� ������ִ� �޼ҵ�.
	public static void getArea(double side) {
		double area = side * side;
		System.out.println("���簢���� ����: " + area);	
	}
	
	//�� �� �߿��� ū ���� ��ȯ ���ִ� �޼ҵ�.
	public static int getMax(int n1, int n2) {
		int result = n1 > n2 ? n1 : n2;
		
		return result;
	}
	
	//�� ���� �Է� �޾Ƽ� ù ��° ���� �� ��° ������ ���� ����� ��ȯ ���ִ� �޼ҵ�.(ù ��°/�� ��°)
	public static double divide(int n1, int n2) {
		double result = n1/n2;
		
		return result;
	}
	
	public static void main(String[] args) {
		sum(24, 55);
				
		int a = 45, b = 77;
		
		sum(a, b);
		multi(35, 88);
		getArea(3.5);
		
		int res = getMax(a, b);
		
		System.out.println("ū ����: " + res);
		
		double res1 = divide(12, 11);
		
		System.out.println("�� ���� ���� ���: " + res1);
	}
}
