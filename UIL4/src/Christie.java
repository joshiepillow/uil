import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Christie {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("christie.dat"));
        int n = sc.nextInt(); sc.nextLine();
        while(n-- != 0) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            StringBuilder b = new StringBuilder();
            for(; s <= e; s++) {
                var str = Integer.toString(s);
                int u = 0;
                for(int i = 0; i < str.length(); i++) {
                    int x = str.charAt(i) - '0';
                    u += x * x;
                }

                int asdf = (int) Math.sqrt(u);
                if(asdf * asdf == u) {
                    b.append(s).append(" ");
                }
            }

            if(b.isEmpty())
                System.out.println("NONE");
            else
                System.out.println(b.toString().trim());
        }
    }
}