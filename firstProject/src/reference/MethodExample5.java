package reference;

public class MethodExample5 {
	public static void main(String[] args) {
		int[] scores = { 88, 67, 92, 73, 58 };

		// �ּҰ��� ���ϴ� �ڵ�.
		int minVal = 100;
		boolean isTrue = false;

		for (int i = 0; i < scores.length; i++) {
			isTrue = minVal > scores[i];

			if (isTrue) {
				minVal = scores[i];
			}
		}
		System.out.println("�ּҰ�1: " + minVal);
		System.out.println("��1.");

		// Method�� ���� �ּҰ��� ���ϴ� �ڵ�.
		minVal = getMinValue(scores);
		System.out.println("�ּҰ�2: " + minVal);
		System.out.println("��2.");

	}

	public static int getMinValue(int[] ary) {
		// �ּҰ� ���ϱ�
		int minVal = 100;
		boolean isTrue = false;

		for (int i = 0; i < ary.length; i++) {
			isTrue = minVal > ary[i];

			if (isTrue) {
				minVal = ary[i];
			}
		}

		return minVal;
	}
}
