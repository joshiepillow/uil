import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Emily {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("emily.dat"));
        int N  = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            char c = sc.next().charAt(0);
            int b = sc.nextInt();
            System.out.print(a  + " " + c + " " + b + " = ");
            if (c == '+') {
                System.out.println(a + b);
            }
            if (c == '-') {
                System.out.println(a - b);
            }
            if (c == '*') {
                System.out.println(a * b);
            }
            if (c == 'x') {
                System.out.println(a * b);
            }
            if (c == 'X') {
                System.out.println(a * b);
            }
            if (c == '/') {
                System.out.println(a / b + " remainder " + a%b);
            }
        }
    }
}
