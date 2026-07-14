class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=numRows;
        for(int i=1;i<=n;i++){
            List<Integer> ll=new ArrayList<>();
            int res=1;
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1){
                    ll.add(1);
                }
                else{
                    res=res*(i-j);
                    res=res/(j);
                    ll.add(res);
                }
            }
            ans.add(ll);
        }
        return ans;
    }
}
