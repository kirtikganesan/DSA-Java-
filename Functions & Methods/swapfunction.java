import java.util.Scanner;

public class swapfunction{
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("The swapped value of a is: "+a);
        System.out.println("The swapped value of b is: "+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        swap(a, b);
        //Call by value::
        //It means that the changes made in the values is limited to the function itself 
        System.out.println("The entered value of a is : "+a);
        System.out.println("The entered value of b is: "+b);
    }
}