/*T =O(n^2)*/

int lengthOfLongestSubstring(char* s) {
        int max = 0;  
        int len = strlen (s);  
        if( len < 0) return 0;  
        if( len == 1) return 1;
        int pre = 1; 
        for(int i = 1; i < len; i++)  
        {  
            char t = s[i];  
            int j = i-1;  
            int count = 1;  
            while((j>=0) && ( s[j]!= t))  
            {j--;count++;}  
            if(count > pre) count = pre+1;  
            if(count > max) max = count;  
            pre = count;  
        }  
        return max;  
    }  
