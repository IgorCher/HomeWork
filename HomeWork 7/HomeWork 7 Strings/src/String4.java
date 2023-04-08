import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String4 {
    public static void main(String[] args) {
        String str = "ab abab abab abababab abea";
        Pattern pattern = Pattern.compile("\\b[ab]+\\b");
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
