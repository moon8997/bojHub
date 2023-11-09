import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        int totalLength = 0;

        int[] arr1 = new int[n-1];
        int[] arr = new int[n];
        for(int i=0; i<n-1; i++){
            arr1[i] = sc.nextInt();
            totalLength = totalLength+arr1[i];
        }
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] copy = arr.clone();
        copy[copy.length-1] = Integer.MAX_VALUE;
        Arrays.sort(copy);

        int minPrice = copy[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] == minPrice){
                sum = sum + (totalLength * minPrice);
                break;
            } else {
                totalLength = totalLength - arr1[i];
                sum = sum+(arr[i]*arr1[i]);
            }
        }

        System.out.println(sum);
    }
}