import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Claudius {
    static int rows;
    static int columns;
    public static boolean valid(int r, int c) {
        return r >= 0 && c >= 0 && r < rows && c < rows;
    }
    
    static int[][] ADJ = {
            new int[]{1, 0},
            new int[]{-1, 0},
            new int[]{0, 1},
            new int[]{0, -1},
    };

    public static int[][] C(char[][] a) {
        int[][] s = new int[a.length][a[0].length];

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                s[i][j] = switch (a[i][j]) {
                    case 'M' -> 3;
                    case 'T' -> 2;
                    case '.' -> 1;
                    case 'R', 'V', 'A', 'B' -> -1;
                    case 'Q' -> {
                        for(var A : ADJ) {
                            int I = i + A[0];
                            int J = i + A[1];
                            if(valid(I, J) && a[I][J] == 'T') {
                                yield 3;
                            }
                        }
                        yield -1;
                    }
                    default -> throw new RuntimeException();
                };
            }
        }

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                if(a[i][j] == 'A') {
                    for(int di = -1; di <= 1; di++) {
                        for(int dj = -1; dj <= 1; dj++) {
                            if(valid(i + di, j+dj)) {

                            }

                        }
                    }
                }
            }
        }
        return s;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("claudius.dat"));
        int n = sc.nextInt();
        for (int i = 0 ; i < n; i++) {
            rows= sc.nextInt();
            columns = sc.nextInt();
            int h = sc.nextInt();
            char[][] data = new char[rows][columns];
            sc.nextLine();
            for (int r = 0 ; r < rows; r++) {
                data[r] = sc.nextLine().toCharArray();
            }

        }
    }
}