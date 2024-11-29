import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Shivani {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("shivani.dat"));
        int N  = sc.nextInt();
        for (int i = 0; i < N; i++) {
            BigInteger n = new BigInteger(sc.next());
            BigInteger t = n.multiply(n.add(new BigInteger("1"))).multiply(n.add(new BigInteger("2"))).divide(new BigInteger("3")).divide(new BigInteger("2"));
            System.out.println(t);
        }
    }
}
