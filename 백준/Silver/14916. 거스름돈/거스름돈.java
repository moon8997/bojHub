import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 5;
        int b = 2;
        
        if(n%a==0) {
        	System.out.print(n/a);
        } else {
        	int count = 0;
        	boolean q = false;
        	
        	while(n>=2) {
        		n-=2;
        		count++;
        		if(n%5==0) {
        			q=true;
        			break;
        		}
        	}
        	
        	if(!q) {
        		System.out.println(-1);
        	} else {
        		count = count + n/a;
        		System.out.println(count);
        	}
        	
        	
        }
    }
}
