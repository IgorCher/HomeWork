import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число N>0:");
        int n = scan.nextInt();
        int num;
        int count = 0;
        int sum = 0;
        boolean hasTwo = false;
        System.out.println("Число справа налево");
        while (n>0) {
            num = n%10;
            System.out.print(num);
            count++;
            sum+=num;
            if (num==2) {
                hasTwo = true;
            }
            n /= 10;
        }
        System.out.println();
        if (hasTwo){
            System.out.println("В числе есть цифра 2");
        } else {
            System.out.println("В числе нет цифры 2");
        }
        System.out.println("Колличество цифр: " + count);
        System.out.println("Сумма цифр:" + sum);



    }
}