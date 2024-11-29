import java.io.File;
import java.util.Scanner;

import static java.lang.System.out;

public class Fernando {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("fernando.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ; i < N ;++i) {
            int A = sc.nextInt();
            String B = sc.next();
            boolean a = false;
            for (int j = 1; j<=A; j++) {
                if((A%j)==0) {
                    if(!(""+j).contains(B)) {
                        if (a) out.print(" ");
                        out.print(j);
                        a = true;
                    }
                }
            }
            if (!a) out.print("NONE");
            if (i!=N-1) out.println();
        }
        sc.close();
    }
}