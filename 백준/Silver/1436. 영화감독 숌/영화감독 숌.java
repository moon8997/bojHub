import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
        
		int a = 666;
		
		int n = sc.nextInt();
		

		int cnt = 1;
	
		while(cnt!=n) {
			a++;
			if(String.valueOf(a).contains("666")) {
				cnt++;
			}
			
		}
		
		System.out.println(a);
		
	}
	

}