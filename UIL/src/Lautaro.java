import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lautaro {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("lautaro.dat"));
        int N  = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String pn = sc.nextLine();
            if (solve(pn)) System.out.println("Valid Phone Number.");
            else System.out.println("No Calls for You.");
        }

        System.out.println();
    }
    static boolean solve(String s) {
        if (s.length() != 14) return false;
        if (s.charAt(0) != '(') return false;
        try {
            Integer.parseInt(s.substring(1,4));
        } catch (Exception e) {
            return false;
        }
        if (s.charAt(4) != ')') return false;
        if (s.charAt(5) != ' ') return false;
        try {
            Integer.parseInt(s.substring(6,9));
        } catch (Exception e) {
            return false;
        }
        if (s.charAt(9) != '-') return false;
        try {
            Integer.parseInt(s.substring(10));
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
