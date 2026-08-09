class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left=0;
        int right=nums1.length;

        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }

        while(left<=right){
            int half = (nums1.length+nums2.length+1)/2;
            int mid = left + (right-left)/2;
            int midB = half - mid;

            int leftA = (mid==0)? Integer.MIN_VALUE : nums1[mid-1];
            int rightA = (mid==nums1.length)? Integer.MAX_VALUE : nums1[mid];

            int leftB = (midB==0)? Integer.MIN_VALUE : nums2[midB-1];
            int rightB = (midB==nums2.length)? Integer.MAX_VALUE : nums2[midB];

            

            if(leftA <= rightB && leftB <= rightA){
                if((nums1.length+nums2.length)%2==0){
                    return (Math.max(leftA, leftB) + Math.min(rightA, rightB))/2.0;
                }else{
                    return Math.max(leftA,leftB);
                }
            } else if (leftB > rightA){
                left = mid+1;
            } else{
                right = mid -1;
            }
        }
        return -1;
    }
}
