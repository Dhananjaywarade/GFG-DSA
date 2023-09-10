package Array;

public class LinearSearch1 {

    static int LinearSearch(int arr[],int x){
    
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x)return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,15,2,3};
        int x=15;
       
        System.out.println(LinearSearch(arr, x));
    }
}

//Time Complexity : O(n)