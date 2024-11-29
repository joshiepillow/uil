import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class shreya {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("shreya.dat"));

        int t = sc.nextInt();
        sc.nextLine();
        while(t -- > 0){
            String[] arr = sc.nextLine().split(" ");
            int[] array = new int[arr.length];
            for(int i = 0; i < arr.length; i ++){
                array[i] = Integer.parseInt(arr[i]);
            }
            int target = sc.nextInt();
            sc.nextLine();

            boolean[] dp = new boolean[target+1];
            dp[0] = true;

            for(int i = 0; i < array.length; i ++){
                for(int j = target; j >= 0; j --){
                    if(j + array[i] > target) continue;
                    dp[j + array[i]] |= dp[j];
                }
            }

            if(dp[target]) System.out.println("Business as usual.");
            else System.out.println("Dine and Dash.");
        }
    }
}
