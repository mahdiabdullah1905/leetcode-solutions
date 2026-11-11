class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
         int closest = Integer.MAX_VALUE;
        int finalSum = 0;
        for(int i =0;i<nums.length -1;i++){
            int j = i+1;
            int k = nums.length-1;
           
            

            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                int difference = Math.abs(sum - target);
                if(sum < target){
                    j++;
                    if(difference < closest){
                    closest = difference; 
                    finalSum = sum;
                    }
                    
                }
                else if (sum > target){
                    k--;
                     if(difference < closest){
                    closest = difference; 
                    finalSum = sum;
                    }
                }
                else return sum;
            }
        }
        return finalSum;
    }
}