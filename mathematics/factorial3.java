/*
iterative solution :- 

public class factorial3 {

    static int factorial3(int num){
      int res=1;
      for(int i=2;i<=num;i++){
        res=res*i;
      }
      return res;
    }

    public static void main(String[] args) {
        int num=4;
        System.out.println(factorial3(num));
    }
}
 time complexity is O(n)
 auxilary space is O(1)

*/


// Recursive Approach
public class factorial3 {

    static int factorial3(int num){
     if(num==0){
        return 1;
     }
     return num*factorial3(num-1);
    }

    public static void main(String[] args) {
        int num=4;
        System.out.println(factorial3(num));
    }
}

// time complexity : O(n)
// auxilary space : O(n)

// hence iterative solution is better than  Recursive Approach