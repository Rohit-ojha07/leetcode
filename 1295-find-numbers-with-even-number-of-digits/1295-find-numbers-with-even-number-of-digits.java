class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int digit=-1;
        for(int i=0;i<nums.length;i++){
            digit=(nums[i]==0)?1:(int)Math.log10(nums[i])+1;
            if(digit%2==0){
                count++;
            }
        }
        return count;
        
    }
}