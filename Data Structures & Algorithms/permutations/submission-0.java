class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        if(nums.length == 0) return new ArrayList();
        permutate(nums, new boolean[nums.length], new ArrayList<>(), output);
        return output;
    }

    public void permutate(int[] nums, boolean[] used, List<Integer> res, List<List<Integer>>output){
        if(res.size() == nums.length){
            output.add(new ArrayList<>(res));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(used[i]) continue;
            used[i] = true;
            res.add(nums[i]);
            permutate(nums, used, res,output);
            used[i] = false;
            res.remove(res.size()-1);
        }
    }
}
