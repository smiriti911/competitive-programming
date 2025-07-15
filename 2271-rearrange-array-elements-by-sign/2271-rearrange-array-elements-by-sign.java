class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n=nums.length;
        int [] positive=new int [n/2];
        int [] negative=new int [n/2];
        int j=0;
        int k=0;
        for(int i=0; i<n; i++){
            if(nums[i]>=0){
                positive[j]=nums[i];
                j++;
            }else{
                negative[k]=nums[i];
                k++;
            }
        }
        int p=0;
        int q=0;
        for(int i=0; i<n; i++){
            if(i%2==0){
                nums[i]=positive[p];
                p++;
            }
            else{
                nums[i]=negative[q];
                q++;
            }
        }

        return nums;
    }
}