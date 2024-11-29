import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lucas {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner x = new Scanner(new File("lucas.dat"));
        int n = x.nextInt();
        x.nextLine();
        for (int i = 0; i < n; i++) {
            String op = "";
            String str = x.nextLine();
            String[] sArr = str.split(" ");
            ArrayList<Integer> iArr = new ArrayList<>();
            for (String j : sArr) {
                iArr.add(Integer.parseInt(j));
            }
            if (iArr.size() >= 3) {
                Collections.sort(iArr);
                iArr.remove(0);
                iArr.remove(iArr.size() - 1);
            }
            double avg = 0.0;
            for (int k : iArr) {
                avg += k;
            }
            avg /= iArr.size();
            int avgInt = (int) avg;
            int s = avgInt % 60;
            int m = avgInt / 60;
            if (m < 10) {
                op += "0";
            }
            op += m + ":";
            if (s < 10) {
                op += "0";
            }
            op += s;
            System.out.println(op);
        }
    }
}