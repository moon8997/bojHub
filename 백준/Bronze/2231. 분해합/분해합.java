import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
		int i = 0;
		while(true) {
			int sum = i;
			
			String strNum = Integer.toString(i);
			int[] arrNum = new int[strNum.length()];
			for (int j = 0; j < strNum.length(); j++) {
				arrNum[j] = strNum.charAt(j) - '0';
				sum += arrNum[j];
			}
			if(sum==n)
				break;
			i++;
			if(i==n) {
				i = 0;
				break;
			}
		}
		
		
		System.out.println(i);
		
	}
	

}