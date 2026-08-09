class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftArray = new int[nums.length];
        int[] rightArray = new int[nums.length];
        int[] outputArray = new int[nums.length];
        leftArray[0] = 1;
        rightArray[nums.length-1] = 1;
        for(int i=1; i<leftArray.length; i++){
            leftArray[i] = leftArray[i-1] * nums[i-1];
        }
        for(int j=nums.length-2; j>=0; j--){
            rightArray[j] = rightArray[j+1] * nums[j+1];
        }
        for(int k=0;k<nums.length;k++){
            outputArray[k] = rightArray[k] * leftArray[k];
        }
        return outputArray;
    }
}  
