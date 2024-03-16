import java.util.Scanner;

public class findfactorial {
    public static void calculateFactorial(int n){
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println("The factorial of n is: "+factorial);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        calculateFactorial(n);
        
    }
}
