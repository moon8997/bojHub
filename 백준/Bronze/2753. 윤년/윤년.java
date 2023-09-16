import java.util.*;

public class Main {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();

		int answer = 0;
		
		if(a%4==0 && a%100!=0) {
			answer = 1;
		} else if(a%4==0 && a%400==0) {
			answer = 1;
		}
		
		System.out.println(answer);
	}
	
}