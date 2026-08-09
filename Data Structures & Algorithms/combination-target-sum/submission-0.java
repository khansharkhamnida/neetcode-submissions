class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<>();
        if(nums.length == 0) return output;
        combine(0, nums, target,output,new ArrayList<>());
        return output;
    }
    public void combine(int index, int[] nums, int target, List<List<Integer>> output, List<Integer> res){
        if(target==0){
            output.add(new ArrayList<>(res));
            return;
        }
        for(int i=index; i<nums.length; i++){
            if(target-nums[i] >=0){
                res.add(nums[i]);
                combine(i, nums, target-nums[i],output,res);
                res.remove(res.size()-1);
            }
        }
    }
}
