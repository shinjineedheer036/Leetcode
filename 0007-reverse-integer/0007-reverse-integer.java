class Solution {
    public int reverse(int x) {
        long ans=0;
        int n=x;
        if(x<0){
            n=n*(-1);
        }
        while(n > 0){
            int rem=n%10;
            ans=ans*10+rem;
            n=n/10;
        }
        if(x<0){
            ans=ans*(-1);
        }
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE){
               return 0;
        }
        return (int) ans;
    }
}