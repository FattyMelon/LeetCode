public class Solution {
    public String reverseVowels(String s) {
        char[] result = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            while(start<end&&!vowels.contains(result[start]+"")){
                start++;
            }
            while(start<end&&!vowels.contains(result[end]+"")){
                end--;
            }
            char temp = result[start];
            result[start] = result[end];
            result[end] = temp;
            start++;
            end--;
        }
        return new String(result);
        
    }
}