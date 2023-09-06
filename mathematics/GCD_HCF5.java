/* 
1. Naive Solution :-

public class GCD_HCF5 {

    static int GCD(int a, int b) {
        int res = Math.min(a, b);
        while (res > 0) {
            if (a % res == 0 && b % res == 0) {
                break;
            }
            res--;
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 10, b = 15;
        System.out.println(GCD(a, b));
    }
}

Time Complexity :- O(min(a,b))
*/


//---------------------------------------------------------------------------------------------------//

/* 
 2. Euclidean Approach:

public class GCD_HCF5 {

    static int GCD(int a, int b) {
        while (a!=b) {
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
       }
       return a;
    }

    public static void main(String[] args) {
        int a = 10, b = 15;
        System.out.println(GCD(a, b));
    }
}


Time Complexity: O(min(a,b))

Auxiliary Space: O(1) 
*/

//---------------------------------------------------------------------------------------------------//



//3. optimize Euclidean Approach:

public class GCD_HCF5 {

    static int GCD(int a, int b) {
       if(b==0){
        return a;
       }
       return GCD(b,a%b);
    }

    public static void main(String[] args) {
        int a = 12, b = 15;
        System.out.println(GCD(a, b));
    }
}

// Time Complexity : O(log(min(a,b)))
// Auxiliary Space: O(1)
