class Solution {
    public int maxArea(int[] heights) {
        int mostWaterContainer = 0;
        for(int i=0; i<heights.length-1; i++){
            int left=i;
            int right=heights.length-1;
            while(left<right){
                int area = Math.min(heights[left],heights[right])*(right-left);
                mostWaterContainer = Math.max(mostWaterContainer,area);
                if(heights[left]< heights[right]){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return mostWaterContainer;
    }
}
