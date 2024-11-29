import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class vanessa {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("vanessa.dat"));
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            String[] arr = sc.nextLine().split(",");
            int[] ar = new int[arr.length];
            for (int j = 0; j < arr.length; j++) {
                ar[j] = Integer.parseInt(arr[j]);
            }
            int s= sc.nextInt();
            int[] arr2 = new int[s + 1000];
            arr2[0] = 1;
            for (int k =0; k< arr.length; k++) {
                for (int l = 0; l < s; l++) {
                    arr2[l + ar[k]] += arr2[l];
                }
            }
            System.out.println(arr2[s]);
            //System.out.println(Arrays.toString(arr2));
            sc.nextLine();
            sc.nextLine();
        }
    }
}
