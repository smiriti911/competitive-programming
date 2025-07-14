class Solution {

    public void mergeSort(int [] arr, int left, int right){
          if (left < right) {
            int mid = (left + right) / 2;

            // Sort left and right halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    public void merge(int [] arr, int left, int mid, int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int[] L= new int[n1];
        int[] R= new int[n2];
        
        for(int i=0; i<n1; i++){
            L[i]=arr[left+i];
        }
        for(int j=0; j<n2; j++){
            R[j]=arr[mid+1+j];
        }
         int i = 0, j = 0, k = left;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
                k++;
            }else{
                arr[k]=R[j];
                j++;
                k++;
            }
        }

         while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
    public void sortColors(int[] nums) {

        int n=nums.length-1;
        mergeSort(nums, 0, n);
    }
}