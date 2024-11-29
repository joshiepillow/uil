import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;

public class Ajay {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 13; i++) {out.print(" ");} for (int i = 0; i < 5; i++) {out.print("-");} out.print("TRAPEZOID"); for (int i = 0; i < 5; i++) {out.print("-");} for (int i = 0; i < 13; i++) {out.print(" ");} out.print("\n");
        for (int i = 0; i < 12; i++) {out.print(" ");} out.print("/"); for (int i = 0; i < 5 + 9 + 5; i++) {out.print(" ");} out.print("\\"); for (int i = 0; i < 12; i++) {out.print(" ");} out.print("\n");
        for (int i = 0; i < 11; i++) {out.print(" ");} out.print("/"); for (int i = 0; i < 6 + 9 + 6; i++) {out.print(" ");} out.print("\\"); for (int i = 0; i < 11; i++) {out.print(" ");} out.print("\n");
        char[] c = "TRAPEZOID".toCharArray();
        for (int j = 0; j < c.length; j++)  {
            for (int i = 0; i < 10 - j; i++) {out.print(" ");} out.print(c[j]); for (int i = 0; i < 6 + j + 9 + 6 + 2 + j; i++) {out.print(" ");} out.print(c[j]); for (int i = 0; i < 10 - j; i++) {out.print(" ");} out.print("\n");
        }
        for (int i = 0; i < 1; i++) {out.print(" ");} out.print("/"); for (int i = 0; i < 41; i++) {out.print(" ");} out.print("\\"); for (int i = 0; i < 1; i++) {out.print(" ");} out.print("\n");
        for (int i = 0; i < 0; i++) {out.print(" ");} out.print("/"); for (int i = 0; i < 43; i++) {out.print(" ");} out.print("\\"); for (int i = 0; i < 0; i++) {out.print(" ");} out.print("\n");
        for (int i = 0; i < 18; i++) {out.print("-");} out.print("TRAPEZOID"); for (int i = 0; i < 18; i++) {out.print("-");} out.print("\n");


    }
}