
// sort array of strings 是字典排序



public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        if(strs!=null && strs.length>0){    
            char a[] = strs[0].toCharArray();
            char b[] = strs[strs.length-1].toCharArray();
            for(int i = 0; i<a.length;i++){
                if(i<b.length && a[i]==b[i]){
                    result.append(a[i]);
                }
                else{
                    return result.toString();
                }
            }
        }
        return result.toString();
    }    
}