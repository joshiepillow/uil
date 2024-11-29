import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Garold {
    private static char s(char[][] g, int dx, int dy) {
        for(int i = 0; i < 3; i++) {
            char c = g[i+ dx][dy];
            for(int j = 0; j < 3; j++) {
                if(g[i + dx][dy + j] != c) {
                    c = '.';
                    break;
                }
            }

            if(c != '.')
                return c;
        }

        for(int i = 0; i < 3; i++) {
            char c = g[dx][dy + i];
            for(int j = 0; j < 3; j++) {
                if(g[j + dx][dy + i] != c) {
                    c = '.';
                    break;
                }
            }

            if(c != '.')
                return c;
        }

        if(g[dx][dy] == g[dx + 1][dy + 1] && g[dx][dy] == g[dx + 2][dy + 2] && g[dx][dy] != '.') {
            return g[dx][dy];
        }

        if(g[dx + 2][dy] == g[dx + 1][dy + 1] && g[dx][dy + 2] == g[dx + 1][dy + 1] && g[dx + 1][dy + 1] != '.') {
            return g[dx + 1][dy + 1];
        }

        return '.';
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("garold.dat"));
        int n = sc.nextInt(); sc.nextLine();

        while(n-- != 0) {
            var g = new char[][]{
                    sc.nextLine().toCharArray(),
                    sc.nextLine().toCharArray(),
                    sc.nextLine().toCharArray(),
                    sc.nextLine().toCharArray(),
                    sc.nextLine().toCharArray(),
                    sc.nextLine().toCharArray(),
                    sc.nextLine().toCharArray(),
                    sc.nextLine().toCharArray(),
                    sc.nextLine().toCharArray(),
            };

            var r = new char[3][3];

            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    r[i][j] = s(g, i * 3, j * 3);
                }
            }


            var w = s(r, 0, 0);

            if(w == '.') {
                System.out.println("Cat's Game.");
            } else {
                System.out.println("Player " + w + " Won.");
            }

            System.out.println(r[0]);
            System.out.println(r[1]);
            System.out.println(r[2]);
        }
    }
}