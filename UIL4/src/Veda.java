import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Veda {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner x = new Scanner(new File("veda.dat"));
        int n = x.nextInt();
        x.nextLine();
        HashMap<Character, Double> h = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str = x.nextLine();
            String[] strArr = str.split(":");
            String[] letters = strArr[0].split(",");
            double price = Double.parseDouble(strArr[1]);
            for (String l : letters) {
                h.put(l.charAt(0), price);
            }
            //setup done
        }
        int s = x.nextInt();
        x.nextLine();
        for (int i = 0; i < s; i++) {
            String str = x.nextLine();
            double total = 0.0;
            for (int j = 0; j < str.length(); j++) {
                if (h.containsKey(str.charAt(j))) {
                    total += h.get(str.charAt(j));
                }
            }
            System.out.print("$");
            System.out.printf("%.2f", total);
            System.out.println();
        }
    }
}