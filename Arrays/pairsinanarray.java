public class pairsinanarray {
    public static void pairs(int numbers[]){
        int n=numbers.length;
        int totalpairs=(n*(n-1))/2;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.printf("(%d,%d)",numbers[i],numbers[j]);
            }
            System.out.println();
        }
        System.out.println("The total pairs present are: "+totalpairs);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        pairs(numbers);

    }
}
