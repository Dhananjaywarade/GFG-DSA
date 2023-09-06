
/* 
1. Naive solution : 

                    Time Complexity: O(n*sqrt(n)*log(n))

                    Auxiliary Space: O(1)

public class PrimeFactor8 {
    static boolean isPrime(int i){
        if(i==1)return false;
        if(i==2 || i==3)return true;
        if(i%2==0 || i%3==0)return false;
        for (int j = 5; j*j <= i; j=j+6) {
            if(i%j==0 || i%(j+2)==0)
            return false;
        }
        return true;
    }

    static void PrimeFactor(int n){
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                int x=i;
                while (n%x==0) {
                    System.out.println(i);
                    x=x*i;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n=1092;     
        PrimeFactor(n);
    }
}

*/

//---------------------------------------------------------------------------------------------------

/*

2) Efficient Approach 

                            Time Complexity: O(sqrt(n))

                            Auxiliary space: O(1)

public class PrimeFactor8 {

    static void PrimeFactor(int n){
        if(n<=1)
        return;
        for (int i = 2; i*i <= n; i++) {
            while (n%i==0) {
                System.out.println(i);
                n=n/i;
            }
        }
        if(n>0)System.out.println(n);
    }
    public static void main(String[] args) {
        int n=12;
        PrimeFactor(n);
    }
}

*/

//---------------------------------------------------------------------------------------------------


//3) More Efficient Approach
                            // Time Complexity: O(sqrt(n))

                            // Auxiliary space: O(1)

public class PrimeFactor8 {

   static void PrimeFactor(int n){
    if(n<=1)return;
    while (n%2==0) {
        System.out.println(2);
        n=n/2;
    }
    while (n%3==0) {
        System.out.println(3);
        n=n/3;
    }
    for (int i = 5; i*i <=n; i=i+6) {
        while (n%i==0) {
            System.out.println(i);
            n=n/i;
        }
        while (n%(i+2)==0) {
            System.out.println(i+2);
            n=n/(i+2);
        }
    }
    if(n>3)System.out.println(n);
   }

    public static void main(String[] args) {
        int n=1092;
        PrimeFactor(n);
    }
    
}