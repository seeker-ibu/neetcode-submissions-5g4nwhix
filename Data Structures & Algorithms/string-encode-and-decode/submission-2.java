class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        if(strs.isEmpty()){
            return null;
        }
        for(String s : strs){
            String len = s.length() +"";
            sb.append(len);
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> s = new ArrayList<String>();
        int i =0;
        if(str ==  null){
            return s;
        }
        if(str.equals("")){
            s.add("");
            return s;
        } 
        while(i < str.length()){
            int j = i;
            while(str.charAt(j)!='#'){
                j++;
            }

            Integer len = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j+1,j+1+len);

            s.add(word);
            
            i= j+1+len;
         }
         return s;
    }
         
}
