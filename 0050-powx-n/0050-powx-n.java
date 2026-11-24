class Solution {
    public double myPow(double x, int n) {
        // return solve(x,(long)n);
        return Math.pow(x, n);
    }
    // public double solve(double x, long nn){
    //     if(nn==0){ return 1.0; }
    //     if(nn<0){
    //         return solve(1.0/x, -nn);
    //     }

    //     if(nn%2==0){
    //         return solve(x*x,nn/2);
    //     }
    //     return solve(x*x,(nn-1)/2)*x;
    // }
}