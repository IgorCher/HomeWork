public class IntArray {
    private int [] array;

    IntArray (int n){
        array = new int[n];
    }
    IntArray(int[]array){
        this.array = array;
    }
    IntArray (){
        array = new int[10];
    }

    public void sort(int n){
        if (n>0){
            for(int i = 0; i< array.length-1;i++){
                for (int j = 1; j< array.length-i; j++) {
                    if (array[j] < array[j - 1]) {
                        int temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                }
            }
        }else{
            for(int i = 0; i< array.length;i++){
                for (int j = 0; j < array.length-i-1; j++) {
                    if (array[j] < array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }
}
