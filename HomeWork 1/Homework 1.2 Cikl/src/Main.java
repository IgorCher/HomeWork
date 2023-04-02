public class Main {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i%5==0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i<100);
    }
}