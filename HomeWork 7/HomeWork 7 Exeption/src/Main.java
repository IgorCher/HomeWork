import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ФИО");
        String name = scan.nextLine();
        System.out.println("Введите возраст");
        int age = scan.nextInt();
        if (name.length() > 200) {
            try {
                throw new IncorrectInfoException("ФИО некрректно", name, age);
            } catch (IncorrectInfoException ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println(name);
        }
        if ((age > 100) || (age <= 0)) {
            try {
                throw new IncorrectInfoException("Возраст некорректен", name, age);
            } catch (IncorrectInfoException ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println(age);
        }
    }
}
