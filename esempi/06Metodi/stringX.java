// Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed. 
public String stringX(String str) {
  int length = str.length();
  if (length <= 2) {
     return str;
  }
  
  char first = str.charAt(0);
  char last = str.charAt(length-1);
  String middle= "";
  
  for (int i=1; i<length-1; i++) {
     if(str.charAt(i) != 'x') {
        middle += str.charAt(i);
     }
  }
  
  return first+middle+last;
}
