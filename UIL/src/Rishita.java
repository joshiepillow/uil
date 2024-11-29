import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Rishita {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("rishita.dat"));
        HashMap<String, ArrayList<String>> hs = new HashMap<>();
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] t = s.split(",");
            if (hs.get(t[2]) == null) {
                hs.put(t[2], new ArrayList<>());
            }
            hs.get(t[2]).add("   " + t[1] + "   " + t[0]);
        }
        ArrayList<String> s = new ArrayList<>(hs.keySet());
        s.sort(String::compareTo);
        for (String p : s) {
            System.out.println(p);
            hs.get(p).sort(String::compareTo);
            for (String n: hs.get(p))
                System.out.println(n);
        }
    }
}
