import java.io.File;
import java.util.Scanner;
import java.util.*;

import static java.lang.System.out;

public class Vivek {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(new File("vivek.dat"));

        int N = sc.nextInt();
        sc.nextLine();

        while (N-- > 0) {

            double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), m = sc.nextDouble();

            int x = sc.nextInt();
            sc.nextLine();

            int count = 0;

            while(x -- > 0){
                String[] arr = sc.nextLine().split(" ");
                if(arr[1].equals("false")) continue;

                double d = Double.parseDouble(arr[2]);
                double e = Double.parseDouble(arr[3]);
                double f = Double.parseDouble(arr[4]);

                if(Math.sqrt((a-d)*(a-d) + (b-e)*(b-e) + (c-f)*(c-f)) - m <= 0.000001) {
                    count ++;
                }
            }

            if(count == 0){
                out.print("SS Madame de Pompadour");
            }
            else{
                out.print("We made it Rick: " + count);
            }

            if(N != 0) out.println();
        }

        sc.close();
    }
}