class Solution {
    
    static int gcd;
    static int lcm;
    
    public int[] solution(int n, int m) {
        gcd(n,m);
        lcm(n,m,gcd);
        int[] answer = {gcd, lcm};
        return answer;
    }

    static void gcd(int a, int b) {
	    while (b != 0) {
	        int temp = b;
	        b = a % b;
	        a = temp;
	    }
	    gcd = a;
	}

	static void lcm(int a, int b, int c) {
		lcm = (a*b)/c;
	}
    
}
