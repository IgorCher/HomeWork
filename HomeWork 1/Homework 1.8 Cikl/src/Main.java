import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double dep = 1000;
        int k = 0;
        System.out.println("Введите процентную ставку");
        int pct = scan.nextInt();
        while (dep<=1100){
            dep += dep*pct/100;
            k++;
        }
        System.out.println("Колличество месяцев: " + k);
        System.out.println("Итоговый размер вклада: " + dep);
    }
}