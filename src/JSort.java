
public class jSort {
    public static void main(String[] args){
        int list[] = new int[5];
        int List[] = new int[5];
        list[0] = 5;
        list[1] = 8;
        list[2] = 2;
        list[3] = 4;
        list[4] = 7;
  
        List[0] = 5;
        List[1] = 8;
        List[2] = 2;
        List[3] = 4;
        List[4] = 7;
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

    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minId = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minId = j;
                }
            }
            // swapping
            int temp = arr[i];
            arr[i] = min;
            arr[minId] = temp;
        }
    }
}

