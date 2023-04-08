import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        System.out.println("Введите дату в формате \"гггг/мм/дд чч:мм\"");
        Scanner scan = new Scanner(System.in);
        String someDate = scan.nextLine();

        if (someDate.matches("(1[0-9]{3})|(20[0-1][0-2])/(1[0-2]|0[0-9])/([0-2][0-9]|30) ([0-1][0-9]|2[0-4]):([0-5][0-9])")) {
            System.out.println(someDate + " - существует");
        } else {
            System.out.println(someDate + " - не существует");
        }

    }
}
