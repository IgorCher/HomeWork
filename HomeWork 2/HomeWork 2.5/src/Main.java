import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99,10,15};
        System.out.println("Введите чтсло N");
        int value = scan.nextInt();
        int index = -1;
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                check = true;
            }
        }
        if (check) {
            System.out.println("Число N есть в массиве под индексом: " + index);
        } else {
            System.out.println("Числа N нет в массиве");
        }
    }
}