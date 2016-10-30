public class Solution {
    public String convert(String s, int numRows) {
        if(numRows<=1) return s;
        StringBuilder result = new StringBuilder();
        int len = s.length();
        int step1 = 2*(numRows-1);
        for(int i = 0; i<numRows; i++){
            for(int j = i; j<len; j+=step1){
                result.append(s.charAt(j));
                if(i != 0 && i != numRows-1 && j+step1-2*i < len)
                result.append(s.charAt(j+step1-2*i));
            }
        }
        return result.toString();
        
        
        
    }
}
// from Cohan