public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 1;
        if (a+b>b+c && a+b>a+c) {
            System.out.println(a + b);
        } else if (b+c>a+c) {
            System.out.println(b + c);
        } else {
            System.out.println(a + c);
        }
    }
}