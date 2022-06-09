// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         for (int i = 0; i < numbers.length - 1; i++) {
//             for (int j = i + 1; j < numbers.length; j++) {
//                 if (numbers[i] + numbers[j] == target) return new int[] { i + 1, j + 1 };
//             }
//         }
//         return null;
//     }
// }
class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        while(numbers[i]+numbers[j]!=target){
            if(numbers[i]+numbers[j] > target ) j--;
            else i++;
        }
        return new int[]{i+1,j+1};
    }
}