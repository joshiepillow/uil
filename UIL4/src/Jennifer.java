import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Jennifer {
    public static int gcd(int a, int b) {
        if (a == b) return a;
        if (b > a) return gcd(b, a);
        return gcd(b, a - b);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("jennifer.dat"));
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = gcd(b-a, a);
            System.out.println((b - a) / c + " " + a / c);
        }
    }
}