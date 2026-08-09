class Solution {
    public int trap(int[] height) {
        if (height == null || height.length <= 2) {
            return 0; // Cannot trap any water with fewer than 3 heights
        }
        int totalWater =0;

        int[] leftArray = new int[height.length];
        int[] rightArray = new int[height.length];
        
        leftArray[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftArray[i]=Math.max(leftArray[i-1],height[i]);
        }
        rightArray[height.length-1] = height[height.length-1];
        for(int j=height.length-2;j>=0;j--){
            rightArray[j]=Math.max(height[j],rightArray[j+1]);
        }
        for(int k=0;k<height.length;k++){
            totalWater += Math.min(leftArray[k],rightArray[k])-height[k];           
        }
        
        return totalWater;
    }
}
