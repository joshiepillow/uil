import java.io.File;
import java.util.Scanner;

public class Romina {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("romina.dat"));
        int t = sc.nextInt();

        while(t -- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] matrix = new int[n][m];
            boolean[][] visited = new boolean[n][m];

            for(int i = 0; i < n; i ++){
                for(int j = 0; j < m; j ++){
                    matrix[i][j] = sc.nextInt();
                }
            }

            int[] dx = new int[]{0, 1, 0, -1};
            int[] dy = new int[]{1, 0, -1, 0};

            int i = 0;
            int j = 0;

            int x = 0;

            while(!visited[i][j]){
                double total = 0;
                double cnt = 0;
                while(i >= 0 && i < n && j >= 0 && j < m && !visited[i][j]){
                    total += matrix[i][j];
                    cnt ++;
                    visited[i][j] = true;
                    i += dx[x];
                    j += dy[x];

                }

                i -= dx[x];
                j -= dy[x];

                System.out.printf("%.2f ", total / cnt);

                x = (x + 1) % 4;

                i += dx[x];
                j += dy[x];
            }

            if(t != 0) System.out.println();


        }

        sc.close();
    }
}