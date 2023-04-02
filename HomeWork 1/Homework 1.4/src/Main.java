import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер года:");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (year%4!=0){
            System.out.println("В этом году 365 дней");
        } else if (year%100!=0) {
            System.out.println("В этом году 366 дней");
        } else if (year%400!=0) {
            System.out.println("В этом году 365 дней");
        } else {
            System.out.println("В этом году 366 дней");
        }
    }
}