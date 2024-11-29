import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ariel {
    static class Time implements Comparable<Time> {
        public Time(int a, boolean b) {
            time = a;
            isIn  = b;
        }
        public int time;
        public boolean isIn;

        @Override
        public int compareTo(Time time2) {
            int i = time - time2.time;
            if (i != 0) return i;
            if (!isIn) return -1;
            return 1;
        }

        @Override
        public String toString( ){
            return time + " " + isIn;
        }
     }


    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("ariel.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String[] in = sc.nextLine().split(" ");
            String[] out = sc.nextLine().split(" ");
            ArrayList<Time> times = new ArrayList<>();
            for (int k = 0; k < in.length ;k++) {
                int inTime = Integer.parseInt(in[k].split(":")[0]) * 60 + Integer.parseInt(in[k].split(":")[1]);
                int outTime = Integer.parseInt(out[k].split(":")[0]) * 60 + Integer.parseInt(out[k].split(":")[1]);
                if (inTime == outTime) {
                    times.add(new Time(inTime, true));
                    times.add(new Time(inTime + 1, false));
                } else if (inTime < outTime) {
                    times.add(new Time(inTime, true));
                    times.add(new Time(inTime + 1440, true));
                    times.add(new Time(outTime, false));
                    times.add(new Time(outTime + 1440, false));
                } else {
                    times.add(new Time(inTime, true));
                    times.add(new Time(outTime + 1440, false));
                }
            }
            times.sort(Time::compareTo);
            int cnt = 0;
            int max = 0;
            for (Time t: times) {
                //System.out.println(t + " " + cnt);
                if (t.isIn) {
                    cnt++;
                } else {
                    cnt--;
                }
                max = Math.max(max, cnt);
            }
            System.out.println(max);
        }
    }
}