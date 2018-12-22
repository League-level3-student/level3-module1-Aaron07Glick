
public class ForLoop {
	public static void main(String[] args) {
		//1
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		//2
		for (int i = 100; i > -1; i--) {
			System.out.println(i);
		}
		//3
		for (int i = 0; i < 101; i+=2) {
			System.out.println(i);	
		}
		//4
		for (int i = 1; i < 99; i+=2) {
			System.out.println(i);
		}
		for (int i = 0; i < 101; i++) {
			System.out.print(i);
			if (i % 2 == 0) {
				System.out.println("even");
			}
			else if (i % 2 == 1){
				System.out.println("odd");
			}
		}
		
	}
}
