class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 1) return List.of(List.of(strs[0]));
        Map<String,List<String>> m = new HashMap<>();
        for(String s : strs){
            char [] ar = s.toCharArray();
            Arrays.sort(ar);
            String key = new String(ar);
            m.putIfAbsent(key, new ArrayList<>());
            m.get(key).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
