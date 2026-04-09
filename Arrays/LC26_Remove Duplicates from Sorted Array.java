import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        //Initially set j value is 0
        int j=0;
        //Iterate through the array from index 1 to n-1
        for(int i=1;i<nums.length;i++){
            //if current element is differ from last unique element
            if(nums[i]!=nums[j]){
                //move j to next position
                j++;
                //place the new unique element at index j
                nums[j]=nums[i];
                
            }
        }
        //return number of unique elements
        return j+1;

        
    }
}
