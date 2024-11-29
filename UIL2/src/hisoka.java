import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class hisoka {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("hisoka.dat"));
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            double mpay = sc.nextDouble();
            double MPR = sc.nextDouble() / 12 / 100;
            int months = sc.nextInt() * 12;
            double r1 = mpay * months;
            System.out.printf("%.2f ", r1);
            double totalinterest = mpay * ((Math.pow(1 + MPR, months)) - 1) / MPR - r1;
            System.out.printf("%.2f ", totalinterest);
            System.out.printf("%.2f\n", mpay * ((Math.pow(1 + MPR, months)) - 1) / MPR);
        }
    }
}
