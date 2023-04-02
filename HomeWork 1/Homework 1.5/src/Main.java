import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите А");
        int a = scan.nextInt();
        System.out.println("Введите В");
        int b = scan.nextInt();
        System.out.println("Выберите действие: 1-сложение 2-вычитание 3-умножение 4-деление");
        int n = scan.nextInt();
        int r;
        if (n == 1){
            r = a+b;
            System.out.println("Результат: " + r);
        } else if(n == 2){
            r = a-b;
            System.out.println("Результат: " + r);
        } else if (n == 3) {
            r = a*b;
            System.out.println("Результат: " + r);
        }else{
            r=a/b;
            System.out.println("Результат: " + r);
        }
    }
}