import java.io.File;
import java.util.Scanner;

public class Cynthia {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("cynthia.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ; i < N ;++i) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            System.out.printf("%,.2f", Math.max((x+y)*z, Math.max((x+z)*y, (y+z)*x))/2.0);
            if (i != N-1) System.out.println();
        }
        sc.close();
    }
}