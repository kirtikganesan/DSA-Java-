public class practice{
    public static int binToDec(int binNum){
        int myNum=binNum;
        int decNum=0;
        int pow=0;
        while(binNum!=0){
            int lastDigit=binNum%10;
            decNum=decNum+(int)(Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        return decNum;
    }
    public static void main(String[] args) {
        System.out.println(binToDec(1111));
    }
}