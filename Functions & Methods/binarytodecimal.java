import java.util.Scanner;

public class binarytodecimal {
    public static void bintoDec(int binNum){
        int myNum=binNum;
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int lastDigit=binNum%10;
            decNum=decNum+(lastDigit*(int)(Math.pow(2,pow)));
            pow++;
            binNum=binNum/10;
        }
        System.out.printf("The decimal value of %d is %d",myNum,decNum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        bintoDec(n);
    }
}
