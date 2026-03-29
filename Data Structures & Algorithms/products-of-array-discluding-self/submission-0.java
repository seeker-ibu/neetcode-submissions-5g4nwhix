class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount=0;
        int product=1;
        for(int num: nums){
            if(num!=0){
                product=num*product;
            }else{
                zeroCount++;
            }
        }

        if(zeroCount>1){
            return new int[nums.length];
        }
        int []  res = new int[nums.length];
        for(int i=0; i< nums.length;i++){
            if(nums[i]==0 & zeroCount ==1){
                 res[i]=product;
                 return res;
            }
            if(zeroCount==0){
                res[i]=product/nums[i];
            }
        }
        return res;
    }
}  
