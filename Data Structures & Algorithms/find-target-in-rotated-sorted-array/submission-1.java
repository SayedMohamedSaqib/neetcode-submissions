class Solution {
    public static int searchinArray(int[] arr, int tar, int si, int ei) {
        if(si > ei) {
            return -1;
        }
        int mid = si + (ei - si)/ 2;

        if(arr[mid] == tar) {
            return mid;
        }

        // case 1 : mid on L1
        if(arr[si] <= arr[mid]) {
            if(arr[si] <= tar && tar <= arr[mid]) {
                return searchinArray(arr, tar, si, mid - 1);
            }

            else {
                return searchinArray(arr, tar, mid + 1, ei);
            }
        }

        else {
            if(arr[mid] <= tar && tar <= arr[ei]) {
                return searchinArray(arr, tar, mid + 1, ei);
            }

            else {
                return searchinArray(arr, tar, si, mid - 1);
            }
        }
    }

    public int search(int[] nums, int target) {
        return searchinArray(nums, target, 0, nums.length - 1);
    }
}