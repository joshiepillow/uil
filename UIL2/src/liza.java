import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class liza {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("liza.dat"));

        int t = sc.nextInt();
        sc.nextLine();

        while(t -- > 0){
            String s1 = sc.nextLine();

            ArrayList<State> arr = new ArrayList<>();
            int n = sc.nextInt();
            sc.nextLine();

            for(int i = 0; i < n; i ++){
                String[] val = sc.nextLine().split(",");
                arr.add(new State(val[1], val[0], Integer.parseInt(val[2])));
            }

            Collections.sort(arr);

            System.out.println(s1);
            for(int i = 0; i < 3; i ++){
                System.out.println(arr.get(i).first + " " + arr.get(i).last + ": " + arr.get(i).grade);
            }

            double mean = 0;
            for(State s : arr){
                mean += s.grade;
            }
            mean /= arr.size();

            double median = -1;
            if(arr.size() % 2 == 1){
                median = arr.get(arr.size() / 2).grade;
            }
            else{
                median = arr.get(arr.size() / 2).grade + arr.get(arr.size() / 2 - 1).grade;
                median /= 2.0;
            }

            System.out.printf("MEAN SCORE: %.2f\n", mean);
            System.out.printf("MEDIAN SCORE: %.1f\n", median);
            if(t != 0) System.out.println();
        }



    }

    static class State implements Comparable<State>{
        String first, last;
        int grade;

        public State(String first, String last, int grade){
            this.first = first;
            this.last = last;
            this.grade = grade;
        }

        @Override
        public int compareTo(State o) {
            if(o.grade != grade) return o.grade - grade;
            else if(!o.last.equals(last)) return last.compareTo(o.last);
            else return first.compareTo(o.first);
        }
    }
}
