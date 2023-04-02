import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите достоинство карты:\n(если старше 10 то 11-валет 12-дама 13-король 14-туз)");
        int n = scan.nextInt();
        System.out.println("Введите масть карты:\n1-пики 2-трефы 3-бубны 4-червы");
        int m = scan.nextInt();
        String [] array1= {"шестерка","семерка","восьмерка","девятка","десятка","валет","дама","король","туз"};
        String [] array2= {" пик"," треф"," бубен"," черв"};
        if (n>=6 & n<=14 & m>=1 & m<=4) {
            System.out.print(array1[n-6] + array2[m-1]);
        } else {
            System.out.println("нет такой карты");
        }
    }
}