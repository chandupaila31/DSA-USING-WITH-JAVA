class Solution {
    public int searchInsert(int[] nums, int target) {
        // Iterate through the array from index 0 to n-1
        for(int i = 0; i < nums.length; i++){
            
            // Check if the current element is equal to the target
            if(nums[i] == target){
                // If equal, return the index
                return i;
            }
            
            // Check if the current element is greater than the target
            else if(nums[i] > target){
                // If greater, return the current index (insert position)
                return i;
            }
        }
        
        // If target is greater than all elements, return array length (insert at end)
        return nums.length;
    }
}
