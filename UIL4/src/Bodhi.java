import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bodhi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner x = new Scanner(new File("bodhi.dat"));
        int n = x.nextInt();
        x.nextLine();
        for (int i = 0; i < n; i++) {
            double pv = x.nextDouble();
            double apr = x.nextDouble() / 100;

            double cp = x.nextDouble();
            double N = x.nextDouble();
            double fv = pv * Math.pow((1 + apr / cp), N);
            double profit = fv - pv;
            System.out.print("$");
            System.out.printf("%.2f", fv);
            System.out.print(" $");
            System.out.printf("%.2f", profit);
            System.out.println();
        }
    }
}