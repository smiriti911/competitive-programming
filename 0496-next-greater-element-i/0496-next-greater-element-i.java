class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int []ans=new int[n1];
        int index=0;

        for (int i=0; i<n1; i++){
            for (int j=0; j<n2; j++){
                if(nums1[i]==nums2[j]){
                    index=j;
                }
            }
            ans[i]=-1;
            for(int j=index+1; j<n2; j++){
                if(nums1[i]<nums2[j]){
                    ans[i]=nums2[j];
                    break;
                }
            }
        }

        return ans;
        
    }
}