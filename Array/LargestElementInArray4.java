package Array;

/* 
public class LargestElementInArray4 {
    
    static int LargestElementInArray(int arr[]){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag=true;
            for (int j = 0; j < n; j++) {
                if(arr[j]>arr[i]){
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            return i;
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[]={2,25,41,7};
        System.out.println(LargestElementInArray(arr));
    }
}

// Time Complexity :O(n2)

*/

//-----------------------------------------------------------------------------------------

/**
 * LargestElementInArray4
 */
public class LargestElementInArray4 {

    static int LargestElementInArray(int arr[]){
        int res=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>arr[res]) {
                res=i;
            } 
        }
         return arr[res];
    }
    
    public static void main(String[] args) {
        int arr[]={12,14,56,2};
        System.out.println(LargestElementInArray(arr));
    }
}

//Time complexity : O(n)