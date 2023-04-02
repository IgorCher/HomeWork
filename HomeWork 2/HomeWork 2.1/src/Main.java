public class Main {
    public static void main(String[] args) {
        int [] array = new int[4];
        for(int i = 0; i< array.length; i++) {
            array[i] = (int) (Math.random() * 90) + 10;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        boolean mark = true;
        for(int n = 0; n < array.length;n++){
            if(array[n]>=array[n+1]){
                mark = false;
                break;
            }
        }
        if (mark){
            System.out.println("Цикл является строго возрастающей последовательностью");
        } else {
            System.out.println("Цикл не является строго возрастающей последовательностью");
        }
    }
}