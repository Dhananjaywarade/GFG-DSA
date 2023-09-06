/* 

1) Naive Approach:

A Naive Solution would be to iterate all the numbers from 1 to n, checking if that number divides n and printing it. 

Time Complexity: O(n) 

Auxiliary Space: O(1)




public class AllDivisor9 {

   static void AllDivisor(int n){
        for (int i = 1; i <=n; i++) {
            if(n%i==0)System.out.println(i +" ");
        }
    }

    public static void main(String[] args) {
        int n=6;
        AllDivisor(n);
    }
}

*/

//---------------------------------------------------------------------------------------------------//

/* 

2) Efficient Approach 
                            Time Complexity: O(sqrt(n)) 

                            Auxiliary Space: O(1)



public class AllDivisor9 {

    static void AllDivisor(int n) {
        int i;
        for (i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + " ");
                if (i != n / i)
                    System.out.println(n / i);
            }
        }
    }

    public static void main(String[] args) {
        int n = 25;
        AllDivisor(n);
    }
}

*/

//---------------------------------------------------------------------------------------------------//


public class AllDivisor9 {

    static void AllDivisor(int n){
        int i=1;
        for (i = 1; i*i < n; i++) {
            if(n%i==0)System.out.println(i);
        }
        for (; i>=1; i--) {
            if(n%i==0)
            System.out.println(n/i);
        }
    }
    
    public static void main(String[] args) {
        int n=6;
        AllDivisor(n);
    }
}