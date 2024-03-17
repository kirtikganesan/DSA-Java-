public class maxsumofsubarraysbykadanes {
    public static void kadanes(int numbers[]){
        int maxsum=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            maxsum=Math.max(cs,maxsum);
        }
        System.out.println("The maximum sum of the subarray is: "+maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
}
