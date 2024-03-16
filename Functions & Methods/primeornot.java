import java.util.Scanner;

public class primeornot {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        System.out.println(isPrime(n));
    }
}
