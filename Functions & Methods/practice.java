public class practice{
    public static int sumofdigits(int n){
        int sum=0;
        while(n!=0){
            int remainder=n%10;
            sum=sum+remainder;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumofdigits(456));
    }
}