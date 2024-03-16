public class hollowrhombuspattern {
    public static void hollowrhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                if(i==1 || i==5 || k==1 || k==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowrhombus(5);
    }
}
