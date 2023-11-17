package forfun;

import java.util.Arrays;

public class BubbleSortExample {
    public static void bubbleSort(int arr[]) {  
        int n = arr.length;  
        for (int i = 0; i < n-1; i++) {  
            for (int j = 0; j < n-i-1; j++) {  
                if (arr[j] > arr[j+1]) {  
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];  
                    arr[j] = arr[j+1];  
                    arr[j+1] = temp;  
                }  
            }  
        }  
    }  

    public static void main(String[] args) {
        int arr[] ={3,60,35,2,45,320,5};  
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));  // Output: [2, 3, 5, 35, 45, 60, 320]
    }
}
