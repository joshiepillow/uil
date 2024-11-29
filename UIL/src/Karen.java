import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Karen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("karen.dat"));
        int N  = sc.nextInt();
        for (int i = 0; i < N; i++) {
            double x = sc.nextInt();
            double y = Math.floor(Math.sqrt(x));
            if (x <= (y*y+(y+1)*(y+1))/2)

                System.out.println((int)(y*y));
            else
                System.out.println((int)((y+1)*(y+1)));
        }

        System.out.println();
    }
}
