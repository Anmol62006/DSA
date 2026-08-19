class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m =nums.length;
        int ans[]=new int[m];
        int a=0;
        int b=0;
        for (int i=0;i<m;i+=2){
            ans[i]=nums[b];
            ans[i+1]=nums[n+a];
           a++;
           b++;
     } 
     return ans;  
    }
}