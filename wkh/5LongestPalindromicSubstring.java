// 时间复杂度在n平方到nlogn之间
//这题和上课讲的求longest subsequent palindrome不同，substring是对每一个char向两边延伸，subsequent是首尾指针向中间走。

public class Solution {
    int maxlen;
    int start;
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len<2) return s;
        for(int i = 0; i < len-1; i++){     // 注意这里是循环到倒数第二位。否则extend(s,i,i+1)越界。
            extendPalindromic(s,i,i);
            extendPalindromic(s,i,i+1);
        }
        return s.substring(start, start+maxlen);
    }
    
    private void extendPalindromic(String s, int j, int k){
        while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)){
                j--;
                k++;
            }
        if(maxlen < k-j+1-1-1){   //注意这里的maxlen值应该为k-j+1-2,因为while中执行过k++，j++
            maxlen = k-j-1;
            start = j+1;
        }
        }
    }