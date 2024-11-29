import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class miguel {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("miguel.dat"));

        int t = sc.nextInt();
        sc.nextLine();

        while(t -- > 0){
            String s = sc.nextLine();

            ArrayList<Character> arr = new ArrayList<>();

            for(char ch : s.toCharArray()){
                if(Character.isUpperCase(ch) || Character.isLowerCase(ch)) arr.add(Character.toLowerCase(ch));
            }


            Collections.sort(arr);

            int i = 0;

            String res = "";

            for(char ch : s.toCharArray()){
                if(Character.isUpperCase(ch)) res += Character.toUpperCase(arr.get(i ++));
                else if(Character.isLowerCase(ch)) res += Character.toLowerCase(arr.get(i ++));
                else res += ch;
            }

            System.out.println(res);
        }
    }
}
