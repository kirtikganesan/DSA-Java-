public class binarysearchinarrays {
    public static int binarySearch(int numbers[],int key){
        int start=0,end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,5,6,7,8,9,10};
        int key=2;
        int index=binarySearch(numbers, key);
        if(index==-1){
            System.out.println("Key is not present in the array");
        }
        else{

            System.out.println("Key is present at index: "+index);
        }

    }
}
