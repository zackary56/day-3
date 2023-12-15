import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
		int n = 0;
		for (int i = 2; i< n; i++) {
			if (n<= 3) {
				System.out.println("prime");
				break;
			}else if( n%i ==0) {
				System.out.println("not prime");
				break;
			}else{
				System.out.println("prime");
			
		}		
		}
	}
}

