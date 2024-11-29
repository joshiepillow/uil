import java.io.File;
import java.util.Scanner;

public class Neeraj {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("neeraj.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ; i < N ;++i) {
            String s = sc.nextLine();
            long T = Long.parseLong(s.substring(1));
            int p5 = s.length() -1;
            int p2 = s.length() - 1;
            while (p5 > 0) {
                if (T%5 == 0 ){T/=5;p5--;}
                else break;
            }
            while (p2 > 0) {
                if (T%2 == 0 ){T/=2;p2--;}
                else break;
            }
            System.out.printf("%s is equal to %d/%d", s,T,(long)(Math.pow(5,p5)*Math.pow(2,p2)));
            if (i != N-1) System.out.println();
        }

        sc.close();
    }
}