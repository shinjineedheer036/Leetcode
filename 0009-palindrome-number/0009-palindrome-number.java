class Solution {
    public boolean isPalindrome(int x) {
        int a=0;
        if(x<0){
            return false;
        }
        int m=x;
        while(m!=0){
            a++;
            m=m/10;
        }
        int news =0;
        int mul=1;
        int temp=x;
        while(x!=0){
            int n=x%10;
            news=news*10+n;
            x=x/10;
        }
        if(news==temp){
            return true;
        }
        else{
            return false;
        }
    }
}