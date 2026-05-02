class Solution {
    public int thirdMax(int[] nums) {
        long firstmax = Long.MIN_VALUE;
        long secmax = Long.MIN_VALUE;
        long thirdmax= Long.MIN_VALUE;

       for(int i=0;i<nums.length;i++){
            if(nums[i]>firstmax){
              thirdmax=secmax;
              secmax=firstmax;
              firstmax=nums[i];
            }
            else if(nums[i]>secmax && nums[i]!=firstmax){
              thirdmax=secmax;
              secmax=nums[i];
            }
            else if(nums[i]>thirdmax && nums[i]!=secmax && nums[i]!=firstmax){
              thirdmax=nums[i];
            }
       }
       if(thirdmax==Long.MIN_VALUE){
         return (int)firstmax;
       }
       return (int)thirdmax;
       
        
    }
}
