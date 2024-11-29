import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class george {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("george.dat"));

        int t = sc.nextInt();

        while(t -- > 0){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

            if(a * b < c){
                System.out.println("I've got a bad feeling about this.");
            }
            else{
                System.out.println("Never tell me the odds");
            }
        }

    }
}
