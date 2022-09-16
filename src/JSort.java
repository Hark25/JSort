public class jSort {
    public static void main(String[] args){
    int list[] = new int[5];
    list[0] = 5;        
    list[1] = 8;
    list[2] = 2;
    list[3] = 4;
    list[4] = 7;
    
    }
    public static void BubbleSort(int[] arr) {
        
        boolean sorted = false;
        int temp;
        while(!sorted){
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
