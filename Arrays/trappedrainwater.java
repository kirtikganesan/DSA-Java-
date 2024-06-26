public class trappedrainwater {
    public static void trappedRainwaterfunc(int height[]){
        int n=height.length;
        //calculate left max boundary
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //calculate right max boundary
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        int trappedwater=0;
        int width=1;
        for(int i=0;i<n;i++){
            //water level=min(leftmax,rightmax)
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedwater+=(waterlevel-height[i]) * width;
        }
        System.out.println("The total amount of water trapped is: " + trappedwater + " units..");
        //trappedwater=(water level - height) * width
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        trappedRainwaterfunc(height);

    }
}
