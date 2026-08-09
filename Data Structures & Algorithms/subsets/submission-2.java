class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        helper(nums, 0, output, new ArrayList<Integer>());
        return output;
    }

    public List<List<Integer>> helper(int[] nums, int index, List<List<Integer>> output, List<Integer> cur){
        output.add(new ArrayList<>(cur));
        for(int i=index; i<nums.length; i++){
            cur.add(nums[i]);
            helper(nums, i+1, output, cur);
            cur.remove(cur.size()-1);
        }
        return output;
    }
}
