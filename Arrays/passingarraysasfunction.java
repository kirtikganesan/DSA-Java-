public class passingarraysasfunction {
    public static void update(int marks[],int nonChangable){
        nonChangable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={67,60,89,98,56};
        int nonChangable=5;
        System.out.println(nonChangable);
        update(marks,nonChangable);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
