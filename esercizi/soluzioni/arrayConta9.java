// Dato un array di interi, ritorna il numero di 9 contenute nell'array. 
public int arrayConta9(int[] nums) {
  int conta9 = 0;
  int length = nums.length;
  
  for (int i=0; i<length; i++) {
     if(nums[i] == 9) {
        conta9 ++;
     }
  }
  
  return conta9;
}
