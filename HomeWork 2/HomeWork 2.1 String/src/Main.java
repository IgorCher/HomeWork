import java.util.Scanner;

public class Main {
    public static void main(String[] args)
        throws java.io.IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введиете строку");
        String str = scan.nextLine();
        System.out.println("Введите символ");
        char ch = (char) System.in.read();
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                count++;
            }
        }
        if (count>0){
            System.out.println("Колличество вхождений символа в строку: " +count);
        } else {
            System.out.println("Такого символа в строке нет");
        }
    }
}