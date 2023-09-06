/* 
1. Naive Solution :- Time Complexity O(n)

public class PrimeNumber {

    static boolean prime(int n){
        if(n==1)return false;

        for(int i=2;i<n;i++)
            if(n%i==0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        int n=1;
        System.out.println(prime(n));
    }
}

*/

/* 

2. Efficient Solution :- Time Complexity O(sqrt(n))

public class PrimeNumber {

    static boolean prime(int n){
        if(n==1)return false;
        
        for(int i=2;i<Math.sqrt(n);i++)
            if(n%i==0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        int n=11;
        System.out.println(prime(n));
    }
}

*/



//More Efficient method  :-Time complexity: O(sqrt(n))

//Auxiliary space: O(1)

public class PrimeNumber {

    static boolean prime(int n){
        if(n==1)return false;
        if(n==2 || n==3)return true;
        if(n%2==0 || n%3==0)return false;
        for(int i=5;i<Math.sqrt(n);i=i+6)
            if(n%i==0 || n%(i+2)==0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        int n=1;
        System.out.println(prime(n));
    }
}

