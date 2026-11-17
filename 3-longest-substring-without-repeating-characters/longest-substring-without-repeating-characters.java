class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> map = new HashSet<>();
        int res = 0;

       
        int low = 0;

        for(int high = 0; high< s.length();high++){
            int len = high - low +1;
            if(!map.contains(s.charAt(high))){
                map.add(s.charAt(high));
                
                res = Math.max(len,res);
                
            }
            else{
            
            
            while(map.contains(s.charAt(high))){
                
                map.remove(s.charAt(low));
                low++;
                
                
                len = high - low +1;
                
            }
            map.add(s.charAt(high));
            }
           
        }
        return res;
    }
}