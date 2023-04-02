import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сторону A");
        int a = scan.nextInt();
        System.out.println("Введите сторону B");
        int b = scan.nextInt();
        System.out.println("Введите сторну квадрата C");
        int c = scan.nextInt();

        int k = 0;
        int n = 0;
        while (a>=c){
            a-=c;
            k++;
        }
        while (b>=c){
            b-=c;
            n++;
        }
        int count = 0;
        for (int i = 0; i<k; i++){
            count += n;
        }
        System.out.println("Колличество квадратов в прямоугольнике: " + count);
    }
}
