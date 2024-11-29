import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Jacob {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("jacob.dat"));
        int N  = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            double ans = 3;
            int negative = 1;
            for (int j = 0; j < 2*n; j+=2) {
                ans += negative * 4.0 / (j + 2)/(j+3)/(j+4);
                negative *= -1;
            }
            System.out.printf("%.13f\n", ans);
        }
    }
}
