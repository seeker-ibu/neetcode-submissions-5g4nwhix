class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            set.add(num);
        }
        int longest = 0;
        for(int i=0;i<nums.length ; i++){
            if(!set.contains(nums[i]-1)){
                int run =1;
                int val = nums[i]+1;
                while(set.contains(val)){
                    run++;
                    val++;
                }
                if(run > longest){
                    longest = run;
                }
            }
        }
        return longest;
    }
}
