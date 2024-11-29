import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class patrick {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("patrick.dat"));
        while(sc.hasNextLine()) {
            String[] s = sc.nextLine().split(" ");
            String s1 = s[0];
            for (int i = 0; i < Integer.parseInt(s[1])-1 ;i ++) {
                s1 = fu(s1);
            }
            System.out.println(s1);
        }

    }
    static String fu(String s) {
        String out = "";
        int count = 0;
        char old = 0;
        for (char c : s.toCharArray()) {
            if (c == old) count ++;
            else {
                out += count + "" + old;
                old = c;
                count = 1;
            }
        }
        out += count+ "" +old;
        return out.substring(2);
    }
}
