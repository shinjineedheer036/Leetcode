class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            double temp = solve(x, (double) -1 * n);
            return 1/temp;
        }
        
        return solve(x,(double)n);
    }
    public double solve(double x, double nn){
        if(nn==0){ return 1;} 
        if(nn==1) return x;
        if(nn%2==0)return solve(x*x,nn/2);
        else return x * solve(x*x,(nn-1)/2);
    }
}