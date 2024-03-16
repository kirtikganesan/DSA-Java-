import java.util.Scanner;

public class binomialcoefficient {
    public static int calculateFactorial(int a){
        int factorial=1;
        for(int i=a;i>=1;i--){
            factorial=factorial*i;
        }
        return factorial;
    }
    public static void calculateBC(int n,int r){
        int nfac=calculateFactorial(n);
        int rfac=calculateFactorial(r);
        int nminusr=n-r;
        int nminusrfac=calculateFactorial(nminusr);
        int BC=(nfac)/(rfac*nminusrfac);
        System.out.println("The binomial coefficient of n and r is: "+BC);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        System.out.println("Enter r: ");
        int r=sc.nextInt();
        calculateBC(n, r);
    }
}
