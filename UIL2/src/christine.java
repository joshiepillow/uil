import java.util.*;
import java.io.*;
public class christine {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("christine.dat"));
        int a, b ,c, d, e, f;
        a = sc.nextInt();
        b = sc.nextInt();
        c= sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();

        dos(a, b);
        dos(b, c);
        dos(c, d);
        dos(d, e);
        dos(e, f);
    }

    static void dos(int a, int b) {
        if (a <= b)
            for (int i = a; i <= b; i++)
                System.out.print(i + " ");
        else
            for (int i = a; i >= b; i--)
                System.out.print(i + " ");
        System.out.println();
    }
}
