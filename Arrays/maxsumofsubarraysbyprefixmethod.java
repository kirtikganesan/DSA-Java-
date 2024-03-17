public class maxsumofsubarraysbyprefixmethod {
    public static void maxsum(int numbers[]){
        int maxsum=Integer.MIN_VALUE;
        int prefixsum[]=new int[numbers.length];
        int currentsum;
        prefixsum[0]=numbers[0];
        for(int i=1;i<prefixsum.length;i++){
            prefixsum[i]=prefixsum[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                if(i==0){
                    currentsum=prefixsum[j];
                }
                else{

                    currentsum=prefixsum[j]-prefixsum[i-1];
                }
                if(currentsum>maxsum){
                    maxsum=currentsum;
                }
            }
        }
        System.out.println("The maximum sum from all the subarrays is: "+maxsum);

    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        maxsum(numbers);
    }
}
