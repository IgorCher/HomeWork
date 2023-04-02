import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введиете строку");
        String str = scan.nextLine();
        while (str.isEmpty()){
            System.out.println("Повторите ввод");
            str = scan.nextLine();
        }
        System.out.println("Введите символ A");
        String chA = scan.next();

        System.out.println("Введите символ B");
        String chB = scan.next();
        System.out.println("Строка: " + str + "\nСимвол А: " + chA + "\nСимвол В: " + chB);

        System.out.print("Результат: ");
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == chA.charAt(0)) {
            c = chB.charAt(0);
            }
            System.out.print(c);
        }

    }
}