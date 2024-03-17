public class maxsumofsubarraysbybruteforce {
    public static void sumOfSubArrays(int numbers[]){
        int currentsum;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        int n=numbers.length;
        int totalcount=(n*(n+1))/2;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                currentsum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+ " ");
                    currentsum=currentsum+numbers[k];
                    if(currentsum>maxsum){
                        maxsum=currentsum;
                    }
                    if(currentsum<minsum){
                        minsum=currentsum;
                    }
                }
                System.out.print("Sum = "+currentsum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total count of subarrays is: "+totalcount);
        System.out.println("The max sum is: "+maxsum);
        System.out.println("The min. sum is: "+minsum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        sumOfSubArrays(numbers);

    }
}
