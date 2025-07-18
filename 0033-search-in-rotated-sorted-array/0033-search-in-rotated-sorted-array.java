class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int pivot = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid < right && nums[mid] > nums[mid + 1]) {
                pivot = mid + 1;
                break;
            }

            if (mid > left && nums[mid - 1] > nums[mid]) {
                pivot = mid;
                break;
            }

            if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

         left=pivot;
         right=nums.length-1;

        while(left<=right){
            int mid= left+(right-left)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        right=pivot-1;
        left=0;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }

        }
      return -1;
    }
}