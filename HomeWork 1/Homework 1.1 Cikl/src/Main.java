import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите колличество строк");
        Scanner scan = new Scanner(System.in);
        int line = scan.nextInt();
        int i = 1;
        while (i<=line) {
            System.out.println("Task"+i);
            i++;
        }

    }
}