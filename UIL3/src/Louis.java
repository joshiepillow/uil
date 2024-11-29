import java.io.File;
import java.util.Scanner;

public class Louis {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("louis.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ; i < N ;++i) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            if (a == 0) {
                System.out.print("Function is not quadratic");
            } else {
                double det = b * b - 4 * a * c;
                double crit = -b/2.0/a;
                if (det < 0) System.out.print("Function has no roots");
                else {
                    double q = crit - Math.sqrt(det)/2/a;
                    double q2 = crit + Math.sqrt(det)/2/a;
                    if (Math.abs(q - q2) < 0.0008) System.out.printf("Function has 1 root at %.3f", crit);
                    else {
                        System.out.printf("Function has 2 roots at %.3f and %.3f", crit - Math.sqrt(det)/2/a, crit + Math.sqrt(det)/2/a);

                    }
                }

                if (a > 0) System.out.printf(" with min of %.3f at %.3f", a*crit*crit + b*crit+c, crit);
                if (a < 0) System.out.printf(" with max of %.3f at %.3f", a*crit*crit + b*crit+c, crit);
            }
            if (i != N-1) System.out.println();
        }
        sc.close();
    }
}