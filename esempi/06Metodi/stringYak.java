// Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. 
// The "yak" strings will not overlap. 
public String stringYak(String str) {
  String result = "";
  int length = str.length();
  if (length<3) {
     return str;
  }
  for(int i=0; i<length; i++) {
     if(i<length-2 && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
        i += 2;
     } else {
        result += str.charAt(i);
     }
  }
  
  return result;
}
