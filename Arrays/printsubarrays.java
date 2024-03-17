public class printsubarrays {
    public static void subArrays(int numbers[]){
        int n=numbers.length;
        int totalcount=(n*(n+1))/2;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k] + " ");
                }
            System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total number of subarrays is: "+totalcount);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        subArrays(numbers);
    }
}
