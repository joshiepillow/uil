import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class janice {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("janice.dat"));

        int t = sc.nextInt();
        sc.nextLine();

        while(t -- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s3 = sc.nextLine();

            int i = 0;
            while(!Character.isAlphabetic(s1.charAt(i))){
                i ++;
            }

            int val = s1.charAt(i) - s2.charAt(i);

            String res = "";
            for(int j = 0; j < s3.length(); j ++){
                if(Character.isAlphabetic(s3.charAt(j))) res += (char)((s3.charAt(j) - 'A' + val + 26) % 26 + 'A');
                else res += s3.charAt(j);
            }

            System.out.println(res);
        }
    }
}
