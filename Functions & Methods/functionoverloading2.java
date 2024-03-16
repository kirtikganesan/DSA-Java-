import java.util.Scanner;

public class functionoverloading2 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the datatype: (0 for integer and 1 for float)");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Enter integer a: ");
            int a=sc.nextInt();
            System.out.println("Enter integer b: ");
            int b=sc.nextInt();
            System.out.println("The sum is: "+sum(a,b));
        }
        else if(n==1){
            System.out.println("Enter float a: ");
            float a=sc.nextFloat();
            System.out.println("Enter float b: ");
            float b=sc.nextFloat();
            System.out.println("The sum is: "+sum(a,b));
        }
        else{
            System.out.println("Invalid input...Enter either 0 or 1!!");
        }
    }
}
