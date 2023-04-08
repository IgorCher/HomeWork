import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String2 {
    public static void main(String[] args) {
        System.out.println("Введите текст");
        Scanner scan = new Scanner(System.in);
        String someText = scan.nextLine();

        Pattern pattern = Pattern.compile("www\\.\\w*\\.com");
        Matcher matcher = pattern.matcher(someText);
        if (matcher.find()){
            System.out.println(matcher.group());
        } else {
            System.out.println("В тексте нет ссылки");
        }
    }
}
