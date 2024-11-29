import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class krishna {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("krishna.dat"));

        int[] arr = new int[101];
        for(int i = 1; i <= 100; i ++){
            arr[i] = i + arr[i-1];
        }

        int t = sc.nextInt();

        while(t -- > 0){
            int a = sc.nextInt(), b = sc.nextInt();
            int sum = 0;
            for(int i = a; i <= b; i ++){
                sum += arr[i];
            }
            System.out.println(sum);
        }
    }
}
