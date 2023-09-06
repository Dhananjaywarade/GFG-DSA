/**
 * countDigit
 */
public class countDigit1 {

    static int countDigit(int x){
        int count=0;
        while (x>0) {
        x=x/10;
        count++;            
        }
        return count;
    }

    public static void main(String[] args) {
        int x=9235;
        System.out.println(countDigit(x)); 
    }
}


//time complexity is O(d) where d is the number of digits present in the number.

