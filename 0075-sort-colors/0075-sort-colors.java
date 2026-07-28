class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=0;
        while(k<=j){
            if(nums[k]==2){
                swap(k,j,nums);
                j--;
            }
            else if(nums[k]==0){
                swap(k,i,nums);
                i++;
                k++;
            }
            else{
                k++;
            }
        }
    }
    public static void swap(int k,int i,int[] nums){
        int temp=nums[k];
        nums[k]=nums[i];
        nums[i]=temp;
    }
}