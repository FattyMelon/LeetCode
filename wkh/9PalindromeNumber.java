public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int result = 0;
        int y = x;
        while(y!=0){
            int tail = y % 10;
            int newresult = tail + 10 * result;
            if((newresult-tail)/10 != result) {return false;}
            y = y/10;
            result = newresult;
        }
        if(result == x){
            return true;
        }
        return false;
    }
}