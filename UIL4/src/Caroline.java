import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Caroline {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("caroline.dat"));
        int n  = sc.nextInt(); sc.nextLine();
        while(n-- != 0) {
            final var s = Arrays.stream(sc.nextLine().split("\\s+"))
                    .filter(DS -> !DS.isEmpty())
                    .map(Integer::parseInt)
                    .toList();

            var e = s.stream().filter(x -> x % 2 == 0).reduce(Integer::sum).orElse(0).intValue();
            var o = s.stream().filter(x -> x % 2 == 1).reduce(Integer::sum).orElse(0).intValue();

            if(e == o) {
                System.out.println("It's a tie!!!");
            } else if(e > o) {
                System.out.println("Evens win by " + (e - o) + " point(s)");
            } else {
                System.out.println("Odds win by " + (o - e) + " point(s)");
            }
        }
    }
}