class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max_so_far = -1;
        //start for loop from n-1 to 0
        for(int i = n - 1; i >= 0; i--){
            int current_val = arr[i];
            arr[i] = max_so_far;
            max_so_far = Math.max(max_so_far, current_val);
        }
        return arr;
    }
}