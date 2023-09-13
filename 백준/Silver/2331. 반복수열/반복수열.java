import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int p = sc.nextInt();

        int aLen = 0;

        boolean br = false;

        ArrayList<Integer> array = new ArrayList<>();

        while(true){
            array.add(a);

            int temp = 0;
            aLen = Integer.toString(a).length();

            for(int i=0; i<aLen; i++){
                temp += (int)Math.pow(Character.getNumericValue(Integer.toString(a).charAt(i)), p);
            }

            for(int i=0; i<array.size(); i++){
                if(temp == array.get(i)){
                    br = true;
                    System.out.println(i);

                }

            }

            if(br){
                break;
            } else {
                a = temp;
            }

        }


    }

}
