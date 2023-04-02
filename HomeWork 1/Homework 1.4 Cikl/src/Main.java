import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A = 1;
        int B = 13;
        int n = B-2;
        for (int i = B-1; i>A; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\nКолличество чисел = " + n);
    }
}