import java.io.File;
import java.util.Scanner;

public class Helena {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("helena.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ; i < N ;++i) {
            int S = sc.nextInt();
            int M = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < M; j++) {
                String s = sc.nextLine();
                int r = s.length()%(2*S);
                String rem = s.substring(s.length()-r);
                s=s.substring(0,s.length()-r);
                String out = "";
                for (int k = 0;  k < s.length()/2/S; k++) {
                    String s1 = s.substring(k*2*S,k*2*S+S);
                    String s2 = s.substring(k*2*S+S,k*2*S+2*S);
                    out += rev(s2) + rev(s1);
                }
                String s1 = rem.substring(0, (rem.length()+1)/2);
                String s2 = rem.substring((rem.length()+1)/2);
                out += rev(s2)+rev(s1);
                System.out.println('\''+out+'\'');
            }

                for (int f = 0; f < 25; f++) {
                    System.out.print("=");
                }
            if (i != N-1) {
                System.out.println();
            }
        }
        sc.close();
    }
    public static String rev(String str){
        String res = "";
        for(char ch : str.toCharArray()){
            res = ch + res;
        }
        return res;
    }
}