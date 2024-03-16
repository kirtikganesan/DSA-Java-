import java.util.Scanner;

public class palindromeornot {
    public static boolean isPalindrome(int n){
        int palindrome=n;
        int reverse=0;
        while(palindrome!=0){
            int remainder=palindrome%10;
            reverse=reverse*10+remainder;
            palindrome=palindrome/10;
        }
        if(n==reverse){
            return true;
        }
        else{
            return false;
        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        if(isPalindrome(n)){
            System.out.println("Number is a palindrome");
        }
        else{
            System.out.println("Number is not a palindrome");
        }
    }
}
