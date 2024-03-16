public class diamondpattern {
    public static void diamond(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=counter;k++){
                System.out.print("*");
                
            }
            System.out.println();
            counter=counter+2;
        }
        counter=counter-2;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=counter;k++){
                System.out.print("*");
                
            }
            System.out.println();
            counter=counter-2;
        }
    }
    public static void main(String[] args) {
        diamond(4);
    }
}
