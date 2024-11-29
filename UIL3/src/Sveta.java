import java.io.File;
import java.util.Scanner;

public class Sveta {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("dryrun.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        while (N-- > 0) {
            int d = 0, e = 0, f = 0;
            String l = sc.nextLine();
            String[] x = l.split("Bits=");
            int bits = Integer.parseInt(x[1]);
            String a = sc.nextLine();
            String[] as = a.split("Set to 1: ");
            if (as[1].contains("n/a")) d = 1;
            String b = sc.nextLine();
            String[] bs = a.split("Set to 0: ");
            if (bs[1].contains("n/a")) e = 1;
            String[] cs = a.split("Invert: ");
            if (cs[1].contains("n/a")) f = 1;
            if (d + e + f > 1) {
                System.out.println("This can not be done with a single bitwise operator.");
                continue;
            }

            if (d > 0) {
                int[] andBits;
                String[] abs = as[1].split(",");

            }

        }
        sc.close();
    }
}