import java.util.Scanner;
public class avgof3nos {
    public static void avg(int a,int b,int c){
        int d=a+b+c;
        float avg=d/3;
        System.out.println("The average of all the 3 no.s is: "+avg);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        System.out.println("Enter c: ");
        int c=sc.nextInt();
        avg(a, b, c);
        
    }
}
