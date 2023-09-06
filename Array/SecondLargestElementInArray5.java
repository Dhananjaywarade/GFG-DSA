package Array;

public class SecondLargestElementInArray5 {

    static int LargestElement(int arr[]) {
        int n = arr.length;
        int largest = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[largest]) {
                largest = i;
            }
        }
        return largest;
    }

    static int SecondLargestElement(int arr[]) {
        int n = arr.length;
        int largest = LargestElement(arr);
        int res = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[largest]) {
                if (res == -1) {
                    res = i;
                } else if (arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        return res;
    }

}
