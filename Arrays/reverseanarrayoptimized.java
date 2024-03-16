public class reverseanarrayoptimized {
    public static void reversearray(int numbers[]){
        int first=0;
        int last=numbers.length-1;
        int temp;
        while(first<last){
            temp=numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=temp;
            first++;
            last--;
        }
        
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        reversearray(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        
    }
}
