import java.util.Scanner;

public class functionoverloading {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of values:(2 or 3) ");
        int n=sc.nextInt();
        if(n==2){
            System.out.println("Enter a: ");
            int a=sc.nextInt();
            System.out.println("Enter b: ");
            int b=sc.nextInt();
            System.out.println("The sum is: "+sum(a, b));
        }
        else if(n==3){
            System.out.println("Enter a: ");
            int a=sc.nextInt();
            System.out.println("Enter b: ");
            int b=sc.nextInt();
            System.out.println("Enter c: ");
            int c=sc.nextInt();
            System.out.println("The sum is: "+sum(a, b,c));
        }
        else{
            System.out.println("Invalid input....Input either 2 or 3!!");
        }
    }
}
