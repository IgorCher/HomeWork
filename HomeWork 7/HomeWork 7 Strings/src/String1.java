public class String1 {
    public static void main(String[] args) {

        int x = 3;
        int y = 56;

        StringBuilder str1 = new StringBuilder();
        str1.append(x).append("+").append(y).append("=").append(x + y);
        System.out.println(str1);

        StringBuilder str2 = new StringBuilder();
        str2.append(x).append("-").append(y).append("=").append(x - y);
        System.out.println(str2);

        StringBuilder str3 = new StringBuilder();
        str3.append(x).append("*").append(y).append("=").append(x * y);
        System.out.println(str3);

        System.out.println(str1.replace(4,5,"равно"));
        System.out.println(str2.replace(4,5,"равно"));
        System.out.println(str3.replace(4,5,"равно"));

    }
}
