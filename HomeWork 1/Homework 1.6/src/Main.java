import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число от 0 до 999");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n==0) {
            System.out.println("Вы ввели ноль");
        } else if (n%2==0 & n<=10){
            System.out.println("Четное однозначное число");
        } else if (n%2==0 & n<=99){
            System.out.println("Четное двухзначное число");
        } else if (n%2==0){
            System.out.println("Четное трехзначное число");
        } else if (n<=10){
            System.out.println("Нечетное однозначное число");
        } else if (n<=99){
            System.out.println("Нечетное двухзначное число");
        } else {
            System.out.println("Нечетное трехзначное число");
        }
    }
}