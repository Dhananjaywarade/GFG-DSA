/*

If the Reversed Number is equal to the original number, 
then the number is said to be a palindrome number, otherwise not.

*/


public class palindromeNumber2 {

    static boolean palindromeNumber2(int num){
        int rev=0;
        int n=num;
        while (num>0) {
            rev=(rev*10)+(num%10);
            num=num/10;
        }
     return (rev==n);
    }
    public static void main(String[] args) {
        int num=121;
        System.out.println(palindromeNumber2(num));
    }
}

//time complexity is O(d) where d is the number of digits present in the number.
