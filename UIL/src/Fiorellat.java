import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fiorellat {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("fiorella.dat"));
        int N  = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int w = sc.nextInt(), x=sc.nextInt(), y = sc.nextInt(),  z=sc.nextInt(), G = sc.nextInt();
            double temp = G;
            temp -= z;
            temp /= (double) w;
            temp /= (double) y;
            System.out.println((int) (Math.log(temp)/Math.log(x)));
        }
    }
}
