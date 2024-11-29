import java.io.File;
import java.util.Scanner;

public class Javier {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("javier.dat"));
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; ++i) {

            int Btop = sc.nextInt(), Bbot = sc.nextInt();
            String ch = sc.next();
            String dir = sc.next();


            int w = Math.max(Btop, Bbot);

            if (dir.equals("L")) {
                if (Btop > Bbot) {
                    for (int B = Btop; B >= Bbot; B--) {
                        for (int b = 0; b < B; b++) System.out.print(ch);
                        System.out.println();
                    }

                } else for (int B = Btop; B <= Bbot; B++) {
                    for (int b = 0; b < B; b++) System.out.print(ch);
                    System.out.println();
                }

            }
            else {
                if (Btop > Bbot) {

                    for (int B = Btop; B >= Bbot; B--) {
                        for (int x = 0; x < w - B; x++) System.out.print(" ");
                        for (int b = 0; b < B; b++) System.out.print(ch);
                        System.out.println();

                    }
                } else for (int B = Btop; B <= Bbot; B++) {
                    for (int x = 0; x < w - B; x++) System.out.print(" ");
                    for (int b = 0; b < B; b++) System.out.print(ch);
                    System.out.println();
                }

            }
            sc.nextLine();
        }
        sc.close();
    }

}