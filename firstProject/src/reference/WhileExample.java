package reference;

public class WhileExample {
	public static void main(String[] args) {
		// while �ݺ���.
		int i = 1;
		boolean run = true;
		
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		// 1-10���� ¦���� ���.
		i = 1;
		while(run) {
			if(i%2 == 0) {
				System.out.println(i);
			}
			
			if(i == 11) {
				run = false;
			}
			
			i++;
		}

		i=1;
		while(true) {
			if(i == 11) {
				break;
			}
			i++;
		}
		
	}
}
