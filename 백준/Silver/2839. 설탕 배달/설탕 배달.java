import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Scanner 객체를 생성합니다
		Scanner sc = new Scanner(System.in); 
		
		int sugar = sc.nextInt();

		int count = minSugarBags(sugar);
		
		System.out.println(count);
		
		
	}
	
	
	public static int minSugarBags(int n) {
        // 5킬로그램 봉지를 최대한 많이 사용하도록 함
        int bag5 = n / 5;  // 5킬로그램 봉지 개수 계산
        int remainingWeight = n % 5;  // 남은 무게 계산

        // 남은 무게를 3킬로그램 봉지로 채우는 데 최적의 조합을 찾음
        while (bag5 >= 0) {  // 5킬로그램 봉지 개수가 0 이상인 동안
            if (remainingWeight % 3 == 0) {
                // 5킬로그램 봉지와 3킬로그램 봉지로 남은 무게를 채울 수 있는 경우
                int bag3 = remainingWeight / 3;  // 3킬로그램 봉지 개수 계산
                return bag5 + bag3;  // 봉지 개수 합을 반환
            }
            bag5 -= 1;  // 5킬로그램 봉지 개수를 줄이고
            remainingWeight += 5;  // 남은 무게에 5킬로그램을 추가하여 5킬로그램 봉지 개수를 줄여나감
        }

        // 봉지 조합을 찾지 못한 경우
        return -1;  // 봉지 조합을 찾을 수 없으므로 -1을 반환
    }

}