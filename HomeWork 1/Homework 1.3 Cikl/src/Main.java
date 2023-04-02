import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int f = scan.nextInt();
        int d=1;
        for (int i=1; i<=f; i++){
            d = d*i;
        }
        System.out.println("Факториал числа " + f + " это " + d);
    }
}