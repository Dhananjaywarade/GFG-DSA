package Array;

import java.util.Arrays;

public class SecondLargestElementInArray5 {

    static int SecondLargestElement(int arr[]) {
        Arrays.sort(arr);
        int res = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[res])
                res = i;
        }
        return arr[res];

    }

    public static void main(String[] args) {
        int arr[] = { 40, 20, 10, 5 };
        System.out.println(SecondLargestElement(arr));
    }
}
