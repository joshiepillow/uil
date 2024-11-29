import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Vinay {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("vinay.dat"));
        String ans = "";
        int N  = sc.nextInt();
        sc.nextLine();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arrayList.add(sc.nextLine());
        }
        ArrayList<Integer> out = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = arrayList.get(i);
            BigInteger total = solve(s);
            if (total.equals(new BigInteger("0")))  {
                ans = s + " can not be rearranged to form a palindrome.\n";
            } else {
                ans = s + " can be rearranged to form " + total.toString() + " distinct palindrome(s).\n";
            }
            System.out.print(ans);
        }

    }
    public static BigInteger solve(String s) {
        int[] cnt = new int[36];
        for(int i=0;i<s.length(); ++i) {
            if('a'<= s.charAt(i) && 'z' >= s.charAt(i)) cnt[s.charAt(i)-'a']++;
            else if ('A'<= s.charAt(i) && 'Z' >= s.charAt(i)) cnt[s.charAt(i)-'A']++;
            else if('0'<=s.charAt(i) && '9'>=s.charAt(i)) cnt[26+s.charAt(i)-'0']++;
            else;
        }
        //for(int i =0 ;i < 36;++i) System.out.print(cnt[i]);
        //System.out.println();
        int odds = 0;
        int permu= 0;
        ArrayList<Integer> dupes= new ArrayList<Integer>();
        for(int i=0;i<36;++i) {
            if(cnt[i]%2==1) {
                odds++;
                if(cnt[i] - 1 > 0) permu += (cnt[i]-1)/2;
                if(cnt[i] - 3 > 0) dupes.add((cnt[i]-1)/2);
            }
            else
            {
                if(cnt[i]>2) dupes.add(cnt[i]/2);
                permu += cnt[i]/2;
            }
        }
        //System.out.println ("odds: " +odds);
        //System.out.println("permu: " + permu);
        //System.out.println(dupes.toString());
        if(odds > 1) return new BigInteger("0");
        BigInteger total = new BigInteger("1");
        for(int i = permu; i>1; --i)
        {
            total = total.multiply(new BigInteger(""+i));
        }
        for(int i=0;i<dupes.size();++i) {
            for(int j = dupes.get(i);j>1;--j)
            {
                total = total.divide(new BigInteger(""+j));
            }
        }
        //System.out.println("HERE");
        return total;
    }
}
