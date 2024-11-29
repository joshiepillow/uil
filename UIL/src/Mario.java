import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mario {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("mario.dat"));
        int N  = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            String s = sc.next();
            if (x > s.length()) {
                System.out.println("error");
            }
            else if (x > (s.length() + 1)/2) {
                char[] t = s.toCharArray();
                for (int k = 0; k < t.length/2; k++) {
                    char temp = t[k];
                    t[k] = t[t.length - 1 - k];
                    t[t.length - 1 - k] = temp;
                }
                System.out.println(new String(t));
            }
            else {
                char[] a = s.substring(0, x).toCharArray();
                char[] b = s.substring(s.length()-x).toCharArray();
                String c = s.substring(x, s.length()-x);
                for (int k = 0; k < a.length/2; k++) {
                    char temp = a[k];
                    a[k] = a[a.length - 1 - k];
                    a[a.length - 1 - k] = temp;
                }
                for (int k = 0; k < b.length/2; k++) {
                    char temp = b[k];
                    b[k] = b[b.length - 1 - k];
                    b[b.length - 1 - k] = temp;
                }
                System.out.println(new String(b) + c + new String(a));
            }
        }

        System.out.println();
    }

}
