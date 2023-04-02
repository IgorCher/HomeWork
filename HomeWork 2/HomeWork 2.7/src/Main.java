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
        } while (n<=0);
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
        } while (max < min);


        int[] array = new int[n];
        for (int i = 0; i < array.length;i++){
            array [i] = (int) ((Math.random() * (max - min)) + min);
            System.out.print(array[i] + " ");
        }
        System.out.println("\nОтсортированный массив:");
        for (int i = array.length-1; i>=0; i--){
            for(int j = 0; j < array.length-1; j++) {
                if (array[j] < array[j+1]) {
                    int t = array[j+1];
                    array[j+1] = array[j];
                    array[j] = t;
                }
            }
            System.out.print(array[i] + " ");
        }

        System.out.println("\nВведите искомое значение");
        int value = scan.nextInt();
        int index = 0;
        int count1 = 0;
        int count2 = 0;
        boolean check = false;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == value) {
                index = i;
                check = true;
            }
            count1++;
            break;
        }
        if (check) {
            System.out.println("Число N есть в массиве под индексом: " + index);
        } else {
            System.out.println("Числа N нет в массиве");
        }

        int lowIndex = 0;
        int highIndex = array.length - 1;
        while (lowIndex <= highIndex){
            int midIndex = (lowIndex + highIndex) / 2;
            if (value == array[midIndex]){
                index = midIndex;
                break;
            } else if (value < array[midIndex]){
                highIndex = midIndex - 1;
            } else if (value > array[midIndex]){
                lowIndex = midIndex + 1;
            }
            count2++;
        }
        System.out.println("Линейный поиск: " + count1 + " шаг(-а)(-ов)");
        System.out.println("Двоичный поиск: " + count2 + " шаг(-а)(-ов)");

    }
}