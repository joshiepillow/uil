import java.io.File;
import java.util.Comparator;
import java.util.Scanner;
import java.util.*;

public class Kamil {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("kamil.dat"));
        int N = sc.nextInt();
        sc.nextLine();

        while(N -- > 0){

            String[] arr = sc.nextLine().split("\\s+");

            Arrays.sort(arr, Comparator.comparing(Kamil::rev));

            for(int i = 0; i < arr.length; i ++){
                System.out.print(arr[i]);
                if(i != arr.length-1) System.out.print(" ");
            }

            if(N != 0) System.out.println();
        }

        sc.close();
    }

    public static String rev(String str){
        String res = "";
        for(char ch : str.toCharArray()){
            res = ch + res;
        }
        return res.toLowerCase();
    }
}