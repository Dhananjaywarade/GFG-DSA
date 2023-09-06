/* 
1) Naive Approach

public class LCM6 {

    static int LCM(int a,int b){
        int max=Math.max(a, b);
        while (max>0) {
            if(max%a==0 && max%b==0){
            break;
        }
        max++; 
        }
       return max;
    }
    public static void main(String[] args) {
        int a=4,b=6;
        System.out.println(LCM(a, b));
    }
}

Time Complexity: O(a*b - max(a,b))
*/

//-----------------------------------------------------------------------------------------------//


// 2) Efficient Approach (Optimised Euclidean Algorithm)

public class LCM6 {

    static int GCD(int a,int b){
        if(b==0){
            return a;
        }
        return GCD(b, a%b);
    }

    static int LCM(int a,int b){
      return (a*b)/GCD(a, b);
    }
    public static void main(String[] args) {
        int a=2,b=8;
        System.out.println(LCM(a, b));
    }
}

//Time Complexity: O(log(min(a,b))
