import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Petra {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("petra.dat"));
        int N  = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int p = sc.nextInt();
            char[] t = (p+"").toCharArray();
            for (int k = 0; k < t.length/2; k++) {
                char temp = t[k];
                t[k] = t[t.length - 1 - k];
                t[t.length - 1 - k] = temp;
            }
            System.out.println(gcd(p, Integer.parseInt(new String(t))));
        }
    }
    static int gcd (int a, int b) {
        if (a == b) return a;
        if (a > b) return gcd(a - b, b);
        return gcd(b, a);
    }
}
