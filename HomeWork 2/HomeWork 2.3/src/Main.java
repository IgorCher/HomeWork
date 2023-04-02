import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int n = scan.nextInt();
        do {
            if(n<=0) {
                System.out.println("Значение некорректно, введите новое значение");
                n = scan.nextInt();
            }
        } while(n<=0);
        System.out.println("Введите нижний диапазон значений");
        int min = scan.nextInt();
        System.out.println("Введите верхний диапазон значений");
        int max = scan.nextInt();
        do {
            if (max < min) {
                System.out.println("Значения диапазонов некорректны, введите новые значения");
                System.out.print("Нижний диапазон: ");
                min = scan.nextInt();
                System.out.print("Верхний диапазон: ");
                max = scan.nextInt();
            }
        } while (max<min);
        int[] array = new int[n];

        int iMax = 0;
        for (int i = 0; i < array.length;i++){
            array [i] = (int) ((Math.random() * (max - min)) + min);
            System.out.print(array[i] + " ");
            if (array[i]>array[iMax]){
                iMax = i;
            }
        }
        System.out.println("\nМаксимальный элемент: " + array[iMax] + " под индексом " + iMax);
    }
}