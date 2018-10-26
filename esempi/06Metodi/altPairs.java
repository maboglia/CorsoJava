// Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien". 
public String altPairs(String str) {
   String result = "";
   int length = str.length();
   
   for(int i=0; i<length; i++) {
      if (i%4 == 0) {
         if (i+1 < length) {
            result += str.substring (i, i+2);
         } else {
            result += str.charAt(i);
         }
      }
   } 
   
   return result;
}
