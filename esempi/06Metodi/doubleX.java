// Given a string, return true if the first instance of "x" in the string is immediately followed by another "x". 
boolean doubleX(String str) {
  int length = str.length();
  for (int i=0; i<length-1; i++) {
     if (str.charAt(i) == 'x') {
        if (str.charAt(i+1) == 'x') {
           return true;
        } else {
           return false;
        }
     }
  }
  return false;
}
