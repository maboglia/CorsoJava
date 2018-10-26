// Given an array of ints, return the number of 9's in the array. 
public int arrayCount9(int[] nums) {
  int count9 = 0;
  int length = nums.length;
  
  for (int i=0; i<length; i++) {
     if(nums[i] == 9) {
        count9 ++;
     }
  }
  
  return count9;
}
