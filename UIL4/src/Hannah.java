import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

public class Hannah {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner x = new Scanner(new File("hannah.dat"));
        int t = x.nextInt();
        x.nextLine();
        for (int i = 0; i < t; i++) {
            HashMap<String, Integer> h = new HashMap<>();
            HashMap<Integer, String> hInv = new HashMap<>();
            HashMap<String, ArrayList<Integer>> classes = new HashMap<>();
            HashMap<String, String> classTeam = new HashMap<>();
            ArrayList<Integer> sortable = new ArrayList<>();

            int n = x.nextInt();
            x.nextLine();
            for (int j = 0; j < n; j++) {
                String str = x.nextLine();
                String[] strArr = str.split("\\s");
                int sumPg = 0;
                for (int k = 2; k < strArr.length; k++) {
                    sumPg += Integer.parseInt(strArr[k]);
                }
                h.put(strArr[0], sumPg);
                classTeam.put(strArr[1], strArr[0]);
            }
            for (int j = 0; j < n; j++) {
                String str = x.nextLine();
                String[] strArr = str.split("\\s");
                int sumMc = 0;
                for (int k = 1; k < strArr.length; k++) {
                    sumMc += Integer.parseInt(strArr[k]);
                }
                int sum = h.get(strArr[0]) + sumMc;
                h.put(strArr[0], sum);
                ArrayList<Integer> y = classes.get(strArr[0]);
                if (y == null) {
                    System.out.println(strArr[0]);
                    y = new ArrayList<>();
                }
                y.add(sum);
                y.remove(h.get(strArr[0]));
                classes.put(strArr[0], y);
            }
            for (String s : h.keySet()) {
                hInv.put(h.get(s), s);
            }
            for (String j : classTeam.values()) {
                System.out.println("Classification " + j + " Results");
                ArrayList<Integer> a = classes.get(j);
                Collections.sort(a);
                for (int k : a) {
                    System.out.println(hInv.get(k) + " " + k);
                }
            }
            System.out.println("===============");
        }
    }
}