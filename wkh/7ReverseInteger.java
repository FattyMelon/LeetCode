public class Solution {
    public int reverse(int x) {
        int result = 0;
        while(x != 0){
            int tail = x % 10;
            int newresult = tail + result * 10;
            if((newresult-tail)/10 != result){
                return 0;
            }
            result = newresult;
            x = x / 10;
        }
        return result;
        
    }
}