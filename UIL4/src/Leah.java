import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Leah {
    private static List<Integer> compute(int n) {
        if(n == 1) return List.of(0, 1);
        var l = new ArrayList<>(compute(n - 1));
        for (int i = l.size() - 1; i >= 0; i--) {
            l.add(l.get(i) + (1 << (n - 1)));
        }
        return l;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("leah.dat"));
        int n = sc.nextInt();
        while(0 != n--) {
            int k = sc.nextInt();

            System.out.println(compute(k).stream().map(x -> x.toString()).collect(Collectors.joining(" ")));
        }
    }
}