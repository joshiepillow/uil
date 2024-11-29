import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tushar {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("tushar.dat"));
        int X  = sc.nextInt();
        for (int t = 0; t < X; t++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int[][] values = new int[N][M];
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    values[j][i] = sc.nextInt();
                }
            }
            for (int i =0 ; i < N; i++) {
                int x = i; int y = 0;
                int total = 0; double count = 0;
                while( x < N && y < M) {
                    total += values[x][y];
                    x++; y++; count++;
                }
                System.out.printf("%.2f ", total/count);
            }
            for (int i =1 ; i < M; i++) {
                int x = 0; int y = i;
                int total = 0; double count = 0;
                while( x < N && y < M) {
                    total += values[x][y];
                    x++; y++; count++;
                }
                System.out.printf("%.2f ", total/count);
            }
            System.out.println();
        }
    }
}
