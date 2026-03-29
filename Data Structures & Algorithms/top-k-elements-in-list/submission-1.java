class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> [] b = new List[nums.length+1];
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int num : nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }

        for(int i=0;i<=nums.length;i++){
            b[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry : m.entrySet()){
            b[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = b.length - 1; i > 0 && index < k; i--) {
            for (int n : b[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
 }
}
