class Solution {
    public void moveZeroes(int[] nums) {
     int n=nums.length;
     int temp=0;
     for(int i=0;i<n;i++){
        if(nums[i]!=0){
         nums[temp]=nums[i];
         temp++ ;  
        }
    } 
    while(temp<n){
        nums[temp]=0;
        temp++;
    }  
    }
}