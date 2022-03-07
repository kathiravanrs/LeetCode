class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d = arr[1] - arr[0];
        int prev = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] - prev != d) return false;
            prev = arr[i];
        }
        return true;
    }
}