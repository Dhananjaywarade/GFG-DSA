/**
 * trailingZero4
 */
/*

1. Naive Solution -->

public class trailingZero4 {


    static int trailingZero4(int n){
         int res=1;
        for(int i=2;i<=n;i++){
            res=res*i;
        }
        int count=0;
        while((res%10)==0){
            count++;
            res=res/10;
        }
        return count;
    }
   public static void main(String[] args) {
        int n=50;
        System.out.println(trailingZero4(n));
    }
}

    Time Complexity :- O(n)

    But, this method can cause overflow for slightly bigger numbers
    as the factorial of a number is a big number.
 */
 




 

 // 2) Efficient Approach

public class trailingZero4 {


    static int trailingZero4(int n){
        int res=0;
        for(int i=5;i<=n;i=i*5){
            res=res+n/i;
        }
        return res;
    }

    public static void main(String[] args) {
        int n=100;
        System.out.println(trailingZero4(n));
    }
}

// Time Complexity :O(log(n))

