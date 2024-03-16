import java.util.Scanner;

public class mathclassmethods {
    public static int minValue(int a,int b){
        return Math.min(a, b);
    }
    public static int maxValue(int a,int b){
        return Math.max(a, b);
    }
    public static float sqrt(int a){
        return (float)Math.sqrt(a);
    }
    public static int powValue(int a,int b){
        return (int)Math.pow(a, b);
    }
    public static float avgValue(int a,int b){
        int c=a+b;
        float avg=c/2;
        return avg;
    }
    public static float absValue(int a){
        return Math.abs(a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        System.out.println(minValue(a, b));
        System.out.println(maxValue(a, b));
        System.out.println(sqrt(a));
        System.out.println(powValue(a, b));
        System.out.println(avgValue(a, b));
        System.out.println(absValue(a));

    }
}
