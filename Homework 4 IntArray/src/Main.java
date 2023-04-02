import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 1, 5, 8, 4, 15, 100, 25, -15};
        for(int i: array){
            System.out.print(i+" ");
        }
        System.out.println();



        IntArray a = new IntArray(array);
        a.setArray(1,2,3,4,5,6,7,8,9);
        for(int i: array){
            System.out.print(i+" ");
        }
        System.out.println();
        a.sort(1);
    }
}