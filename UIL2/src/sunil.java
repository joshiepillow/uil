import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sunil {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("sunil.dat"));
        int T = sc.nextInt();
        for (int i = 0; i < T; i++ ) {
            int R = sc.nextInt();
            int C = sc.nextInt();
            int[] rsums = new int[R];
            int[] csums = new int[C];
            int sum = 0;
            for (int r = 0; r < R; r++) {
                for (int c = 0; c < C; c++) {
                    int q = sc.nextInt();
                    rsums[r] += q;
                    csums[c]  += q;
                    sum += q;
                }
            }
            for (int r = 0; r < R; r++) {
                System.out.printf("%8.2f", rsums[r] / (double) C);

            }
            System.out.println();
            for (int r = 0; r < C; r++) {
                System.out.printf("%8.2f", csums[r] / (double) R);

            }
            System.out.println();
            System.out.printf("%8.2f\n", sum / (double) C / (double) R);
            System.out.println("=========================");
        }
    }
}
