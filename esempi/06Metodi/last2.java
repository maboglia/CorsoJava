// Given a string, return the count of the number of times that a substring length 2 appears in the string and 
// also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring). 
public int last2(String str) {
  int count = 0;
  int length = str.length();
  
  if(length < 2) {
     return 0;
  }
  
  String last2Char = str.substring(length-2, length);
  
  for (int i=0; i<length-2; i++) {
     if(str.substring(i, i+2).equals(last2Char)) {
        count++;
     }
  }
  
  return count;
}
