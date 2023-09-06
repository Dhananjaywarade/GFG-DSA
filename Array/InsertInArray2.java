package Array;

public class InsertInArray2 {

    static int InsertInArray2(int arr[],int n,int x,int cap,int pos){
        if(n==cap)return n;
        int idx=pos-1;
        for (int i = n-1; i >=idx; i--) {
            arr[i+1]=arr[i];
        } 
        arr[idx]=x;
        return (n+1);
    }
    
    public static void main(String[] args) {
       int arr[]=new int[5];
       arr[0]=5;arr[1]=7;arr[2]=10;arr[3]=20;
       int cap=5,n=4,x=3,pos=2;

       System.out.println("Before Insertion :");
       for (int i = 0; i < n; i++) {
        System.out.println(arr[i]+" ");
       }
       System.out.println();

       n=InsertInArray2(arr, n, x, cap, pos);

       System.out.println("After Insertion :");
       for (int i = 0; i < n; i++) {
        System.out.println(arr[i]+" ");
       }
       System.out.println();
    }
}

//Time Complexity :O(n)