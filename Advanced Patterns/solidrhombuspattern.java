public class solidrhombuspattern {
    public static void solidrhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solidrhombus(5);
    }
}
