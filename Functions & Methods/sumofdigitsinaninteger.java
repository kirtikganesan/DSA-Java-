import java.util.Scanner;
public class sumofdigitsinaninteger {
    public static int sum(int n){
        int sum=0;
        while(n!=0){
            int remainder=n%10;
            sum=sum+remainder;
            n=n/10;

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        System.out.println(sum(n));

    }
}
