class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int res = Integer.MAX_VALUE;
        int j = 0;
        boolean check = false;
        for(int i = 0; i < nums.length;i++){
            
            
            sum += nums[i];
            while(sum >=target){
                int len = i-j + 1;
            
                res = Math.min(res,len);
                
                sum = sum - nums[j];
                j++;
                check = true;
                
            }
        }
        if(check == true){
        return res;}
        else return 0;
    }
}