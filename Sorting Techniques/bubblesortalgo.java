public class bubblesortalgo{
    public static void bubblesort(int arr[]){
        int swaps=0;
        for(int turn=0;turn<arr.length-1;turn++){
            
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                }

            }
            if(swaps==0){
                System.out.println("Array is already sorted");
                return;
            }
        }
        System.out.println("The total number of swaps done is: "+swaps);

        for(int i=0;i<arr.length;i++){
            
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={6,7,8,9,1};
        bubblesort(arr);

    }
}