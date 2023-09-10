package Array;

public class DeleteElementInArray3 {

    static int Delete(int arr[], int n, int x) {
        int i;
        for (i = 0; i < n; i++)
            if (arr[i] == x)
                break;
        if (i == n)
            return n;
        for (int j = i; j < n - 1; j++)
            arr[j] = arr[j + 1];

        return n - 1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int n = 5, x = 30;

        System.out.println("Before Delete :");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

        n = Delete(arr, n, x);
        System.out.println("\nAfter Deleting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

// Time Complexity :O(n)