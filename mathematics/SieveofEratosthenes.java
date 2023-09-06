/* 
Naive solution :

                    Time complexity : O(n*sqrt(n))



public class SieveofEratosthenes {
    
    static boolean isPrime(int n){
        if(n==1)return false;
        if(n==2 || n==3)return true;
        if(n%2==0 || n%3==0)return false;
        for(int i=5;i<Math.sqrt(n);i=i+6)
            if(n%i==0 || n%(i+2)==0)
                return false;
        return true;
    }

    static void SieveofEratosthenes(int n){
        for (int i = 2; i <=n; i++) {
            if(isPrime(i))System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int n=100;
        SieveofEratosthenes(n);
    }
}

*/
