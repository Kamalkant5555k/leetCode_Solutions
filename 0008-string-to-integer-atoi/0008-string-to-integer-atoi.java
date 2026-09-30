class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        int i=0;
        boolean neg=false;
        long num=0;
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i<n && s.charAt(i)=='-'){
            neg=true;
            i++;
        }
        else if(i<n && s.charAt(i)=='+'){
            i++;
        
        }
        
        while(i<n){
            char c=s.charAt(i);
           if(c>='0' && c<='9'){
                int digit=c-'0';
                num=num*10;
                num=num+digit;
                                if (!neg && num > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }

                if (neg && -num < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }

            }else{
                break;
            }
            
            i++;
        }
        if(neg){
            return (int)-num;
        }
        return (int)num;
        
    }
}