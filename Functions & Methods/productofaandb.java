import java.util.Scanner;

public class productofaandb {
    public static void calculateProduct(int a,int b){
        int product=a*b;
        System.out.println("The product of a and b is: "+product);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        calculateProduct(a, b);

    }
}
