public class numberpyramidpattern {
    public static void numberpyramid(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(counter + " ");
            }
            System.out.println();
            counter++;
        }
    }
    public static void main(String[] args) {
        numberpyramid(5);
    }
}
