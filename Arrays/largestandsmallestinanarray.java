public class largestandsmallestinanarray {
    public static int largestnumber(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static int smallestNumber(int numbers[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[]={10,30,23,43,76,987,748};
        int largest=largestnumber(numbers);
        int smallest=smallestNumber(numbers);
        System.out.println("The largest no. in the given array is: "+largest);
        System.out.println("The smallest no. in the given array is: "+smallest);
    }
}
