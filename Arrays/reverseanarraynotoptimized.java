public class reverseanarraynotoptimized {
    public static void reverse(int numbers[]){
        int newNumbers[]=new int[numbers.length];
        int j=0;
        for(int i=numbers.length-1;i>=0;i--){
            newNumbers[j]=numbers[i];
            j++;
        }
        for(int i=0;i<newNumbers.length;i++){
            System.out.print(newNumbers[i] + " ");
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,78,90,189};
        reverse(numbers);
        
    }
}
